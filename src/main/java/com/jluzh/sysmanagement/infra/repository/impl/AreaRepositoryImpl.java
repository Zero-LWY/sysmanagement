package com.jluzh.sysmanagement.infra.repository.impl;

import com.jluzh.sysmanagement.domain.entity.Area;
import com.jluzh.sysmanagement.domain.repository.AreaRepository;
import com.jluzh.sysmanagement.infra.mapper.AreaMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p> 区域仓库实现类 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName AreaRepositoryImpl.java
 * @createTime 2019年11月26日 16:56:00
 */
public class AreaRepositoryImpl implements AreaRepository {

	@Autowired
	private AreaMapper areaMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return areaMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Area record) {
		return areaMapper.insert(record);
	}

	@Override
	public int insertSelective(Area record) {
		return areaMapper.insertSelective(record);
	}

	@Override
	public Area selectByPrimaryKey(Integer id) {
		return areaMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Area record) {
		return areaMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Area record) {
		return areaMapper.updateByPrimaryKey(record);
	}
}
