package com.jluzh.sysmanagement.app.service;

import com.jluzh.sysmanagement.domain.entity.Role;
import com.jluzh.sysmanagement.infra.pagehelper.Page;
import com.jluzh.sysmanagement.infra.pagehelper.PageRequest;

/**
 * <p> 角色服务类 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName RoleService.java
 * @createTime 2019年11月26日 17:01:00
 */
public interface RoleService {

	Page<Role> list(PageRequest pageRequest,Role role);

	int deleteByPrimaryKey(Integer id);

	int insert(Role record);

	int insertSelective(Role record);

	Role selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Role record);

	int updateByPrimaryKey(Role record);
}
