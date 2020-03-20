package com.jluzh.sysmanagement.domain.service.impl;

import com.jluzh.sysmanagement.domain.entity.Role;
import com.jluzh.sysmanagement.domain.entity.User;
import com.jluzh.sysmanagement.domain.repository.MenuRepository;
import com.jluzh.sysmanagement.domain.repository.RoleRepository;
import com.jluzh.sysmanagement.domain.repository.UserRepository;
import com.jluzh.sysmanagement.domain.service.MenuPermissionService;
import com.jluzh.sysmanagement.infra.pagehelper.Page;
import com.jluzh.sysmanagement.infra.pagehelper.PageRequest;
import com.jluzh.sysmanagement.infra.pagehelper.PageUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName MenuPermissionService.java
 * @createTime 2020年03月18日 20:35:00
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MenuPermissionServiceImpl implements MenuPermissionService {

	private final MenuRepository menuRepository;
	private final UserRepository userRepository;
	private final RoleRepository roleRepository;

	@Override
	public List<String> permission(User user) {
		List<Integer> roleIdList = userRepository.findRoleId(user.getUserId().intValue());
		List<String> permissionList = new ArrayList<>();
		for(Integer i : roleIdList){
			permissionList.addAll(menuRepository.selectByRoleId(i));
		}
		return permissionList;
	}

	@Override
	public Page<Role> selectByMenuId(PageRequest pageRequest,Integer menuId) {
		return PageUtils.getPageResult(pageRequest,()-> roleRepository.selectByMenuId(menuId));
	}
}
