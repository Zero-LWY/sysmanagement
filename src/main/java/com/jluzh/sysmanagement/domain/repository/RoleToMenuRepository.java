package com.jluzh.sysmanagement.domain.repository;

import com.jluzh.sysmanagement.domain.entity.RoleToMenu;
import org.apache.ibatis.annotations.Param;

/**
 * <p> 角色菜单对应仓库接口 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName RoleToMenuRepository.java
 * @createTime 2019年11月26日 16:42:00
 */
public interface RoleToMenuRepository {
	int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("menuId") Integer menuId);

	int insert(RoleToMenu record);

	int insertSelective(RoleToMenu record);
}
