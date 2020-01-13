package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.AreaService;
import com.jluzh.sysmanagement.domain.entity.Area;
import com.jluzh.sysmanagement.infra.mapper.AreaMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * <p> 区域service实现类 </p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:47:00
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Resource
    private AreaMapper pmSysAreaMapper;

    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return pmSysAreaMapper.deleteByPrimaryKey(id);
    }

    
    @Override
    public int insert(Area record) {
        return pmSysAreaMapper.insert(record);
    }

    
    @Override
    public int insertSelective(Area record) {
        return pmSysAreaMapper.insertSelective(record);
    }

    
    @Override
    public Area selectByPrimaryKey(Integer id) {
        return pmSysAreaMapper.selectByPrimaryKey(id);
    }

    
    @Override
    public int updateByPrimaryKeySelective(Area record) {
        return pmSysAreaMapper.updateByPrimaryKeySelective(record);
    }

    
    @Override
    public int updateByPrimaryKey(Area record) {
        return pmSysAreaMapper.updateByPrimaryKey(record);
    }

}
