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
 * @version $Id: AppSequenceNameEnum.java, v 0.1 2017年11月7日 下午6:08:02 chenbug Exp $
 */
public enum AppSequenceNameEnum implements  EnumBase {

;

	private String message;

	private AppSequenceNameEnum(String message) {
		this.message = message;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bench.common.enums.EnumBase#message()
	 */
	@Override
	public String message() {
		// TODO Auto-generated method stub
		return message;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bench.common.enums.EnumBase#value()
	 */
	@Override
	public Number value() {
		// TODO Auto-generated method stub
		return null;
	}
}
