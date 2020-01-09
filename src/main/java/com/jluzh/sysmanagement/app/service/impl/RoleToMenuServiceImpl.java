package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.RoleToMenuService;
import com.jluzh.sysmanagement.domain.entity.RoleToMenu;
import com.jluzh.sysmanagement.infra.mapper.RoleToMenuMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * <p> @Description TODO </p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:53:00
 */
@Service
public class RoleToMenuServiceImpl implements RoleToMenuService {

    @Resource
    private RoleToMenuMapper roleToMenuMapper;

    
    @Override
    public int deleteByPrimaryKey(Integer roleId, Integer menuId) {
        return roleToMenuMapper.deleteByPrimaryKey(roleId,menuId);
    }

    
    @Override
    public int insert(RoleToMenu record) {
        return roleToMenuMapper.insert(record);
    }

    
    @Override
    public int insertSelective(RoleToMenu record) {
        return roleToMenuMapper.insertSelective(record);
    }

}
