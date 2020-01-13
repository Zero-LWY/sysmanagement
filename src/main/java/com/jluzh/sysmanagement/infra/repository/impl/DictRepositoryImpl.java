package com.jluzh.sysmanagement.infra.repository.impl;

import com.jluzh.sysmanagement.domain.entity.Dict;
import com.jluzh.sysmanagement.domain.repository.DictRepository;
import com.jluzh.sysmanagement.infra.mapper.DictMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p> 字典仓库实现类</p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName DictRepositoryImpl.java
 * @createTime 2019年11月26日 16:56:00
 */
public class DictRepositoryImpl implements DictRepository {
	@Autowired
	private DictMapper dictMapper;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return dictMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Dict record) {
		return dictMapper.insert(record);
	}

	@Override
	public int insertSelective(Dict record) {
		return dictMapper.insertSelective(record);
	}

	@Override
	public Dict selectByPrimaryKey(Integer id) {
		return dictMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Dict record) {
		return dictMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Dict record) {
		return dictMapper.updateByPrimaryKey(record);
	}
}
