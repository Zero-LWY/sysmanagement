package com.jluzh.sysmanagement.domain.repository;

import com.jluzh.sysmanagement.domain.entity.MsgLog;

/**
 * <p> 队列错误记录仓库 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName MsgLogRepository.java
 * @createTime 2020年01月08日 16:58:00
 */
public interface MsgLogRepository {
	int deleteByPrimaryKey(String msgId);

	int insert(MsgLog record);

	int insertSelective(MsgLog record);

	MsgLog selectByMsgId(String msgId);

	int updateByPrimaryKeySelective(MsgLog record);

	int updateByPrimaryKey(MsgLog record);

	void updateStatus(String msgId, Integer status);
}
