/**
 * benchcode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 
 * @author chenbug
 * 
 * @version $Id: CommonUserTypeEnum.java, v 0.1 2010-7-23 下午04:13:06 chenbug Exp
 *          $
 */
public enum CommonUserTypeEnum implements EnumBase {

	USER("会员");

	private String message;

	private CommonUserTypeEnum(String message) {
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
