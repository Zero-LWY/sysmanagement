package com.jluzh.sysmanagement.infra.repository.impl;

import com.jluzh.sysmanagement.domain.entity.User;
import com.jluzh.sysmanagement.domain.repository.UserRepository;
import com.jluzh.sysmanagement.infra.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName UserRepositoryImpl.java
 * @createTime 2019年11月26日 16:58:00
 */
public class UserRepositoryImpl implements UserRepository {
	@Autowired
	private UserMapper usermapper;

	@Override
	public List<User> selectUserList(User user) {
		return usermapper.selectUserList(user);
	}
}
