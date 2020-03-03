package com.jluzh.sysmanagement.api.controller.v1;

import com.jluzh.sysmanagement.domain.entity.User;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
	@ApiOperation("新增用户接口")
	@PostMapping("/add")
	public boolean addUser(@RequestBody User user) {
		return false;
	}

	@ApiOperation("查找用户接口")
	//@RequiresPermissions(value = {"user:selectList", "user:info"}, logical = Logical.AND)
	@GetMapping("/find")
	public User findById() {
		Subject subject = SecurityUtils.getSubject();
		return (User) subject.getPrincipal();
	}


	@ApiOperation("更新  用户接口")
	@PutMapping("/update")
	public boolean update(@RequestBody User user) {
		return true;
	}


	@ApiOperation("删除用户接口")
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") int id) {
		return true;
	}
}
