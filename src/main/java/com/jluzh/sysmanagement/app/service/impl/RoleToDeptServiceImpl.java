package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.RoleToDeptService;
import com.jluzh.sysmanagement.domain.entity.RoleToDept;
import com.jluzh.sysmanagement.domain.repository.RoleToDeptRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * <p> 角色部门对应服务实现类</p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:53:00
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RoleToDeptServiceImpl implements RoleToDeptService {

    private final RoleToDeptRepository roleToDeptRepository;

    
    @Override
    public int deleteByPrimaryKey(Integer roleId, Integer deptId) {
        return roleToDeptRepository.deleteByPrimaryKey(roleId,deptId);
    }

    
    @Override
    public int insert(RoleToDept record) {
        return roleToDeptRepository.insert(record);
    }

    
    @Override
    public int insertSelective(RoleToDept record) {
        return roleToDeptRepository.insertSelective(record);
    }

}
