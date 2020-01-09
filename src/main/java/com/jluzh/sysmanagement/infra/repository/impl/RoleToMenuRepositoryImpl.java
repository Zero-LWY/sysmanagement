package com.jluzh.sysmanagement.infra.repository.impl;

import com.jluzh.sysmanagement.domain.entity.RoleToMenu;
import com.jluzh.sysmanagement.domain.repository.RoleToMenuRepository;
import com.jluzh.sysmanagement.infra.mapper.RoleToMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName RoleToMenuRepositoryImpl.java
 * @createTime 2019年11月26日 16:58:00
 */
public class RoleToMenuRepositoryImpl implements RoleToMenuRepository {
	@Autowired
	private RoleToMenuMapper roleToMenuMapper;
	@Override
	public int deleteByPrimaryKey(Integer roleId, Integer menuId) {
		return roleToMenuMapper.deleteByPrimaryKey(roleId,menuId);
	}

	@Override
	public int insert(RoleToMenu record) {
		return roleToMenuMapper.insert(record);
	}

	@Override
	public int insertSelective(RoleToMenu record) {
		return roleToMenuMapper.insertSelective(record);
	}
}
