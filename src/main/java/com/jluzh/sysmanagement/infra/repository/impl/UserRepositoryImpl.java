package com.jluzh.sysmanagement.infra.repository.impl;

import com.jluzh.sysmanagement.domain.entity.User;
import com.jluzh.sysmanagement.domain.repository.UserRepository;
import com.jluzh.sysmanagement.infra.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p> 用户仓库实现类 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName UserRepositoryImpl.java
 * @createTime 2019年11月26日 16:58:00
 */
@Component
public class UserRepositoryImpl implements UserRepository {
	@Autowired
	private UserMapper usermapper;

	@Override
	public List<User> selectUserList(User user) {
		return usermapper.selectUserList(user);
	}

	@Override
	public User login(User user) {
		return usermapper.login(user);
	}

	@Override
	public User selectByMail(String mail) {
		return usermapper.selectByMail(mail);
	}
}
