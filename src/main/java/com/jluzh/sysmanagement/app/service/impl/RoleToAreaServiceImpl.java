package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.RoleToAreaService;
import com.jluzh.sysmanagement.domain.entity.RoleToArea;
import com.jluzh.sysmanagement.infra.mapper.RoleToAreaMapper;
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
public class RoleToAreaServiceImpl implements RoleToAreaService {

    @Resource
    private RoleToAreaMapper roleToAreaMapper;

    
    @Override
    public int deleteByPrimaryKey(Integer roleId, Integer areaId) {
        return roleToAreaMapper.deleteByPrimaryKey(roleId,areaId);
    }

    
    @Override
    public int insert(RoleToArea record) {
        return roleToAreaMapper.insert(record);
    }

    
    @Override
    public int insertSelective(RoleToArea record) {
        return roleToAreaMapper.insertSelective(record);
    }

}
