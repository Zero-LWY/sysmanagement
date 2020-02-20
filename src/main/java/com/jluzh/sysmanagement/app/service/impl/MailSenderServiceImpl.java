package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.MailSenderService;
import com.jluzh.sysmanagement.app.service.MsgLogService;
import com.jluzh.sysmanagement.config.RabbitConfig;
import com.jluzh.sysmanagement.domain.entity.Mail;
import com.jluzh.sysmanagement.domain.entity.MsgLog;
import com.jluzh.sysmanagement.infra.mq.MessageHelper;
import com.jluzh.sysmanagement.infra.util.JedisUtil;
import com.jluzh.sysmanagement.infra.util.RandomUtil;
import com.jluzh.sysmanagement.infra.util.Results;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * <p>email服务类实现</p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName MailSenderServiceImpl.java
 * @createTime 2020年01月08日 16:12:00
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MailSenderServiceImpl implements MailSenderService {

	private final MsgLogService msgLogService;
	private final RabbitTemplate rabbitTemplate;
	@Autowired
	private  JedisUtil jedisUtil;

	@Override
	public ResponseEntity<String> resetPasswordSend(String mailAddress) {
		String msgId = RandomUtil.uuid32();
		Mail mail = new Mail();
		mail.setMsgId(msgId);
		mail.setTo(mailAddress);
		mail.setTitle("密码重置");
		String content = RandomUtil.generateDigitalStr(6);
		mail.setContent("密码重置验证码:"+content+",15分钟内输入有效.");

		MsgLog msgLog = new MsgLog(msgId,mail, RabbitConfig.MAIL_EXCHANGE_NAME,RabbitConfig.MAIL_ROUTING_KEY_NAME);
		msgLogService.insertSelective(msgLog);

		CorrelationData correlationData = new CorrelationData(msgId);
		// 发送消息
		rabbitTemplate.convertAndSend(RabbitConfig.MAIL_EXCHANGE_NAME, RabbitConfig.MAIL_ROUTING_KEY_NAME, MessageHelper.objToMsg(mail), correlationData);
		jedisUtil.set(mailAddress,content,60*15);
		return Results.success("邮件发送成功");
	}
}
