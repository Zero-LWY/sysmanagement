package com.jluzh.sysmanagement.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p> 值集 </p>
 * @ClassName Dict.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:51:00
 */
@ApiModel("值集")
@Setter
@Getter
@ToString
public class Dict implements Serializable {
    /**
    * 编号
    */
    @ApiModelProperty(name = "id", value = "编号")
    private Integer id;

    /**
    * 数据值
    */
    @ApiModelProperty(name = "value", value = "数据值")
    private String value;

    /**
    * 标签名
    */
    @ApiModelProperty(name = "label", value = "标签名")
    private String label;

    /**
    * 类型
    */
    @ApiModelProperty(name = "type", value = "类型")
    private String type;

    /**
    * 描述
    */
    @ApiModelProperty(name = "description", value = "描述")
    private String description;

    /**
    * 排序（升序）
    */
    @ApiModelProperty(name = "sort", value = "排序")
    private Long sort;

    /**
    * 父级编号
    */
    @ApiModelProperty(name = "parentId", value = "父级节点")
    private String parentId;

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