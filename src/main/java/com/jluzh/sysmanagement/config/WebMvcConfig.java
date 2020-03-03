package com.jluzh.sysmanagement.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * <p>web跨域配置</p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName WebMvcConfig.java
 * @createTime 2019年11月26日 17:52:00
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedOrigins("http://localhost:8000")
				.allowedMethods("POST","GET","PUT","DELETE","OPTIONS")
				.maxAge(3600)
				.allowCredentials(true);

	}
}
