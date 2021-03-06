package com.jluzh.sysmanagement.infra.mapper;

import com.jluzh.sysmanagement.domain.entity.Dept;

import java.util.List;

/**
 * <p>部门mapper</p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:51:00
 */
public interface DeptMapper {
    
    List<Dept> selectList(Dept dept);
    
    int deleteByPrimaryKey(Integer id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}