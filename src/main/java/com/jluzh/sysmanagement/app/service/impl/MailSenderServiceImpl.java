package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.MailSenderService;
import com.jluzh.sysmanagement.app.service.MsgLogService;
import com.jluzh.sysmanagement.config.RabbitConfig;
import com.jluzh.sysmanagement.domain.entity.Mail;
import com.jluzh.sysmanagement.domain.entity.MsgLog;
import com.jluzh.sysmanagement.infra.mq.MessageHelper;
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

	@Override
	public ResponseEntity<String> send(Mail mail) {
		String msgId = RandomUtil.uuid32();
		mail.setMsgId(msgId);

		MsgLog msgLog = new MsgLog(msgId,mail, RabbitConfig.MAIL_EXCHANGE_NAME,RabbitConfig.MAIL_ROUTING_KEY_NAME);
		msgLogService.insertSelective(msgLog);

		CorrelationData correlationData = new CorrelationData(msgId);
		// 发送消息
		rabbitTemplate.convertAndSend(RabbitConfig.MAIL_EXCHANGE_NAME, RabbitConfig.MAIL_ROUTING_KEY_NAME, MessageHelper.objToMsg(mail), correlationData);

		return Results.success("邮件发送成功");
	}
}
