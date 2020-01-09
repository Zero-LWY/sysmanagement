package com.jluzh.sysmanagement.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * <p> 菜单 </p>
 * @ClassName Menu.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2019年11月26日 15:51:00
 */
@ApiModel("菜单")
@Setter
@Getter
@ToString
public class Menu implements Serializable {
    /**
    * 编号
    */
    @ApiModelProperty(name = "id", value = "编号")
    private Integer id;

    /**
    * 父级编号
    */
    @ApiModelProperty(name = "parentId", value = "父级编号")
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
    * 链接
    */
    @ApiModelProperty(name = "href", value = "链接")
    private String href;

    /**
    * 目标
    */
    @ApiModelProperty(name = "target", value = "目标")
    private String target;

    /**
    * 图标
    */
    @ApiModelProperty(name = "icon", value = "图标")
    private String icon;

    /**
    * 是否在菜单中显示
    */
    @ApiModelProperty(name = "isShow", value = "是否展示")
    private String isShow;

    /**
    * 权限标识
    */
    @ApiModelProperty(name = "permission", value = "权限标识")
    private String permission;

    /**
     * 更新者
     */
    @ApiModelProperty(name = "updateBy", value = "更新者")
    private String updateBy;

    /**
     * 更新时间
     */
    @ApiModelProperty(name = "updateDate", value = "更新时间")
    private Date updateDate;

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