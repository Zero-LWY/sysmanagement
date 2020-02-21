package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.RoleToAreaService;
import com.jluzh.sysmanagement.domain.entity.RoleToArea;
import com.jluzh.sysmanagement.domain.repository.RoleToAreaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * <p>角色区域对应服务实现类 </p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:52:00
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RoleToAreaServiceImpl implements RoleToAreaService {


    private final RoleToAreaRepository roleToAreaRepository;

    
    @Override
    public int deleteByPrimaryKey(Integer roleId, Integer areaId) {
        return roleToAreaRepository.deleteByPrimaryKey(roleId,areaId);
    }

    
    @Override
    public int insert(RoleToArea record) {
        return roleToAreaRepository.insert(record);
    }

    
    @Override
    public int insertSelective(RoleToArea record) {
        return roleToAreaRepository.insertSelective(record);
    }

}
