package com.jluzh.sysmanagement.app.service.impl;

import com.jluzh.sysmanagement.app.service.UserService;
import com.jluzh.sysmanagement.domain.entity.User;
import com.jluzh.sysmanagement.domain.repository.UserRepository;
import com.jluzh.sysmanagement.infra.util.JedisUtil;
import lombok.RequiredArgsConstructor;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * <p> 用户服务实现类</p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName UserServiceImpl.java
 * @createTime 2019年11月25日 19:02:00
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final JedisUtil jedisUtil;

	@Override
	public List<User> selectUserList(User user) {
		return userRepository.selectUserList(user);
	}

	@Override
	public User login(User user) {
		try {
			UsernamePasswordToken token = new UsernamePasswordToken(user.getLoginName(), user.getPassword());
			token.setRememberMe(true);
			Subject subject = SecurityUtils.getSubject();
			subject.login(token);
			return (User) subject.getPrincipal();
		}catch (Exception e){
			return null;
		}
	}
	/**
	 * 获取所有权限
	 *
	 * @return
	 */
	@Override
	public List<String> getAllPerms() {
		List<String> list = new ArrayList<>();
		list.add("user:selectList");
		list.add("user:info");
		list.add("user:save");
		list.add("user:update");
		list.add("user:delete");
		return list;
	}

	/**
	 * 获取用户权限
	 *
	 * @param userId
	 * @return
	 */
	@Override
	public List<String> getUserPerms(Integer userId) {
		List<String> list = new ArrayList<>();
		list.add("user:selectList");
		return list;
	}

	@Override
	public String resetPassword(User newUser, String code) {
		String mail = newUser.getEmail();
		User user = userRepository.selectByMail(mail);
		if(user == null){
			return "修改失败";
		}
		user.setPassword(newUser.getPassword());
		if(jedisUtil.exists(mail) && jedisUtil.get(mail,String.class).equals(code)){
			user.setUpdateTime(LocalDateTime.now());
			userRepository.updateSelective(user);
			jedisUtil.del(mail);
			return "修改成功";
		}
		return "验证码错误";
	}

	@Override
	public User findUserByEmail(String email) {
		return userRepository.selectByMail(email);
	}


	@Override
	public User emailLogin(User user, String code) {
		if(code == null){
			return null;
		}
		if(code.equals(jedisUtil.get(user.getEmail(),String.class))){
			user = userRepository.selectByMail(user.getEmail());
			jedisUtil.del(user.getEmail());
			return login(user);
		}
		return null;
	}
}
