package com.jluzh.sysmanagement.domain.repository;

import com.jluzh.sysmanagement.domain.entity.Dept;

import java.util.List;

/**
 * <p> 部门仓库 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName DeptRepository.java
 * @createTime 2019年11月26日 16:41:00
 */
public interface DeptRepository {
	List<Dept> selectList(Dept dept);

	int deleteByPrimaryKey(Integer id);

	int insert(Dept record);

	int insertSelective(Dept record);

	Dept selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Dept record);

	int updateByPrimaryKey(Dept record);
}
