package com.jluzh.sysmanagement.app.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.jluzh.sysmanagement.domain.entity.MsgLog;
import com.jluzh.sysmanagement.infra.mapper.MsgLogMapper;
import com.jluzh.sysmanagement.app.service.MsgLogService;
/**
 * <p> @Description TODO </p>
 * @ClassName ${NAME}.java
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @createTime 2020年01月08日 15:21:00
 */
@Service
public class MsgLogServiceImpl implements MsgLogService{

    @Resource
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
        return msgLogMapper.insertSelective(record);
    }

    @Override
    public MsgLog selectByPrimaryKey(String msgId) {
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

}
