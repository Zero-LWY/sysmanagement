package com.jluzh.sysmanagement.app.service;

import com.jluzh.sysmanagement.domain.entity.Area;

import java.util.List;

/**
 * <p> 区域service</p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName AreaService.java
 * @createTime 2019年11月26日 17:01:00
 */
public interface AreaService {

	List<Area> list(Area area);

	int deleteByPrimaryKey(Long id);

	int insert(Area record);

	int insertSelective(Area record);

	Area selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(Area record);

	int updateByPrimaryKey(Area record);
}
