package com.jluzh.sysmanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jluzh.sysmanagement.infra.mapper")
public class SysmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SysmanagementApplication.class, args);
	}

}
