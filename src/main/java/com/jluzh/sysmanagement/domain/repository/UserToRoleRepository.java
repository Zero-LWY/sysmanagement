package com.jluzh.sysmanagement.domain.repository;

import com.jluzh.sysmanagement.domain.entity.UserToRole;
import org.apache.ibatis.annotations.Param;

/**
 * <p> 用户角色仓库接口 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName UserToRoleRepository.java
 * @createTime 2019年11月26日 16:43:00
 */
public interface  UserToRoleRepository {
	int deleteByPrimaryKey(@Param("userId") Integer userId, @Param("roleId") Integer roleId);

	int insert(UserToRole record);

	int insertSelective(UserToRole record);
}
