package com.jluzh.sysmanagement.infra.mapper;

import com.jluzh.sysmanagement.domain.entity.MsgLog;

/**
 * <p> @Description TODO </p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2020年01月08日 15:21:00
 */
public interface MsgLogMapper {
    int deleteByPrimaryKey(String msgId);

    int insert(MsgLog record);

    int insertSelective(MsgLog record);

    MsgLog selectByPrimaryKey(String msgId);

    int updateByPrimaryKeySelective(MsgLog record);

    int updateByPrimaryKey(MsgLog record);

	void updateStatus(MsgLog msgLog);
}