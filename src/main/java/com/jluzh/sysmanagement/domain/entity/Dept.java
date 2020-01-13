package com.jluzh.sysmanagement.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p> 部门 </p>
 * @ClassName Dept.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:51:00
 */
@ApiModel("部门")
@Getter
@Setter
@ToString
public class Dept implements Serializable {
    /**
    * 编号
    */
    @ApiModelProperty(name = "id", value = "id")
    private Integer id;

    /**
    * 父级编号
    */
    @ApiModelProperty(name = "parentId", value = "父级编码")
    private Integer parentId;

    /**
    * 名称
    */
    @ApiModelProperty(name = "name", value = "名称")
    private String name;

    /**
    * 排序
    */
    @ApiModelProperty(name = "sort", value = "排序")
    private Long sort;

    /**
    * 区域编码
    */
    @ApiModelProperty(name = "code", value = "区域编码")
    private String code;

    /**
    * 联系地址
    */
    @ApiModelProperty(name = "address", value = "联系地址")
    private String address;

    /**
    * 负责人
    */
    @ApiModelProperty(name = "master", value = "负责人")
    private String master;

    /**
    * 电话
    */
    @ApiModelProperty(name = "phone", value = "电话")
    private String phone;

    /**
    * 传真
    */
    @ApiModelProperty(name = "fax", value = "传真")
    private String fax;

    /**
    * 邮箱
    */
    @ApiModelProperty(name = "email", value = "邮箱")
    private String email;

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