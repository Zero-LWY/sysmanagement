package com.jluzh.sysmanagement.domain.repository;

import com.jluzh.sysmanagement.domain.entity.User;

import java.util.List;

/**
 * <p>用户仓库接口</p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName UserRepository.java
 * @createTime 2019年11月26日 16:43:00
 */
public interface UserRepository {
	List<User> selectUserList(User user);

	User login(User user);

	User selectByMail(String mail);

	Integer updateSelective(User user);


	List<Integer> findRoleId(Integer userId);

	int deleteByPrimaryKey(Integer userId);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer userId);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}
