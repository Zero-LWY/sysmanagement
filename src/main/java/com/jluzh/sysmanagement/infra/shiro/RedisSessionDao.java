package com.jluzh.sysmanagement.infra.shiro;

import com.jluzh.sysmanagement.infra.constant.Constant;
import lombok.RequiredArgsConstructor;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.AbstractSessionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/**
 * <p> 用户登录session操作 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName RedisSessionDao.java
 * @createTime 2020年01月16日 15:40:00
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RedisSessionDao extends AbstractSessionDAO {

	private final RedisTemplate redisTemplate;
	@Override
	protected Serializable doCreate(Session session) {
		Serializable sessionId = this.generateSessionId(session);
		this.assignSessionId(session,sessionId);
		redisTemplate.opsForValue().set(session.getId(),session, Constant.Redis.EXPIRE_TIME, TimeUnit.SECONDS);
		return sessionId;
	}

	@Override
	protected Session doReadSession(Serializable sessionId) {
		return sessionId == null ? null : (Session) redisTemplate.opsForValue().get(sessionId);
	}

	@Override
	public void update(Session session) throws UnknownSessionException {
		if(session != null && session.getId() != null){
			session.setTimeout(Constant.Redis.EXPIRE_TIME * 1000);
			redisTemplate.opsForValue().set(session.getId(),session, Constant.Redis.EXPIRE_TIME, TimeUnit.SECONDS);
		}
	}

	@Override
	public void delete(Session session) {
		if (session != null && session.getId() != null) {
			redisTemplate.opsForValue().getOperations().delete(session.getId());
		}
	}

	@Override
	public Collection<Session> getActiveSessions() {
		return redisTemplate.keys("*");
	}
}
