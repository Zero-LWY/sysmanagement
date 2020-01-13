package com.jluzh.sysmanagement.app.service;

import com.jluzh.sysmanagement.domain.entity.Menu;

/**
 * <p> 菜单服务接口</p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName MenuService.java
 * @createTime 2019年11月26日 17:00:00
 */
public interface MenuService {
	int deleteByPrimaryKey(Integer id);

	int insert(Menu record);

	int insertSelective(Menu record);

	Menu selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Menu record);

	int updateByPrimaryKey(Menu record);
}
