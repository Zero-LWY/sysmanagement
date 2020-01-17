package com.jluzh.sysmanagement.infra.constant;

public class Constant {


    public static final class  Redis { //redis设置
        public static final String OK = "OK";
		public static final Long EXPIRE_TIME = 3600L;
		public static final Long EXPIRE_TIME_MINUTE = 60L;// 过期时间, 60s, 一分钟
		public static final Long EXPIRE_TIME_HOUR = 60L * 60L;// 过期时间, 一小时
		public static final Long EXPIRE_TIME_DAY = 60L * 60L * 24L;// 过期时间, 一天
		public static final  String TOKEN_PREFIX = "token:";
		public static final String MSG_CONSUMER_PREFIX = "consumer:";
		public static final String ACCESS_LIMIT_PREFIX = "accessLimit:";
    }

	public static final class LogType {
		public static final  Integer LOGIN = 1 ;// 登录
		public static final  Integer LOGOUT = 2;// 登出
    }

	public static final class MsgLogStatus {
		public static final Integer DELIVERING = 0;// 消息投递中
		public static final Integer DELIVER_SUCCESS = 1;// 投递成功
		public static final Integer DELIVER_FAIL = 2;// 投递失败
		public static final Integer CONSUMED_SUCCESS = 3;// 已消费
    }

}
