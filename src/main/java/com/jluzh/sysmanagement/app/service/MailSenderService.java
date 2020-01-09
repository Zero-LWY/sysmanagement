package com.jluzh.sysmanagement.app.service;

import com.jluzh.sysmanagement.domain.entity.Mail;
import org.springframework.http.ResponseEntity;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName MailSenderService.java
 * @createTime 2020年01月08日 16:11:00
 */
public interface MailSenderService {

	ResponseEntity<String> send(Mail mail);
}
