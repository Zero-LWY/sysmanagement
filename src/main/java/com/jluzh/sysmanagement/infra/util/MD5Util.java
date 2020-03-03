package com.jluzh.sysmanagement.infra.util;

import org.springframework.util.DigestUtils;

/**
 * <p>用户加密工具类 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName MD5Util.java
 * @createTime 2020年03月03日 14:53:00
 */
public class MD5Util {

	public static  String md5(String str){
		str = str + "gfa/*Fd1Sru!234$%^?>";
		return DigestUtils.md5DigestAsHex(str.getBytes());
	}
}
