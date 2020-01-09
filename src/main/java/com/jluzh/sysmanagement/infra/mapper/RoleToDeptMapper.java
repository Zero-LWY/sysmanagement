package com.jluzh.sysmanagement.infra.mapper;

import com.jluzh.sysmanagement.domain.entity.RoleToDept;
import org.apache.ibatis.annotations.Param;

/**
 * <p> @Description TODO </p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:53:00
 */
public interface RoleToDeptMapper {
    int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("deptId") Integer deptId);

    int insert(RoleToDept record);

    int insertSelective(RoleToDept record);
}