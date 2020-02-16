package com.jluzh.sysmanagement;

import com.jluzh.sysmanagement.infra.mapper.WinvStockLogMapper;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
@MapperScan("com.jluzh.sysmanagement.infra.mapper")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
class SysmanagementApplicationTests {
	@Autowired
	private WinvStockLogMapper winvStockLogMapper;
	private final RedisTemplate redisTemplate;

	@Test
	void contextLoads() {
		redisTemplate.opsForValue().set("hello","1");
	}

}
