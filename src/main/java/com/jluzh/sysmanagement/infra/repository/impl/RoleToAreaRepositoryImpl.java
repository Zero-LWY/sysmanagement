package com.jluzh.sysmanagement.infra.repository.impl;

import com.jluzh.sysmanagement.domain.entity.RoleToArea;
import com.jluzh.sysmanagement.domain.repository.RoleToAreaRepository;
import com.jluzh.sysmanagement.infra.mapper.RoleToAreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p> 角色区域对应仓库实现类 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName RoleToAreaRepositoryImpl.java
 * @createTime 2019年11月26日 16:57:00
 */
@Component
public class RoleToAreaRepositoryImpl implements RoleToAreaRepository {
	@Autowired
	private RoleToAreaMapper roleToAreaMapper;
	@Override
	public int deleteByPrimaryKey(Integer roleId, Integer areaId) {
		return roleToAreaMapper.deleteByPrimaryKey(roleId,areaId);
	}

	@Override
	public int insert(RoleToArea record) {
		return roleToAreaMapper.insert(record);
	}

	@Override
	public int insertSelective(RoleToArea record) {
		return roleToAreaMapper.insertSelective(record);
	}
}
