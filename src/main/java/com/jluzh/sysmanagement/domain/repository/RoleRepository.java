package com.jluzh.sysmanagement.domain.repository;

import com.jluzh.sysmanagement.domain.entity.Role;

import java.util.List;

/**
 * <p> 角色仓库接口 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName RoleRepository.java
 * @createTime 2019年11月26日 16:41:00
 */
public interface RoleRepository {

	List<Role> list(Role role);

	int deleteByPrimaryKey(Integer id);

	int insert(Role record);

	int insertSelective(Role record);

	Role selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Role record);

	int updateByPrimaryKey(Role record);

	Role selectByUserId(Integer userId);

	List<Role> selectByMenuId(Integer menuId);
}
