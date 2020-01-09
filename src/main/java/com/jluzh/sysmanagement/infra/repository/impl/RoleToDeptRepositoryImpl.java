package com.jluzh.sysmanagement.infra.repository.impl;

import com.jluzh.sysmanagement.domain.entity.RoleToDept;
import com.jluzh.sysmanagement.domain.repository.RoleToDeptRepository;
import com.jluzh.sysmanagement.infra.mapper.RoleToDeptMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName RoleToDeptRepositoryImpl.java
 * @createTime 2019年11月26日 16:57:00
 */
public class RoleToDeptRepositoryImpl implements RoleToDeptRepository {
	@Autowired
	private RoleToDeptMapper roleToDeptMapper;
	@Override
	public int deleteByPrimaryKey(Integer roleId, Integer deptId) {
		return roleToDeptMapper.deleteByPrimaryKey(roleId,deptId);
	}

	@Override
	public int insert(RoleToDept record) {
		return roleToDeptMapper.insert(record);
	}

	@Override
	public int insertSelective(RoleToDept record) {
		return roleToDeptMapper.insertSelective(record);
	}
}
