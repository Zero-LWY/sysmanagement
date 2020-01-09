package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.MenuService;
import com.jluzh.sysmanagement.domain.entity.Menu;
import com.jluzh.sysmanagement.infra.mapper.MenuMapper;
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
public class MenuServiceImpl implements MenuService {

    @Resource
    private MenuMapper menuMapper;

    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return menuMapper.deleteByPrimaryKey(id);
    }

    
    @Override
    public int insert(Menu record) {
        return menuMapper.insert(record);
    }

    
    @Override
    public int insertSelective(Menu record) {
        return menuMapper.insertSelective(record);
    }

    
    @Override
    public Menu selectByPrimaryKey(Integer id) {
        return menuMapper.selectByPrimaryKey(id);
    }

    
    @Override
    public int updateByPrimaryKeySelective(Menu record) {
        return menuMapper.updateByPrimaryKeySelective(record);
    }

    
    @Override
    public int updateByPrimaryKey(Menu record) {
        return menuMapper.updateByPrimaryKey(record);
    }

}
