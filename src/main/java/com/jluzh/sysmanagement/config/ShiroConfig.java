package com.jluzh.sysmanagement.config;

import com.jluzh.sysmanagement.infra.constant.Constant;
import com.jluzh.sysmanagement.infra.shiro.RedisSessionDao;
import com.jluzh.sysmanagement.infra.shiro.UserAuthorizingRealm;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Shiro 配置类 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName ShiroConfig.java
 * @createTime 2020年01月14日 14:19:00
 */
@Configuration
public class ShiroConfig {




	/**
	 * <p> 配置安全管理器,shiro最核心的组件 </p>
	 * @param userAuthorizingRealm
	 * @return: org.apache.shiro.mgt.SecurityManager
	 * @Author: lian.weiyuan@hand-china.com
	 * @date: 2020/1/14 14:38
	 */
	@Bean
	public SecurityManager securityManager(UserAuthorizingRealm userAuthorizingRealm, RedisSessionDao redisSessionDao){
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(userAuthorizingRealm);
		//取消Cookie中的RememberMe参数
		securityManager.setRememberMeManager(null);
		//配置自定义Session管理器
		securityManager.setSessionManager(defaultWebSessionManager(redisSessionDao));
		return securityManager;
	}


	@Bean
	public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager){
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		//登录,无权限是跳转的路径
		shiroFilterFactoryBean.setLoginUrl("/login/do_login");
		//登录成功后跳转的路径
		shiroFilterFactoryBean.setSuccessUrl("/main");
		//认证不通过跳转页面
		shiroFilterFactoryBean.setUnauthorizedUrl("/error");

		//添加登录过滤器
//		Map<String, Filter> filters = new LinkedHashMap<>();
//		// 这里注释的一行是我这次踩的一个小坑，我一开始按下面这么配置产生了一个我意料之外的问题
//		// 详细分析见博客：https://www.guitu18.com/post/2020/01/06/64.html
//		// filters.put("authLogin", authLoginFilter());
//		// 正确的配置是需要我们自己new出来，不能将这个Filter交给Spring管理
//		filters.put("authLogin", new AuthLoginFilter(500, "未登录或登录超时"));
//		shiroFilterFactoryBean.setFilters(filters);

		//配置拦截规则
		Map<String,String> filterChainMap = new LinkedHashMap<>();
		//首页配置放行
		filterChainMap.put("/","anon");
		filterChainMap.put("/login/**","anon");
		filterChainMap.put("/email/send","anon");
		filterChainMap.put("/**","authc");
		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainMap);
		return shiroFilterFactoryBean;
	}

	/**
	 * <p> 代理生成器，需要借助SpringAOP来扫描@RequiresRoles和@RequiresPermissions等注解。
	 *     生成代理类实现功能增强，从而实现权限控制。
	 *     需要配合AuthorizationAttributeSourceAdvisor一起使用，否则权限注解无效。 </p>
	 * @Param:
	 * @return: org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator
	 * @Author: lian.weiyuan@hand-china.com
	 * @date: 2020/1/16 11:13
	 */
	@Bean
	public DefaultAdvisorAutoProxyCreator lifecycleBeanPostProcessor(){
		DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
		advisorAutoProxyCreator.setProxyTargetClass(true);
		return advisorAutoProxyCreator;
	}
	@Bean
	public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager){
		AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
		advisor.setSecurityManager(securityManager);
		return advisor;
	}

	/**
	 * <p>  自定义Session管理器</p>
	 * @param redisSessionDao
	 * @return: org.apache.shiro.web.session.mgt.DefaultWebSessionManager
	 * @Author: lian.weiyuan@hand-china.com
	 * @date: 2020/1/16 16:10
	 */
	@Bean
	public DefaultWebSessionManager defaultWebSessionManager(RedisSessionDao redisSessionDao){
		DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
		sessionManager.setGlobalSessionTimeout(Constant.Redis.EXPIRE_TIME * 1000);
		sessionManager.setDeleteInvalidSessions(true);
		sessionManager.setSessionDAO(redisSessionDao);
		sessionManager.setSessionValidationSchedulerEnabled(true);
		sessionManager.setDeleteInvalidSessions(true);
		/**
		 * 修改Cookie中的SessionId的key，默认为JSESSIONID，自定义名称
		 */
		sessionManager.setSessionIdCookie(new SimpleCookie("JSESSIONID"));
		return sessionManager;
	}

}
