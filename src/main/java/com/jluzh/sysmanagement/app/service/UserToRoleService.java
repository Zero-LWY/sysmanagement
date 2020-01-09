package com.jluzh.sysmanagement.app.service;

import com.jluzh.sysmanagement.domain.entity.UserToRole;
import org.apache.ibatis.annotations.Param;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName UserToRoleService.java
 * @createTime 2019年11月26日 17:02:00
 */
public interface UserToRoleService {
	int deleteByPrimaryKey(@Param("userId") Integer userId, @Param("roleId") Integer roleId);

	int insert(UserToRole record);

	int insertSelective(UserToRole record);
}
