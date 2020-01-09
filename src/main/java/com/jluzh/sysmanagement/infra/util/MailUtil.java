package com.jluzh.sysmanagement.infra.util;

import com.jluzh.sysmanagement.domain.entity.Mail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * <p>邮箱返送简单类 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName MainlUtil.java
 * @createTime 2020年01月08日 14:59:00
 */
@Component
@Slf4j
public class MailUtil {

	@Value("${spring.mail.from}")
	private String from;

	@Autowired
	private JavaMailSender mailSender;

	public boolean send(Mail mail){
		String to = mail.getTo();
		String title = mail.getTitle();
		String content = mail.getContent();
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(from);
		message.setTo(to);
		message.setSubject(title);
		message.setText(content);
		try {
			mailSender.send(message);
			log.info("邮件发送成功");
			return true;
		}catch (MailException e){
			log.error("邮件发送失败,to:{},title:{}",to,title);
			log.error("失败原因:{}",e.getMessage());
			return false;
		}
	}
}
