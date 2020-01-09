package com.jluzh.sysmanagement.app.service;

import com.jluzh.sysmanagement.domain.entity.RoleToArea;
import org.apache.ibatis.annotations.Param;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName RoleToAreaService.java
 * @createTime 2019年11月26日 17:01:00
 */
public interface RoleToAreaService {
	int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("areaId") Integer areaId);

	int insert(RoleToArea record);

	int insertSelective(RoleToArea record);
}
