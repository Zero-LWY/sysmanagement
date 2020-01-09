package com.jluzh.sysmanagement;

import com.jluzh.sysmanagement.domain.entity.WinvStockLog;
import com.jluzh.sysmanagement.infra.mapper.WinvStockLogMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.jluzh.sysmanagement.infra.mapper")
class SysmanagementApplicationTests {
	@Autowired
	private WinvStockLogMapper winvStockLogMapper;
	@Test
	void contextLoads() {
		List<WinvStockLog> list = winvStockLogMapper.selectWinvStockLogList();
		System.out.println(list.size());
	}

}
