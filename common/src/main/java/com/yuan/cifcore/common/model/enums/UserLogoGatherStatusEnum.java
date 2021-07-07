package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 用户头像采集状态
 * 
 * @author chenbug
 *
 * @version $Id: UserLogoGatherStatusEnum.java, v 0.1 2015年9月29日 下午6:49:52
 *          Administrator Exp $
 */
public enum UserLogoGatherStatusEnum implements EnumBase {

	GATHER_READY("准备采集"),

	GATHER_RETRY("准备重试"),

	GATHER_SUCCESS("准备成功"),

	GATHER_FAILED("准备失败");

	;
	private UserLogoGatherStatusEnum(String message) {
		this.message = message;
	}

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

}
