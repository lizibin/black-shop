package cn.blackshop.common.basic.constants;

public interface Constants {
	// 响应请求成功
	String HTTP_RES_CODE_200_VALUE = "success";
	// 系统错误
	String HTTP_RES_CODE_500_VALUE = "fial";
	// 响应请求成功code
	Integer HTTP_RES_CODE_200 = 200;
	// 系统错误
	Integer HTTP_RES_CODE_500 = 500;
	// 未关联QQ账号
	Integer HTTP_RES_CODE_201 = 201;
	// 发送邮件
	String MSG_EMAIL = "email";
	// 会员token
	String TOKEN_MEMBER = "TOKEN_MEMBER";
	// 用户有效期 90天
	Long TOKEN_MEMBER_TIME = (long) (60 * 60 * 24 * 90);
	int COOKIE_TOKEN_MEMBER_TIME = (60 * 60 * 24 * 90);
	// cookie 会员 totoken 名称
	String COOKIE_USER_TOKEN = "cookie_user_token";
	// 微信注册码存放rediskey
	String WECHET_CODE_KEY = "weixin.code";
	// 微信注册码有效期30分钟
	Long WECHET_CODE_TIMEOUT = 30L;

	// 用户信息不存在
	Integer HTTP_RES_CODE_EXISTMOBILE_203 = 203;

	// token
	String USER_TOKEN_KEYPREFIX = "mt.mb.login";

	// 安卓的登陆类型
	String USER_LOGIN_TYPE_ANDROID = "Android";
	// IOS的登陆类型
	String USER_LOGIN_TYPE_IOS = "IOS";

	// PC的登陆类型
	String MEMBER_LOGIN_TYPE_PC = "PC";

	// 登陆超时时间 有效期 90天
	Long user_LOGIN_TOKEN_TIME = 77776000L;
	// 用户信息不存在
	Integer HTTP_RES_CODE_NOTUSER_203 = 203;

}
