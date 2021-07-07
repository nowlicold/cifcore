/**
 * 
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * @author chenbug 2009-10-29 下午06:55:13
 * 
 */
public enum UserVerifyResultCodeEnum implements EnumBase {
	//
	SUCCESS("验证成功"),
	//
	PASSWORD_ERROR("密码错误"),
	//
	VERIFY_REFUSED("重试次数太多，拒绝认证"),
	//
	LOGIN_FORBIDDEN("用户被锁定"),

	//
	USER_STATUS_Q("用户为Q状态"), ;

	private String message;

	private UserVerifyResultCodeEnum(String message) {
		this.message = message;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bench.common.enums.EnumBase#message()
	 */
	public String message() {
		// TODO Auto-generated method stub
		return message;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bench.common.enums.EnumBase#value()
	 */
	public Number value() {
		// TODO Auto-generated method stub
		return 0;
	}

}
