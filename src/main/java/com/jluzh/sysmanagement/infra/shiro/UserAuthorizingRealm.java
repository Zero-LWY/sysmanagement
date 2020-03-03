package com.jluzh.sysmanagement.infra.shiro;

import com.jluzh.sysmanagement.domain.entity.User;
import com.jluzh.sysmanagement.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * <p> shiro  用户授权类 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName UserAuthorizingRealm.java
 * @createTime 2020年01月14日 14:28:00
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserAuthorizingRealm extends AuthorizingRealm {

	private  final UserRepository userRepository;
	/**
	 * <p> 授权验证,获取授权信息 </p>
	 * @param principals
	 * @return: org.apache.shiro.authz.AuthorizationInfo
	 * @Author: lian.weiyuan@hand-china.com
	 * @date: 2020/1/14 14:30
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		User user = (User) principals.getPrimaryPrincipal();
		List<String> perms = new ArrayList<>();
		// 系统管理员拥有最高权限
//		if (User.SUPER_ADMIN == user.getId()) {
//			perms = loginService.getAllPerms();
//		} else {
//			perms = loginService.getUserPerms(user.getId());
//		}
		//perms = userService.getAllPerms();
		// 权限Set集合
		Set<String> permsSet = new HashSet<>();
		for (String perm : perms) {
			permsSet.addAll(Arrays.asList(perm.trim().split(",")));
		}

		// 返回权限
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.setStringPermissions(permsSet);
		return info;
	}

	/**
	 * <p> 登录验证,获取身份信息</p>
	 * @param authenticationToken
	 * @return: org.apache.shiro.authc.AuthenticationInfo
	 * @Author: lian.weiyuan@hand-china.com
	 * @date: 2020/1/14 14:33
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

		User loginUser = new User();
		loginUser.setPassword((String.copyValueOf(token.getPassword())));
		loginUser.setLoginName(token.getUsername());
		User user = userRepository.login(loginUser);
		if(user == null){
			throw new UnknownAccountException("账号或密码不正确");
		}
		return new SimpleAuthenticationInfo(user, user.getPassword(), getName());
	}
}
