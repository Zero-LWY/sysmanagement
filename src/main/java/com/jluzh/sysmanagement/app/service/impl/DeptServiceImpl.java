package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.DeptService;
import com.jluzh.sysmanagement.domain.entity.Dept;
import com.jluzh.sysmanagement.infra.mapper.DeptMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * <p> @Description TODO </p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:51:00
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return deptMapper.deleteByPrimaryKey(id);
    }

    
    @Override
    public int insert(Dept record) {
        return deptMapper.insert(record);
    }

    
    @Override
    public int insertSelective(Dept record) {
        return deptMapper.insertSelective(record);
    }

    
    @Override
    public Dept selectByPrimaryKey(Integer id) {
        return deptMapper.selectByPrimaryKey(id);
    }

    
    @Override
    public int updateByPrimaryKeySelective(Dept record) {
        return deptMapper.updateByPrimaryKeySelective(record);
    }

    
    @Override
    public int updateByPrimaryKey(Dept record) {
        return deptMapper.updateByPrimaryKey(record);
    }

}
