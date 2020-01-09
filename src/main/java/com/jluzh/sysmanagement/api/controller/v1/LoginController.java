package com.jluzh.sysmanagement.api.controller.v1;

import com.jluzh.sysmanagement.app.service.UserService;
import com.jluzh.sysmanagement.domain.entity.User;
import com.jluzh.sysmanagement.infra.util.Results;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p> 登录控制 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName LoginController.java
 * @createTime 2019年11月25日 18:37:00
 */
@RestController
@RequestMapping("/user2")
@Api(tags = "用户相关接口", value = "提供用户相关的 Rest API")
public class LoginController {

	@Autowired
	private UserService userService;

	@ApiOperation("登录接口")
	@PostMapping("/login")
	public ResponseEntity<List<User>> login(
			@ApiParam(value = "登录名" ,required = true)@RequestParam(name = "loginName") String loginName,
			@ApiParam(value = "密码" ,required = true)@RequestParam(name = "password") String password){
		User user = new User();
		user.setLoginName(loginName);
		user.setPassword(password);
		return Results.success(userService.selectUserList(user));
	}

}
