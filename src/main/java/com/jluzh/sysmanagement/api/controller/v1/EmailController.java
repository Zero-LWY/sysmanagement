package com.jluzh.sysmanagement.api.controller.v1;

import com.jluzh.sysmanagement.app.service.MailSenderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p> email controller </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName EmailController.java
 * @createTime 2020年01月08日 17:10:00
 */
@RestController
@RequestMapping("/email")
@Api(tags = "邮件相关接口", value = "邮件相关的API")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EmailController {
	@Autowired
	private MailSenderService mailSenderService;

	@GetMapping("/send")
	@ApiOperation("发送邮件接口")
	public ResponseEntity<String> sendMail(@Validated String mailAddress) {
		return mailSenderService.resetPasswordSend(mailAddress);
	}

}
