package com.jluzh.sysmanagement.infra.util;

import com.alibaba.fastjson.JSON;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


/**
 * <p> redis操作工具类 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName Jedisutil.java
 * @createTime 2020年02月19日 10:31:00
 */
@Component
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class JedisUtil {


	private final JedisPool jedisPool;

	/**
	 * <p> 获取当个对象 </p>
	 * @param key	键值
	 * @param clazz	类型
	 * @return: T
	 * @Author: lian.weiyuan@hand-china.com
	 * @date: 2020/2/19 11:13
	 */
	public <T> T get(String key,Class<T> clazz){
		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
			String str = jedis.get(key);
			return stringtoBean(str,clazz);
		}catch(Exception e){
			log.error("get key:{} error",key);
			return null;
		}finally{
			returnToPool(jedis);
		}
	}


	/**
	 * <p> 设置对象 </p>
	 * @param key	键值
	 * @param value	对象值
	 * @param expireTime 超时时间
	 * @return: boolean
	 * @Author: lian.weiyuan@hand-china.com
	 * @date: 2020/2/19 11:13
	 */
	public <T> boolean set(String key,T value,int expireTime ){
		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
			String str = beanToString(value);
			if(str == null || str.length() <= 0){
				return false;
			}
			if(expireTime <= 0){
				jedis.set(key,str);
			}else{
				jedis.setex(key,expireTime,str);
			}
			return true;
		}catch(Exception e){
			log.error("set key:{} value:{} time:{} error",key,value,expireTime);
			return false;
		}finally{
			returnToPool(jedis);
		}
	}

	/**
	 * <p> 判断键值是否存在 </p>
	 * @param key	键值
	 * @return: boolean
	 * @Author: lian.weiyuan@hand-china.com
	 * @date: 2020/2/19 11:14
	 */
	public <T> boolean exists(String key){
		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
			return jedis.exists(key);
		}catch(Exception e){
			log.error("exists key:{} error",key);
			return false;
		}finally{
			returnToPool(jedis);
		}
	}

	/**
	 * <p> 设置过期时间: </p>
	 * @param key	键值
	 * @param expireTime 过期时间
	 * @return: java.lang.Long
	 * @Author: lian.weiyuan@hand-china.com
	 * @date: 2020/2/19 11:14
	 */
	public Long expire(String key,int expireTime){
		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
			return jedis.expire(key,expireTime);
		}catch(Exception e){
			log.error("expire key:{} expireTime:{} error",key,expireTime);
			return null;
		}finally{
			returnToPool(jedis);
		}
	}


	/**
	 * <p> 获取当前key的剩余时间</p>
	 * @param key	键值
	 * @return: java.lang.Long
	 * @Author: lian.weiyuan@hand-china.com
	 * @date: 2020/2/19 11:15
	 */
	public Long ttl(String key){
		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
			return jedis.ttl(key);
		}catch(Exception e){
			log.error("ttl key:{}  error",key);
			return null;
		}finally{
			returnToPool(jedis);
		}
	}



	/**
	 * <p> 对象转string </p>
	 * @param value	对象值
	 * @return: java.lang.String
	 * @Author: lian.weiyuan@hand-china.com
	 * @date: 2020/2/19 11:15
	 */
	private <T> String beanToString(T value){
		if(value == null){
			return null;
		}
		Class<?> clazz = value.getClass();
		if(clazz == int.class || clazz ==Integer.class){
			return ""+value;
		}else if(clazz == String.class){
			return (String) value;
		}else if (clazz == long.class || Long.class == clazz){
			return ""+value;
		}else{
			return JSON.toJSONString(value);
		}
	}


	/**
	 * <p> string转对象: </p>
	 * @param str	string值
	 * @param clazz	类型
	 * @return: T
	 * @Author: lian.weiyuan@hand-china.com
	 * @date: 2020/2/19 11:16
	 */
	private <T> T stringtoBean(String str ,Class<T> clazz){
		if(str == null || str.length() <=0 || clazz == null){
			return null;
		}
		if(clazz == int.class || clazz == Integer.class){
			return (T)Integer.valueOf(str);
		}else if(clazz == String.class){
			return (T)str;
		}else if(clazz == long.class || clazz == Long.class){
			return (T)Long.valueOf(str);
		}else{
			return JSON.toJavaObject(JSON.parseObject(str),clazz);
		}
	}

	private void returnToPool(Jedis jedis){
		if(jedis != null){
			jedis.close();
		}
	}

}
