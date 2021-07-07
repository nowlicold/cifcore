package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * CIF事件名
 * 
 * @author chenbug
 * 
 * @version $Id: EventNameEnum.java, v 0.1 2014-7-28 下午1:31:29 chenbug Exp $
 */
public enum EventNameEnum implements  EnumBase {
	//
	USER_REGISTER_AFTER("用户注册后事件"),
	//
	USER_EMAIL_CONFIRM("用户Email确认"),

	USER_LOGO_GATHER("会员头像采集"),

	USER_DOMAIN_UPDATE_AFTER("会员域信息修改后"),

	ONE_AUTH_CREATE_AFTER("单认证创建后事件"),

	FORBIDDEN_SUCCESS_AFTER("禁止创建后事件"),

	;

	private String message;

	private EventNameEnum(String message) {
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
