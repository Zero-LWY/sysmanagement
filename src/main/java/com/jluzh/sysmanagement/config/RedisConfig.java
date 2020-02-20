package com.jluzh.sysmanagement.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName RedisConfig.java
 * @createTime 2020年02月20日 11:42:00
 */
@Configuration
@EnableCaching
@Slf4j
public class RedisConfig extends CachingConfigurerSupport {


	@Value("${spring.redis.host}")
	private String host;

	@Value("${spring.redis.port}")
	private int port;

	@Value("${spring.redis.jedis.pool.max-idle}")
	private int maxIdle;

	@Value("${spring.redis.jedis.pool.max-wait}")
	private long maxWaitMillis;

	@Value("${spring.redis.password}")
	private String password;

	@Bean
	public JedisPool redisPoolFactory() {
		log.info("JedisPool注入成功！！");
		log.info("redis地址：" + host + ":" + port);
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		jedisPoolConfig.setMaxIdle(maxIdle);
		jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);

		JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port);

		return jedisPool;
	}

}