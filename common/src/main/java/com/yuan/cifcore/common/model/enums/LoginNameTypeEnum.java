/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 
 * @author chenbug
 * 
 * @version $Id: LoginNameTypeEnum.java, v 0.1 2013-3-11 下午2:02:18 chenbug Exp $
 */
public enum LoginNameTypeEnum implements EnumBase {

	COMMON(true, "普通字符串"),

	RANDOM(false, "随机字符串，一般是UUID"),

	EMAIL(true, "电子邮件"),

	CELL(true, "电话号码");

	/**
	 * 是否需要正则表达式验证
	 */
	private boolean needRegexpValidate;

	private String message;

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
		return null;
	}

	private LoginNameTypeEnum(boolean needRegexpValidate, String message) {
		this.needRegexpValidate = needRegexpValidate;
		this.message = message;
	}

	public boolean needRegexpValidate() {
		return needRegexpValidate;
	}

}
