package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.RoleToMenuService;
import com.jluzh.sysmanagement.domain.entity.RoleToMenu;
import com.jluzh.sysmanagement.domain.repository.RoleToMenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * <p>角色菜单对应服务类</p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:53:00
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RoleToMenuServiceImpl implements RoleToMenuService {


    private final RoleToMenuRepository roleToMenuRepository;

    
    @Override
    public int deleteByPrimaryKey(Integer roleId, Integer menuId) {
        return roleToMenuRepository.deleteByPrimaryKey(roleId,menuId);
    }

    
    @Override
    public int insert(RoleToMenu record) {
        return roleToMenuRepository.insert(record);
    }

    
    @Override
    public int insertSelective(RoleToMenu record) {
        return roleToMenuRepository.insertSelective(record);
    }

}
