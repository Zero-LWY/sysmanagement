package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.UserService;
import com.jluzh.sysmanagement.domain.entity.User;
import com.jluzh.sysmanagement.infra.mapper.UserMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> 用户服务实现类</p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName UserServiceImpl.java
 * @createTime 2019年11月25日 19:02:00
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> selectUserList(User user) {
		return userMapper.selectUserList(user);
	}

	@Override
	public User login(User user) {
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), user.getPassword());
		token.setRememberMe(true);
		Subject subject = SecurityUtils.getSubject();
		subject.login(token);
		return (User) subject.getPrincipal();
	}
	/**
	 * 获取所有权限
	 *
	 * @return
	 */
	@Override
	public List<String> getAllPerms() {
		List<String> list = new ArrayList<>();
		list.add("user:list");
		list.add("user:info");
		list.add("user:save");
		list.add("user:update");
		list.add("user:delete");
		return list;
	}

	/**
	 * 获取用户权限
	 *
	 * @param userId
	 * @return
	 */
	@Override
	public List<String> getUserPerms(Integer userId) {
		List<String> list = new ArrayList<>();
		list.add("user:list");
		return list;
	}

	@Override
	public String resetPassword(User user, String code) {


		return "修改成功";
	}
}
