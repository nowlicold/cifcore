/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 操作人类型
 * 
 * @author chenbug
 * 
 * @version $Id: OperatorTypeEnum.java, v 0.1 2013-8-13 下午3:26:56 chenbug Exp $
 */
public enum OperatorTypeEnum implements EnumBase {

	ADM_USER("ADM管理人员"),

	USER("会员"),

	SYSTEM("系统"), ;

	private String message;

	private OperatorTypeEnum(String message) {
		this.message = message;
	}

	public String message() {
		// TODO Auto-generated method stub
		return message;
	}

	public Number value() {
		// TODO Auto-generated method stub
		return null;
	}

}
