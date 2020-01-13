package com.jluzh.sysmanagement.app.service;

import com.jluzh.sysmanagement.domain.entity.RoleToDept;
import org.apache.ibatis.annotations.Param;

/**
 * <p> 角色部门对应服务接口</p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName RoleToDeptService.java
 * @createTime 2019年11月26日 17:01:00
 */
public interface RoleToDeptService {
	int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("deptId") Integer deptId);

	int insert(RoleToDept record);

	int insertSelective(RoleToDept record);
}
