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

	@Override
	public Integer updateSelective(User user) {
		return usermapper.updateSelective(user);
	}

	@Override
	public List<Integer> findRoleId(Integer userId) {
		return usermapper.selectRoleIdByUserId(userId);
	}

	@Override
	public int deleteByPrimaryKey(Integer userId) {
		return usermapper.deleteByPrimaryKey(userId);
	}

	@Override
	public int insert(User record) {
		return usermapper.insert(record);
	}

	@Override
	public int insertSelective(User record) {
		return usermapper.insertSelective(record);
	}

	@Override
	public User selectByPrimaryKey(Integer userId) {
		return selectByPrimaryKey(userId);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		return usermapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		return usermapper.updateByPrimaryKey(record);
	}
}
