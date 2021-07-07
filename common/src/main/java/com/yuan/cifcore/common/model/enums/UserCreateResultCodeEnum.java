/**
 * 
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * @author chenbug 2009-10-29 下午06:55:13
 * 
 */
public enum UserCreateResultCodeEnum implements EnumBase {
	SUCCESS("创建成功"),

	//
	LOGIN_NAME_EXISTED("登陆名已经存在"), ;

	private String message;

	private UserCreateResultCodeEnum(String message) {
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
