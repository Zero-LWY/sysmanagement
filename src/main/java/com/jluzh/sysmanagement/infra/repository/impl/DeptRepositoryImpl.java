package com.jluzh.sysmanagement.infra.repository.impl;

import com.jluzh.sysmanagement.domain.entity.Dept;
import com.jluzh.sysmanagement.domain.repository.DeptRepository;
import com.jluzh.sysmanagement.infra.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p> 部门仓库实现类 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName DeptRepositoryImpl.java
 * @createTime 2019年11月26日 16:56:00
 */
@Component
public class DeptRepositoryImpl implements DeptRepository {

	@Autowired
	private DeptMapper deptMapper;

	@Override
	public List<Dept> selectList(Dept dept) {
		return deptMapper.selectList(dept);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return deptMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Dept record) {
		return deptMapper.insert(record);
	}

	@Override
	public int insertSelective(Dept record) {
		return deptMapper.insertSelective(record);
	}

	@Override
	public Dept selectByPrimaryKey(Integer id) {
		return deptMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Dept record) {
		return deptMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Dept record) {
		return deptMapper.updateByPrimaryKey(record);
	}
}
