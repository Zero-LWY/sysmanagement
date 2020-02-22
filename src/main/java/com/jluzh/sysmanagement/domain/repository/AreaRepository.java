package com.jluzh.sysmanagement.domain.repository;

import com.jluzh.sysmanagement.domain.entity.Area;

import java.util.List;

/**
 * <p> 区域仓库</p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName AreaRepository.java
 * @createTime 2019年11月26日 16:40:00
 */
public interface AreaRepository {

	List<Area> selectList(Area area);

	int deleteByPrimaryKey(Integer id);

	int insert(Area record);

	int insertSelective(Area record);

	Area selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Area record);

	int updateByPrimaryKey(Area record);
}
