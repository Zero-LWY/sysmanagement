package com.jluzh.sysmanagement.domain.repository;

import com.jluzh.sysmanagement.domain.entity.RoleToArea;
import org.apache.ibatis.annotations.Param;

/**
 * <p> 角色区域对应仓库接口</p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName RoleToAreaRepository.java
 * @createTime 2019年11月26日 16:42:00
 */
public interface RoleToAreaRepository {
	int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("areaId") Integer areaId);

	int insert(RoleToArea record);

	int insertSelective(RoleToArea record);

}
