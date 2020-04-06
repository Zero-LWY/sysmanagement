package com.jluzh.sysmanagement.api.controller.v1;

import com.jluzh.sysmanagement.app.service.UserService;
import com.jluzh.sysmanagement.domain.entity.User;
import com.jluzh.sysmanagement.infra.pagehelper.Page;
import com.jluzh.sysmanagement.infra.pagehelper.PageRequest;
import com.jluzh.sysmanagement.infra.util.MD5Util;
import com.jluzh.sysmanagement.infra.util.Results;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * <p> 用户接口</p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName UserController.java
 * @createTime 2019年11月25日 16:36:00
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

	private final UserService userService;

	@ApiOperation("新增用户接口")
	@PostMapping
	public ResponseEntity<Integer> addUser(@RequestBody User user) {
		user.setPassword(MD5Util.md5(user.getPassword()));
		user.setUpdateTime(LocalDateTime.now());
		user.setUpdateBy("1");
		return Results.success(userService.insertSelective(user));
	}


	@ApiOperation("用户列表")
	@GetMapping
	public ResponseEntity<Page<User>> list(final User user ,final PageRequest pageRequest){
		return Results.success(userService.selectUserList(user,pageRequest));
	}

	@ApiOperation("查找用户接口")
	//@RequiresPermissions(value = {"user:selectList", "user:info"}, logical = Logical.AND)
	@GetMapping("/find")
	public User findById() {
		Subject subject = SecurityUtils.getSubject();
		return (User) subject.getPrincipal();
	}


	@ApiOperation("更新  用户接口")
	@PutMapping
	public ResponseEntity<Integer> update(@RequestBody User user) {
		return Results.success(userService.updateByPrimaryKeySelective(user));
	}


	@ApiOperation("删除用户接口")
	@DeleteMapping
	public ResponseEntity<Integer> delete(Integer id) {
		return Results.success(userService.deleteByPrimaryKey(id));
	}
}
