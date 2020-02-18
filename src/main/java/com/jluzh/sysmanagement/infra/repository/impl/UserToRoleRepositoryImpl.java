package com.jluzh.sysmanagement.infra.repository.impl;

import com.jluzh.sysmanagement.domain.entity.UserToRole;
import com.jluzh.sysmanagement.domain.repository.UserToRoleRepository;
import com.jluzh.sysmanagement.infra.mapper.UserToRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p> 用户角色对应仓库实现类</p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName UserToRoleRepositoryImpl.java
 * @createTime 2019年11月26日 16:58:00
 */
@Component
public class UserToRoleRepositoryImpl implements UserToRoleRepository {
	@Autowired
	private UserToRoleMapper userToRoleMapper;
	@Override
	public int deleteByPrimaryKey(Integer userId, Integer roleId) {
		return userToRoleMapper.deleteByPrimaryKey(userId,roleId);
	}

	@Override
	public int insert(UserToRole record) {
		return userToRoleMapper.insert(record);
	}

	@Override
	public int insertSelective(UserToRole record) {
		return userToRoleMapper.insertSelective(record);
	}
}
