/**
 * 
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 单认证动作枚举
 * 
 * @author chenbug 2009-10-15 下午09:56:46
 * 
 */
public enum OneAuthActionEnum implements EnumBase {

	//
	CHANGE_LOGIN_PASSWORD("修改登录密码"),

	CHANGE_CAN_LOGIN("修改是否可登录"),

	//
	LOGIN("登陆"),

	//
	VERIFY_LOGIN_PASSWORD("验证登录密码"),

	CHECK_LOGIN_PASSWORD("校验登录密码"),

	//
	CREATE("创建"),

	VALIDATE_CELL("绑定手机"),

	CLEAR_VALIDATE_CELL("清空绑定手机"),

	//
	INIT_LOGIN_PASSWORD("初始化登录密码"),

	MODIFY_IDENTIFY_INFO("修改实名信息"),

	SET_DEFAULT_USER("设置默认用户");

	private String message;

	private OneAuthActionEnum(String message) {
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
