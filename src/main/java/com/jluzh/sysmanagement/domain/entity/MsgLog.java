package com.jluzh.sysmanagement.domain.entity;

import com.jluzh.sysmanagement.infra.constant.Constant;
import com.jluzh.sysmanagement.infra.util.JodaTimeUtil;
import com.jluzh.sysmanagement.infra.util.JsonUtil;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p> @Description TODO </p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2020年01月08日 15:21:00
 */
@Data
@Accessors(chain = true)
public class MsgLog implements Serializable {
    /**
    * 消息唯一标识
    */
    private String msgId;

    /**
    * 消息体, json格式化
    */
    private String msg;

    /**
    * 交换机
    */
    private String exchange;

    /**
    * 路由键
    */
    private String routingKey;

    /**
    * 状态: 0投递中 1投递成功 2投递失败 3已消费
    */
    private Integer status;

    /**
    * 重试次数
    */
    private Integer tryCount;

    /**
    * 下一次重试时间
    */
    private Date nextTryTime;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public MsgLog(){

	}


	public MsgLog(String msgId, Object msg, String exchange, String routingKey) {
		this.msgId = msgId;
		this.msg = JsonUtil.objToStr(msg);
		this.exchange = exchange;
		this.routingKey = routingKey;

		this.status = Constant.MsgLogStatus.DELIVERING;
		this.tryCount = 0;

		Date date = new Date();
		this.createTime = date;
		this.updateTime = date;
		this.nextTryTime = (JodaTimeUtil.plusMinutes(date, 1));
	}
}