/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 锁名称前缀枚举
 * 
 * @author hetao
 *
 * @version $Id: LockNamePrefixEnum.java, v 0.1 2017年7月5日 上午10:12:25 hetao Exp $
 */
public enum LockNamePrefixEnum implements EnumBase {

	USER_CREATE_ROLE_NUM_PRE_DAY("用户每天创建角色数量"),

	;

	private String message;

	private LockNamePrefixEnum() {

	}

	private LockNamePrefixEnum(String message) {
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
