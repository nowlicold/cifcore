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
 * @version $Id: IntervalTaskNameEnum.java, v 0.1 2011-5-26 下午05:19:21 chenbug
 *          Exp $
 */
public enum IntervalTaskNameEnum implements EnumBase {

	INTERVAL_TASK_USER_LOGO_GATHER("会员头像采集间隔任务"), 
	
	;

	private String message;

	private IntervalTaskNameEnum(String message) {
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
