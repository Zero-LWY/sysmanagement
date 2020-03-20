package com.jluzh.sysmanagement.infra.enums;

import com.jluzh.sysmanagement.api.dto.LoginUserDTO;
import com.jluzh.sysmanagement.app.service.UserService;
import com.jluzh.sysmanagement.domain.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName LoginEnum.java
 * @createTime 2020年03月20日 11:51:00
 */
@Component
public enum LoginEnum {

	/**
	 * <p> 通过账号密码登陆: </p>
	 * @param null
	 * @return:
	 * @Author: lian.weiyuan@hand-china.com
	 * @date: 2020/3/20 14:30
	 */
	PASSWORD{
		@Override
		public User login(LoginUserDTO loginUserDTO) {
			User user = new User();
			BeanUtils.copyProperties(loginUserDTO,user);
			return getUserService().login(user);
		}
	},
	/**
	 * <p> 邮箱登陆 </p>
	 * @param null
	 * @return:
	 * @Author: lian.weiyuan@hand-china.com
	 * @date: 2020/3/20 14:31
	 */
	EMAIL{

		@Override
		public User login(LoginUserDTO loginUserDTO) {
			User user = new User();
			BeanUtils.copyProperties(loginUserDTO,user);
			return getUserService().emailLogin(user,loginUserDTO.getCode());
		}
	};

	@Autowired
	UserService userService;
	public void setUserService(UserService userService){
		this.userService = userService;
	}
	UserService getUserService(){
		return this.userService;
	}


	public abstract User login(LoginUserDTO loginUserDTO);
}
