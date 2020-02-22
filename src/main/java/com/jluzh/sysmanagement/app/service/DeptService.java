package com.jluzh.sysmanagement.app.service;

import com.jluzh.sysmanagement.domain.entity.Dept;
import com.jluzh.sysmanagement.infra.pagehelper.Page;
import com.jluzh.sysmanagement.infra.pagehelper.PageRequest;

/**
 * <p> 部门service</p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName DeptService.java
 * @createTime 2019年11月26日 17:00:00
 */
public interface DeptService {
	Page<Dept> list(PageRequest pageRequest, Dept dept);

	int deleteByPrimaryKey(Integer id);

	int insert(Dept record);

	int insertSelective(Dept record);

	Dept selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Dept record);

	int updateByPrimaryKey(Dept record);
}
