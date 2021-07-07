/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 会员常用key类型
 * 
 * @author chenbug
 * 
 * @version $Id: CommonUserKeyTypeEnum.java, v 0.1 2014-5-12 下午4:42:07 chenbug
 *          Exp $
 */
public enum CommonUserKeyTypeEnum implements EnumBase {

	CONFIRM_EMAIL("确认邮箱"),

	FIND_LOGIN_PASSWORD("找回登陆密码"),

	FIND_ACCOUNT_PASSWORD("找回账户密码");
	;
	private CommonUserKeyTypeEnum(String message) {
		this.message = message;
	}

	private String message;

	public String message() {
		// TODO Auto-generated method stub
		return message;
	}

	public Number value() {
		// TODO Auto-generated method stub
		return null;
	}

}
