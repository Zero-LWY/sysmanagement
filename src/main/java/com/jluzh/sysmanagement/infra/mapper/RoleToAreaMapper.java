package com.jluzh.sysmanagement.infra.mapper;

import com.jluzh.sysmanagement.domain.entity.RoleToArea;
import org.apache.ibatis.annotations.Param;

/**
 * <p> @Description TODO </p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:52:00
 */
public interface RoleToAreaMapper {
    int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("areaId") Integer areaId);

    int insert(RoleToArea record);

    int insertSelective(RoleToArea record);
}