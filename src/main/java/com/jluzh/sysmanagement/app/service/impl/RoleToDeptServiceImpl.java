package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.RoleToDeptService;
import com.jluzh.sysmanagement.domain.entity.RoleToDept;
import com.jluzh.sysmanagement.infra.mapper.RoleToDeptMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * <p> 角色部门对应服务实现类</p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:53:00
 */
@Service
public class RoleToDeptServiceImpl implements RoleToDeptService {

    @Resource
    private RoleToDeptMapper roleToDeptMapper;

    
    @Override
    public int deleteByPrimaryKey(Integer roleId, Integer deptId) {
        return roleToDeptMapper.deleteByPrimaryKey(roleId,deptId);
    }

    
    @Override
    public int insert(RoleToDept record) {
        return roleToDeptMapper.insert(record);
    }

    
    @Override
    public int insertSelective(RoleToDept record) {
        return roleToDeptMapper.insertSelective(record);
    }

}
