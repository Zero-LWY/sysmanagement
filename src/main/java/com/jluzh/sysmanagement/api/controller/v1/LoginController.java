package com.jluzh.sysmanagement.api.controller.v1;

import com.jluzh.sysmanagement.app.service.UserService;
import com.jluzh.sysmanagement.domain.entity.User;
import com.jluzh.sysmanagement.infra.util.Results;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p> 登录控制 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName LoginController.java
 * @createTime 2019年11月25日 18:37:00
 */
@RestController
@RequestMapping("/login")
@Api(tags = "用户相关接口", value = "提供用户相关的 Rest API")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class LoginController {

	private final UserService userService;
	/**
	 * 登录
	 *
	 * @return
	 */
	@PostMapping("do_login")
	public ResponseEntity<User> doLogin(User user) {
		log.info("---------- username = " + user.getUserName() + ", " + "password = " + user.getPassword() + " ----------");
		return Results.success(userService.login(user));
	}

	@PostMapping("/reset")
	public ResponseEntity<String> resetPassword(User user,String code){
		return Results.success(userService.resetPassword(user,code));
	}


	@PostMapping("do_logout")
	public ResponseEntity<String> doLogout() {
		Subject subject = SecurityUtils.getSubject();
		User user = (User) subject.getPrincipal();
		subject.logout();
		log.debug("---------- 用户 [" + user.getUserName() + "] 退出登录");
		return Results.success("退出成功");
	}

}
