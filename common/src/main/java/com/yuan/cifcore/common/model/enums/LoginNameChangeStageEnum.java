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
 * @version $Id: LoginNameChangeStageEnum.java, v 0.1 2013-3-11 下午2:02:18
 *          chenbug Exp $
 */
public enum LoginNameChangeStageEnum implements EnumBase {

	REGISTER("注册"),

	CHANGE_CELL("变更手机"),

	;

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

	private LoginNameChangeStageEnum(String message) {

		this.message = message;
	}

}
