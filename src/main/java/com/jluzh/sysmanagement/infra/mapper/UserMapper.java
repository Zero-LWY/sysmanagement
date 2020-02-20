package com.jluzh.sysmanagement.infra.mapper;

import com.jluzh.sysmanagement.domain.entity.User;

import java.util.List;

/**
 * <p> 用户接口 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName UserMapper.java
 * @createTime 2019年11月25日 18:43:00
 */
public interface UserMapper {

	 List<User> selectUserList(User user);

	 User login(User user);

	 User selectByMail(String mail);

}
