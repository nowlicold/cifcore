/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 禁止对象类型枚举
 * 
 * @author yiyi
 *
 * @version $Id: ForbiddenObjectTypeEnum.java, v 0.1 2017年11月29日 下午6:08:38 yiyi
 *          Exp $
 */
public enum ForbiddenObjectTypeEnum implements EnumBase {

	USER("会员"),

	ONE_AUTH("单认证"),

	CERT("证件"),

	;

	private String message;

	private ForbiddenObjectTypeEnum(String message) {
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
