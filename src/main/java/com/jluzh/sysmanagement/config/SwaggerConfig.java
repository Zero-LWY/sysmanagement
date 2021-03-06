package com.jluzh.sysmanagement.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * <p> swagger配置 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName SwaggerConfig.java
 * @createTime 2019年11月25日 15:28:00
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo(
				"lwy 毕业设计 Swagger接口测试文档",
				"学校地址：http://www.jluzh.com/，欢迎大家访问。",
				"API V1.0",
				"Terms of service",
				new Contact("lwy", "http://www.jluzh.com/", "1243426954@qq.com"),
				"Apache", "http://www.apache.org/", Collections.emptyList());
	}

}