package com.jluzh.sysmanagement.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p> 角色 </p>
 * @ClassName Role.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:52:00
 */
@ApiModel("角色")
@Getter
@Setter
@ToString
public class Role implements Serializable {
    /**
    * 编号
    */
    @ApiModelProperty(name = "id", value = "编号")
    private Integer id;

    /**
    * 角色名称
    */
    @ApiModelProperty(name = "name", value = "角色名称")
    private String name;

    /**
     * 更新者
     */
    @ApiModelProperty(name = "updateBy", value = "更新者")
    private String updateBy;

    /**
     * 更新时间
     */
    @ApiModelProperty(name = "updateDate", value = "更新时间")
    private LocalDateTime updateDate;

    /**
     * 备注信息
     */
    @ApiModelProperty(name = "remarks", value = "备注信息")
    private String remarks;

    /**
     * 删除标记
     */
    @ApiModelProperty(name = "delFlag", value = "删除标记")
    private String delFlag;

    private static final long serialVersionUID = 1L;


}