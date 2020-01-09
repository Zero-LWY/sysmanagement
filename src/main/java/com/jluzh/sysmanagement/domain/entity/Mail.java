package com.jluzh.sysmanagement.domain.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mail {

    @Pattern(regexp = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$", message = "邮箱格式不正确")
	@ApiModelProperty(name = "to", value = "目的地址")
	private String to;

    @NotBlank(message = "标题不能为空")
	@ApiModelProperty(name = "title", value = "标题")
    private String title;

    @NotBlank(message = "正文不能为空")
	@ApiModelProperty(name = "content", value = "正文")
    private String content;

	@ApiModelProperty(name = "msgId", value = "消息Id")
    private String msgId;

}
