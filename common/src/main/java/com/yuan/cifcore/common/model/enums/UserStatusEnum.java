/**
 * 
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 用户状态枚举
 * 
 * @author chenbug 2009-10-15 下午09:56:46
 * 
 */
public enum UserStatusEnum implements EnumBase {
	//
	T("正常状态"),
	//
	W("待激活状态"),
	//
	Q("快速注册用户");

	private String message;

	private UserStatusEnum(String message) {
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
