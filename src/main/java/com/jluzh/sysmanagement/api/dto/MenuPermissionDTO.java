package com.jluzh.sysmanagement.api.dto;

import lombok.Data;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName MenuPermissionDTO.java
 * @createTime 2020年03月19日 20:24:00
 */
@Data
public class MenuPermissionDTO {

	private Integer menuId;
	private Integer roleId;
	private String name;

}
