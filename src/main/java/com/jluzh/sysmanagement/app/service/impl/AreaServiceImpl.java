package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.AreaService;
import com.jluzh.sysmanagement.domain.entity.Area;
import com.jluzh.sysmanagement.domain.repository.AreaRepository;
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
    public List<Area> list(Area area) {
        return areaRepository.selectList(area);
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
