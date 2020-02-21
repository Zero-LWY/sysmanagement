package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.DeptService;
import com.jluzh.sysmanagement.domain.entity.Dept;
import com.jluzh.sysmanagement.domain.repository.DeptRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * <p> 部门服务类实现 </p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:51:00
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DeptServiceImpl implements DeptService {

    @Autowired
    private final DeptRepository deptRepository;

    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return deptRepository.deleteByPrimaryKey(id);
    }

    
    @Override
    public int insert(Dept record) {
        return deptRepository.insert(record);
    }

    
    @Override
    public int insertSelective(Dept record) {
        return deptRepository.insertSelective(record);
    }

    
    @Override
    public Dept selectByPrimaryKey(Integer id) {
        return deptRepository.selectByPrimaryKey(id);
    }

    
    @Override
    public int updateByPrimaryKeySelective(Dept record) {
        return deptRepository.updateByPrimaryKeySelective(record);
    }

    
    @Override
    public int updateByPrimaryKey(Dept record) {
        return deptRepository.updateByPrimaryKey(record);
    }

}
