package com.jluzh.sysmanagement.infra.mq.consumer;

import com.jluzh.sysmanagement.config.RabbitConfig;
import com.jluzh.sysmanagement.domain.entity.Mail;
import com.jluzh.sysmanagement.domain.entity.MsgLog;
import com.jluzh.sysmanagement.domain.repository.MsgLogRepository;
import com.jluzh.sysmanagement.infra.constant.Constant;
import com.jluzh.sysmanagement.infra.mq.MessageHelper;
import com.jluzh.sysmanagement.infra.util.MailUtil;
import com.rabbitmq.client.Channel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * <p> 邮件消费者 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName EmailConsumer.java
 * @createTime 2020年01月08日 16:37:00
 */
@Component
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EmailConsumer {

	private  final MsgLogRepository msgLogRepository;

	private final MailUtil mailUtil;


	@RabbitListener(queues = RabbitConfig.MAIL_QUEUE_NAME)
	public void consume(Message message, Channel channel) throws IOException {
		Mail mail = MessageHelper.msgToObj(message, Mail.class);
		log.info("收到消息: {}", mail.toString());

		String msgId = mail.getMsgId();

		MsgLog msgLog = msgLogRepository.selectByMsgId(msgId);
		// 消费幂等性
		if (null == msgLog || msgLog.getStatus().equals(Constant.MsgLogStatus.CONSUMED_SUCCESS)) {
			log.info("重复消费, msgId: {}", msgId);
			return;
		}

		MessageProperties properties = message.getMessageProperties();
		long tag = properties.getDeliveryTag();

		boolean success = mailUtil.send(mail);
		if (success) {
			msgLogRepository.updateStatus(msgId, Constant.MsgLogStatus.CONSUMED_SUCCESS);
			// 消费确认
			channel.basicAck(tag, false);
		} else {
			channel.basicNack(tag, false, false);
		}
	}

}
