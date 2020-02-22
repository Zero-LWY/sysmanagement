package com.jluzh.sysmanagement.domain.repository;

import com.jluzh.sysmanagement.domain.entity.Menu;

import java.util.List;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName MenuRepository.java
 * @createTime 2019年11月26日 16:41:00
 */
public interface MenuRepository {

	List<Menu> selectList(Menu menu);

	int deleteByPrimaryKey(Integer id);

	int insert(Menu record);

	int insertSelective(Menu record);

	Menu selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Menu record);

	int updateByPrimaryKey(Menu record);
}
