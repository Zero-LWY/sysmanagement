package com.jluzh.sysmanagement.infra.mapper;

import com.jluzh.sysmanagement.domain.entity.Role;

import java.util.List;

/**
 * <p> 角色mapper</p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:52:00
 */
public interface RoleMapper {

    List<Role> selectList(Role role);

    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    Role selectByUserId(Integer userId);

    List<Role> selectByMenuId(Integer menuId);

}