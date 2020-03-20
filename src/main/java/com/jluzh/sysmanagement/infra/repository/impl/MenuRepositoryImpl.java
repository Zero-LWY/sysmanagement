package com.jluzh.sysmanagement.infra.repository.impl;

import com.jluzh.sysmanagement.api.dto.MenuPermissionDTO;
import com.jluzh.sysmanagement.domain.entity.Menu;
import com.jluzh.sysmanagement.domain.repository.MenuRepository;
import com.jluzh.sysmanagement.infra.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>菜单仓库接口 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName MenuRepositoryImpl.java
 * @createTime 2019年11月26日 16:57:00
 */
@Component
public class MenuRepositoryImpl implements MenuRepository {
	@Autowired
	private MenuMapper menuMapper;

	@Override
	public List<Menu> selectList(Menu menu) {
		return menuMapper.selectList(menu);
	}

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


	@Override
	public List<String> selectByRoleId(Integer roleId) {
		List<String> result = menuMapper.selectByRoleId(roleId).stream().filter(item -> !item.getTarget().isEmpty()).map(Menu::getTarget).map(String::trim).collect(Collectors.toList());
		return result;
	}

	@Override
	public int deletePermission(MenuPermissionDTO menuPermissionDTO) {
		return menuMapper.deletePermission(menuPermissionDTO);
	}

	@Override
	public int addPermission(MenuPermissionDTO menuPermissionDTO) {
		return menuMapper.insertMenuPermission(menuPermissionDTO);
	}
}
