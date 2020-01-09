package com.jluzh.sysmanagement.domain.repository;

import com.jluzh.sysmanagement.domain.entity.RoleToDept;
import org.apache.ibatis.annotations.Param;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName RoleToDeptRepository.java
 * @createTime 2019年11月26日 16:42:00
 */
public interface RoleToDeptRepository {
	int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("deptId") Integer deptId);

	int insert(RoleToDept record);

	int insertSelective(RoleToDept record);
}
