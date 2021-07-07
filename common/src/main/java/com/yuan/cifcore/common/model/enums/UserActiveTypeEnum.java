/**
 * 
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;


/**
 * 用户激活方式枚举
 * 
 * @author chenbug 2009-10-29 下午06:55:13
 * 
 */
public enum UserActiveTypeEnum implements EnumBase {
	EMAIL("使用Email激活"), ;

	private String message;

	private UserActiveTypeEnum(String message) {
		this.message = message;
	}

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
		return 0;
	}

}
