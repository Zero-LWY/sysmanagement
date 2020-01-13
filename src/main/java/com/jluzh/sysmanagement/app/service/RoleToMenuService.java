package com.jluzh.sysmanagement.app.service;

import com.jluzh.sysmanagement.domain.entity.RoleToMenu;
import org.apache.ibatis.annotations.Param;

/**
 * <p> 角色菜单对应服务接口 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName RoleToMenuService.java
 * @createTime 2019年11月26日 17:01:00
 */
public interface RoleToMenuService {
	int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("menuId") Integer menuId);

	int insert(RoleToMenu record);

	int insertSelective(RoleToMenu record);
}
