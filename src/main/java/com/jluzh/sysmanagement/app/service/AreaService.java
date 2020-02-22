package com.jluzh.sysmanagement.app.service;

import com.jluzh.sysmanagement.domain.entity.Area;
import com.jluzh.sysmanagement.infra.pagehelper.Page;
import com.jluzh.sysmanagement.infra.pagehelper.PageRequest;

/**
 * <p> 区域service</p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName AreaService.java
 * @createTime 2019年11月26日 17:01:00
 */
public interface AreaService {

	Page<Area> list(PageRequest pageRequest, Area area);

	int deleteByPrimaryKey(Integer id);

	int insert(Area record);

	int insertSelective(Area record);

	Area selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Area record);

	int updateByPrimaryKey(Area record);
}
