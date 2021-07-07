package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 禁止状态枚举
 * 
 * @author xiaohu
 *
 * @version $Id: ForbiddenStatusEnum.java, v 0.1 2017年12月1日 下午3:49:43 xiaohu Exp
 *          $
 */
public enum ForbiddenStatusEnum implements EnumBase {

	FORBIDDENING("禁止中"),

	FINISH("结束"), ;

	private String message;

	private ForbiddenStatusEnum(String message) {
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
