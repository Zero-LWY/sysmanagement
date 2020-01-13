package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.UserToRoleService;
import com.jluzh.sysmanagement.domain.entity.UserToRole;
import com.jluzh.sysmanagement.infra.mapper.UserToRoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * <p>用户角色对应服务实现类 </p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:53:00
 */
@Service
public class UserToRoleServiceImpl implements UserToRoleService {

    @Resource
    private UserToRoleMapper userToRoleMapper;

    
    @Override
    public int deleteByPrimaryKey(Integer userId, Integer roleId) {
        return userToRoleMapper.deleteByPrimaryKey(userId,roleId);
    }

    
    @Override
    public int insert(UserToRole record) {
        return userToRoleMapper.insert(record);
    }

    
    @Override
    public int insertSelective(UserToRole record) {
        return userToRoleMapper.insertSelective(record);
    }

}
