package com.jluzh.sysmanagement.app.service;

import com.jluzh.sysmanagement.domain.entity.User;
import com.jluzh.sysmanagement.infra.pagehelper.Page;
import com.jluzh.sysmanagement.infra.pagehelper.PageRequest;

import java.util.List;

/**
 * <p> 用户服务接口</p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName UserService.java
 * @createTime 2019年11月25日 18:58:00
 */
public interface UserService {
	Page<User> selectUserList(User user , PageRequest pageRequest);

	int deleteByPrimaryKey(Integer id);

	int insert(User user);

	int insertSelective(User user);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User user);

	int updateByPrimaryKey(User user);

	User login(User user);

	String resetPassword(User user,String code);

	List<String> getAllPerms();

	List<String> getUserPerms(Integer userId);

	User findUserByEmail(String email);

	User emailLogin(User user, String code);
}
