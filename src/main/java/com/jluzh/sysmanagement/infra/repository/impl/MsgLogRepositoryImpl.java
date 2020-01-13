package com.jluzh.sysmanagement.infra.repository.impl;

import com.jluzh.sysmanagement.domain.entity.MsgLog;
import com.jluzh.sysmanagement.domain.repository.MsgLogRepository;
import com.jluzh.sysmanagement.infra.mapper.MsgLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * <p>队列错误仓库实现类</p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName MsgLogRepositoryImpl.java
 * @createTime 2020年01月08日 16:59:00
 */
@Component
public class MsgLogRepositoryImpl implements MsgLogRepository {

	@Autowired
	private MsgLogMapper msgLogMapper;

	@Override
	public int deleteByPrimaryKey(String msgId) {
		return msgLogMapper.deleteByPrimaryKey(msgId);
	}

	@Override
	public int insert(MsgLog record) {
		return msgLogMapper.insert(record);
	}

	@Override
	public int insertSelective(MsgLog record) {
		return 0;
	}

	@Override
	public MsgLog selectByMsgId(String msgId) {
		return msgLogMapper.selectByPrimaryKey(msgId);
	}

	@Override
	public int updateByPrimaryKeySelective(MsgLog record) {
		return msgLogMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(MsgLog record) {
		return msgLogMapper.updateByPrimaryKey(record);
	}

	@Override
	public void updateStatus(String msgId, Integer status){
		MsgLog msgLog = new MsgLog().setMsgId(msgId).setStatus(status).setUpdateTime(new Date());
		msgLogMapper.updateStatus(msgLog);
	}
}
