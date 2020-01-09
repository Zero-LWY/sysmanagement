package com.jluzh.sysmanagement.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p> 用户角色映射 </p>
 * @ClassName UserToRole.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:53:00
 */
@ApiModel("用户角色映射")
@Getter
@Setter
@ToString
public class UserToRole implements Serializable {
    /**
    * 用户编号
    */
    @ApiModelProperty(name = "userId", value = "用户id")
    private Integer userId;

    /**
    * 角色编号
    */
    @ApiModelProperty(name = "roleId", value = "角色编号")
    private Integer roleId;

    private static final long serialVersionUID = 1L;


}