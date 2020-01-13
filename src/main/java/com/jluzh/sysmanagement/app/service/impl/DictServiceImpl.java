package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.DictService;
import com.jluzh.sysmanagement.domain.entity.Dict;
import com.jluzh.sysmanagement.infra.mapper.DictMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * <p> 字典服务类实现</p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:51:00
 */
@Service
public class DictServiceImpl implements DictService {

    @Resource
    private DictMapper dictMapper;

    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dictMapper.deleteByPrimaryKey(id);
    }

    
    @Override
    public int insert(Dict record) {
        return dictMapper.insert(record);
    }

    
    @Override
    public int insertSelective(Dict record) {
        return dictMapper.insertSelective(record);
    }

    
    @Override
    public Dict selectByPrimaryKey(Integer id) {
        return dictMapper.selectByPrimaryKey(id);
    }

    
    @Override
    public int updateByPrimaryKeySelective(Dict record) {
        return dictMapper.updateByPrimaryKeySelective(record);
    }

    
    @Override
    public int updateByPrimaryKey(Dict record) {
        return dictMapper.updateByPrimaryKey(record);
    }

}
