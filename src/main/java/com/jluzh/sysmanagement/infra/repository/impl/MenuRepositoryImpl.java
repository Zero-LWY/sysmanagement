package com.jluzh.sysmanagement.infra.repository.impl;

import com.jluzh.sysmanagement.domain.entity.Menu;
import com.jluzh.sysmanagement.domain.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName MenuRepositoryImpl.java
 * @createTime 2019年11月26日 16:57:00
 */
public class MenuRepositoryImpl implements MenuRepository {
	@Autowired
	private MenuRepository menuRepository;
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
