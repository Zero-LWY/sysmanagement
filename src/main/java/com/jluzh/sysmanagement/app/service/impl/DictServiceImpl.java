package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.DictService;
import com.jluzh.sysmanagement.domain.entity.Dict;
import com.jluzh.sysmanagement.domain.repository.DictRepository;
import com.jluzh.sysmanagement.infra.pagehelper.Page;
import com.jluzh.sysmanagement.infra.pagehelper.PageRequest;
import com.jluzh.sysmanagement.infra.pagehelper.PageUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * <p> 字典服务类实现</p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:51:00
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DictServiceImpl implements DictService {


    private final DictRepository dictRepository;

	@Override
	public Page<Dict> list(PageRequest pageRequest, Dict dict) {
		return PageUtils.getPageResult(pageRequest,()->dictRepository.list(dict));
	}

	@Override
    public int deleteByPrimaryKey(Integer id) {
        return dictRepository.deleteByPrimaryKey(id);
    }

    
    @Override
    public int insert(Dict record) {
        return dictRepository.insert(record);
    }

    
    @Override
    public int insertSelective(Dict record) {
        return dictRepository.insertSelective(record);
    }

    
    @Override
    public Dict selectByPrimaryKey(Integer id) {
        return dictRepository.selectByPrimaryKey(id);
    }

    
    @Override
    public int updateByPrimaryKeySelective(Dict record) {
        return dictRepository.updateByPrimaryKeySelective(record);
    }

    
    @Override
    public int updateByPrimaryKey(Dict record) {
        return dictRepository.updateByPrimaryKey(record);
    }

}
