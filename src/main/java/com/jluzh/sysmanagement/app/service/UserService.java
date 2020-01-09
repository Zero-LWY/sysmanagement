package com.jluzh.sysmanagement.app.service;

import com.jluzh.sysmanagement.domain.entity.User;

import java.util.List;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName UserService.java
 * @createTime 2019年11月25日 18:58:00
 */
public interface UserService {
	List<User> selectUserList(User user);
}
