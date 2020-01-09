package com.jluzh.sysmanagement.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p> 角色菜单映射 </p>
 * @ClassName RoleToMenu.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:53:00
 */
@ApiModel("角色菜单映射")
@Getter
@Setter
@ToString
public class RoleToMenu implements Serializable {
    /**
    * 角色编号
    */
    @ApiModelProperty(name = "roleId", value = "角色编号")
    private Integer roleId;

    /**
    * 菜单编号
    */
    @ApiModelProperty(name = "menuId", value = "菜单编号")
    private Integer menuId;

    private static final long serialVersionUID = 1L;


}