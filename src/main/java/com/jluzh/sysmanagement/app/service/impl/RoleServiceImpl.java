package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.RoleService;
import com.jluzh.sysmanagement.domain.entity.Role;
import com.jluzh.sysmanagement.infra.mapper.RoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * <p> @Description TODO </p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:52:00
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return roleMapper.deleteByPrimaryKey(id);
    }

    
    @Override
    public int insert(Role record) {
        return roleMapper.insert(record);
    }

    
    @Override
    public int insertSelective(Role record) {
        return roleMapper.insertSelective(record);
    }

    
    @Override
    public Role selectByPrimaryKey(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    
    @Override
    public int updateByPrimaryKeySelective(Role record) {
        return roleMapper.updateByPrimaryKeySelective(record);
    }

    
    @Override
    public int updateByPrimaryKey(Role record) {
        return roleMapper.updateByPrimaryKey(record);
    }

}
