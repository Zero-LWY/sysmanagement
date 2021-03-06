package com.jluzh.sysmanagement.app.service.impl;


import com.jluzh.sysmanagement.app.service.AreaService;
import com.jluzh.sysmanagement.domain.entity.Area;
import com.jluzh.sysmanagement.domain.repository.AreaRepository;
import com.jluzh.sysmanagement.infra.pagehelper.Page;
import com.jluzh.sysmanagement.infra.pagehelper.PageRequest;
import com.jluzh.sysmanagement.infra.pagehelper.PageUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return PageUtils.getPageResult(pageRequest,()->areaRepository.selectList(area));
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
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
    public Area selectByPrimaryKey(Integer id) {
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
