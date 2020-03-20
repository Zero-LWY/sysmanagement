package com.jluzh.sysmanagement.api.dto;

import lombok.Data;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName LoginUserDTO.java
 * @createTime 2020年03月20日 09:18:00
 */
@Data
public class LoginUserDTO {

	private String userName;
	private String loginName;
	private String password;
	private String email;
	private String code;
	private String type;
}
