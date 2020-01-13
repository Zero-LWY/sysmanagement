package com.jluzh.sysmanagement.api.controller.v1;

import com.jluzh.sysmanagement.domain.entity.User;
import io.swagger.annotations.ApiOperation;
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
@RequestMapping("/user1")
public class UserController {
	@ApiOperation("新增用户接口")
	@PostMapping("/add")
	public boolean addUser(@RequestBody User user) {
		return false;
	}

	@ApiOperation("查找用户接口")
	@GetMapping("/find/{id}")
	public User findById(@PathVariable("id") int id) {

		return new User();
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
