/**
 * 
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 用户动作枚举
 * 
 * @author chenbug 2009-10-15 下午09:56:46
 * 
 */
public enum UserActionEnum implements EnumBase {

	//
	USER_CHANGE_LOGIN_PASSWORD("修改登陆密码"),

	//
	USER_CHANGE_ACCOUNT_PASSWORD("修改账户密码"),

	//
	USER_LOGIN("登陆"),

	USER_LOGOUT("登出"),

	//
	VERIFY_LOGIN_PASSWORD("验证登录密码"),

	//
	VERIFY_ACCOUNT_PASSWORD("验证账户密码"),

	//
	REGISTER("用户注册"),

	VALIDATE_CELL("绑定手机"),

	CLEAR_VALIDATE_CELL("清空绑定手机"),

	//
	MODIFY_INFO("修改资料"),

	MODIFY_LEVEL("修改会员等级"),

	CHANGE_IDENTIFY_INFO("修改身份认证信息"),

	MODIFY_BASE_INFO("修改基本信息"),

	//
	INIT_LOGIN_PASSWORD("初始化登录密码"),

	//
	INIT_ACCOUNT_PASSWORD("初始化账户密码"),

	MODIFY_DOMAIN("更新域"),

	MODIFY_USER_STATUS("更新用户状态");

	;

	private String message;

	private UserActionEnum(String message) {
		this.message = message;
	}

	public String message() {
		// TODO Auto-generated method stub
		return message;
	}

	public Number value() {
		// TODO Auto-generated method stub
		return 0;
	}

}
