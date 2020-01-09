package com.jluzh.sysmanagement.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p> 角色部门映射 </p>
 * @ClassName RoleToDept.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:53:00
 */
@ApiModel("角色部门映射")
@ToString
@Getter
@Setter
public class RoleToDept implements Serializable {
    /**
    * 角色编号
    */
    @ApiModelProperty(name = "roleId", value = "角色编号")
    private Integer roleId;

    /**
    * 部门编号
    */
    @ApiModelProperty(name = "deptId", value = "部门编号")
    private Integer deptId;

    private static final long serialVersionUID = 1L;


}