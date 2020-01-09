package com.jluzh.sysmanagement.domain.repository;

import com.jluzh.sysmanagement.domain.entity.Dept;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName DeptRepository.java
 * @createTime 2019年11月26日 16:41:00
 */
public interface DeptRepository {
	int deleteByPrimaryKey(Integer id);

	int insert(Dept record);

	int insertSelective(Dept record);

	Dept selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Dept record);

	int updateByPrimaryKey(Dept record);
}
