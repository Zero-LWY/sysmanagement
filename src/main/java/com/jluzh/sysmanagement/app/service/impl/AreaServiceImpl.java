package com.jluzh.sysmanagement.app.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jluzh.sysmanagement.app.service.AreaService;
import com.jluzh.sysmanagement.domain.entity.Area;
import com.jluzh.sysmanagement.domain.repository.AreaRepository;
import com.jluzh.sysmanagement.infra.pagehelper.Page;
import com.jluzh.sysmanagement.infra.pagehelper.PageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p> 区域service实现类 </p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:47:00
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AreaServiceImpl implements AreaService {

    @Autowired
    private final AreaRepository areaRepository;

    @Override
    public Page<Area> list(PageRequest pageRequest, Area area) {
		PageHelper.startPage(pageRequest.getPage(),pageRequest.getSize());
		List list = areaRepository.selectList(area);
		//将查询的结果给pageinfo处理
		PageInfo pageInfo = new PageInfo<>();
		pageInfo.setSize(pageRequest.getSize());
		pageInfo.setPageNum(pageRequest.getPage());
		pageInfo.setList(list);

		//创建结果集对象
		Page<Area> result = new Page<>();
		//将结果封装到结果集对象中
		//当前页
		result.setNumber(pageRequest.getPage());
		//每页的数量
		result.setSize(pageRequest.getSize());
		//总页数
		result.setTotalPages(pageInfo.getPages());
		//总条数
		result.setTotalElements(pageInfo.getTotal());
		//结果集
		result.setContent(pageInfo.getList());
		return result;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return areaRepository.deleteByPrimaryKey(id);
    }

    
    @Override
    public int insert(Area record) {
        return areaRepository.insert(record);
    }

    
    @Override
    public int insertSelective(Area record) {
        return areaRepository.insertSelective(record);
    }

    
    @Override
    public Area selectByPrimaryKey(Long id) {
        return areaRepository.selectByPrimaryKey(id);
    }

    
    @Override
    public int updateByPrimaryKeySelective(Area record) {
        return areaRepository.updateByPrimaryKeySelective(record);
    }

    
    @Override
    public int updateByPrimaryKey(Area record) {
        return areaRepository.updateByPrimaryKey(record);
    }

}
