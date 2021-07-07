/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 返回的结果集中的key枚举
 * 
 * @author chenbug
 *
 * @version $Id: ResultMapKeyEnum.java, v 0.1 2015年6月5日 上午11:03:06 chenbug Exp $
 */
public enum ResultMapKeyEnum implements EnumBase {

	EXISTED_LOGIN_NAME("已存在的登录名"),

	EXISTED_ROLE_NAME("已存在的角色名"),

	LOGIN_NAME("登录名"),

	CELL("手机号"),

	;

	private String message;

	private ResultMapKeyEnum(String message) {
		this.message = message;
	}

	public String message() {
		// TODO message-generated method stub
		return message;
	}

	public Number value() {
		// TODO Auto-generated method stub
		return null;
	}

}
