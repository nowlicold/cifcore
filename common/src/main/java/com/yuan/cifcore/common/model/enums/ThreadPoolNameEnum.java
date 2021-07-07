/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 线程池名称
 * 
 * @author chenbug
 *
 * @version $Id: ThreadPoolNameEnum.java, v 0.1 2018年6月6日 上午9:46:24 chenbug Exp $
 */
public enum ThreadPoolNameEnum implements  EnumBase {

	;

	private String message;

	private ThreadPoolNameEnum(String message, int corePoolSize, int maxPoolSize) {
		this.message = message;
		this.corePoolSize = corePoolSize;
		this.maxPoolSize = maxPoolSize;
	}

	private int corePoolSize;

	private int maxPoolSize;;

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public Number value() {
		// TODO Auto-generated method stub
		return null;
	}



}
