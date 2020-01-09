package com.jluzh.sysmanagement.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p> 角色区域映射 </p>
 * @ClassName RoleToArea.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:52:00
 */
@ApiModel("角色区域映射")
@Getter
@Setter
@ToString
public class RoleToArea implements Serializable {
    /**
    * 角色编号
    */
    @ApiModelProperty(name = "roleId", value = "角色编号")
    private Integer roleId;

    /**
    * 菜单编号
    */
    @ApiModelProperty(name = "areaId", value = "菜单编号")
    private Integer areaId;

    private static final long serialVersionUID = 1L;


}