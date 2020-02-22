package com.jluzh.sysmanagement.app.service;

import com.jluzh.sysmanagement.domain.entity.Dict;
import com.jluzh.sysmanagement.infra.pagehelper.Page;
import com.jluzh.sysmanagement.infra.pagehelper.PageRequest;

/**
 * <p> 字典服务类接口 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName DictService.java
 * @createTime 2019年11月26日 17:00:00
 */
public interface DictService {

	Page<Dict> list(PageRequest pageRequest, Dict dict);

	int deleteByPrimaryKey(Integer id);

	int insert(Dict record);

	int insertSelective(Dict record);

	Dict selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Dict record);

	int updateByPrimaryKey(Dict record);
}
