/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 性别
 * 
 * @author chenbug
 * 
 * @version $Id: GenderEnum.java, v 0.1 2010-9-17 下午04:51:08 chenbug Exp $
 */
public enum GenderEnum implements EnumBase {

	MALE("男"), FEMALE("女"), UNKNOW("未知");

	private String message;

	private GenderEnum(String message) {
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
