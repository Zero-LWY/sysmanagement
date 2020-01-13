package com.jluzh.sysmanagement.infra.mapper;

import com.jluzh.sysmanagement.domain.entity.RoleToMenu;
import org.apache.ibatis.annotations.Param;

/**
 * <p>角色菜单对应mapper </p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:53:00
 */
public interface RoleToMenuMapper {
    int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("menuId") Integer menuId);

    int insert(RoleToMenu record);

    int insertSelective(RoleToMenu record);
}