package com.jluzh.sysmanagement.domain.service;

import com.jluzh.sysmanagement.domain.entity.Role;
import com.jluzh.sysmanagement.domain.entity.User;
import com.jluzh.sysmanagement.infra.pagehelper.Page;
import com.jluzh.sysmanagement.infra.pagehelper.PageRequest;

import java.util.List;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName MenuPermissionService.java
 * @createTime 2020年03月18日 20:34:00
 */
public interface MenuPermissionService {

	List<String> permission(User user);

	Page<Role> selectByMenuId(PageRequest pageRequest ,Integer menuId);
}
