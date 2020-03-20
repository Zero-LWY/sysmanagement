package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.MenuService;
import com.jluzh.sysmanagement.domain.entity.Menu;
import com.jluzh.sysmanagement.domain.repository.MenuRepository;
import com.jluzh.sysmanagement.infra.pagehelper.Page;
import com.jluzh.sysmanagement.infra.pagehelper.PageRequest;
import com.jluzh.sysmanagement.infra.pagehelper.PageUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	public Page<Menu> list(PageRequest pageRequest, Menu menu) {
		return PageUtils.getPageResult(pageRequest,()-> menuRepository.selectList(menu));
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
    public int deleteByPrimaryKey(Integer menuId) {
		menuRepository.deletePermissionByMenuId(menuId);
        return menuRepository.deleteByPrimaryKey(menuId);
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
