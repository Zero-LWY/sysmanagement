package com.jluzh.sysmanagement.infra.mapper;

import com.jluzh.sysmanagement.api.dto.MenuPermissionDTO;
import com.jluzh.sysmanagement.domain.entity.Menu;

import java.util.List;

/**
 * <p> 菜单mapper</p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:51:00
 */
public interface MenuMapper {
    List<Menu> selectList(Menu menu);

    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> selectByRoleId(Integer roleId);

    int deletePermission(MenuPermissionDTO menuPermissionDTO);

    int insertMenuPermission(MenuPermissionDTO menuPermissionDTO);

}