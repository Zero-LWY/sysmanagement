package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.RoleService;
import com.jluzh.sysmanagement.domain.entity.Role;
import com.jluzh.sysmanagement.domain.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * <p>角色服务实现类 </p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:52:00
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RoleServiceImpl implements RoleService {


    private final RoleRepository roleRepository;

    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return roleRepository.deleteByPrimaryKey(id);
    }

    
    @Override
    public int insert(Role record) {
        return roleRepository.insert(record);
    }

    
    @Override
    public int insertSelective(Role record) {
        return roleRepository.insertSelective(record);
    }

    
    @Override
    public Role selectByPrimaryKey(Integer id) {
        return roleRepository.selectByPrimaryKey(id);
    }

    
    @Override
    public int updateByPrimaryKeySelective(Role record) {
        return roleRepository.updateByPrimaryKeySelective(record);
    }

    
    @Override
    public int updateByPrimaryKey(Role record) {
        return roleRepository.updateByPrimaryKey(record);
    }

}
