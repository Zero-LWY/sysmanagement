package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.MenuService;
import com.jluzh.sysmanagement.domain.entity.Menu;
import com.jluzh.sysmanagement.domain.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * <p> 菜单服务实现类 </p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:51:00
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;

    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return menuRepository.deleteByPrimaryKey(id);
    }

    
    @Override
    public int insert(Menu record) {
        return menuRepository.insert(record);
    }

    
    @Override
    public int insertSelective(Menu record) {
        return menuRepository.insertSelective(record);
    }

    
    @Override
    public Menu selectByPrimaryKey(Integer id) {
        return menuRepository.selectByPrimaryKey(id);
    }

    
    @Override
    public int updateByPrimaryKeySelective(Menu record) {
        return menuRepository.updateByPrimaryKeySelective(record);
    }

    
    @Override
    public int updateByPrimaryKey(Menu record) {
        return menuRepository.updateByPrimaryKey(record);
    }

}
