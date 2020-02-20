package com.jluzh.sysmanagement.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p> 用户实体 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName User.java
 * @createTime 2019年11月25日 16:36:00
 */
@ApiModel("用户实体")
@Getter
@Setter
@ToString
public class User implements Serializable {


	private static final long serialVersionUID = 6566516211603581252L;
	@ApiModelProperty(name = "userId", value = "用户id")
	private Long userId;
	@ApiModelProperty(name = "deptId", value = "部门id")
	private Long deptId;
	@ApiModelProperty(name = "loginName", value = "登录名")
	private String loginName;
	@ApiModelProperty(name = "password", value = "密码")
	private String password;
	@ApiModelProperty(name = "userNo", value = "用户number")
	private String userNo;
	@ApiModelProperty(name = "userName", value = "用户名称")
	private String userName;
	@ApiModelProperty(name = "email", value = "邮箱")
	private String email;
	@ApiModelProperty(name = "phone", value = "电话")
	private String phone;
	@ApiModelProperty(name = "mobile", value = "移动电话")
	private String mobile;
	@ApiModelProperty(name = "updateBy", value = "更新人")
	private String updateBy;
	@ApiModelProperty(name = "updateDate", value = "更新时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime updateTime;
	@ApiModelProperty(name = "remarks", value = "评论")
	private String remarks;

}
