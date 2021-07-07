package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 单认证oneAuth登录名类型枚举
 *
 * @author chengzi
 * @version id: OneAuthLoginNameTypeEnum, v 0.1 2019年07月17日 10:59 chengzi Exp $
 */
public enum OneAuthLoginNameTypeEnum implements EnumBase {

	COMMON(true, "普通字符串"),

	RANDOM(false, "随机字符串，一般是UUID"),

	EMAIL(true, "电子邮件"),

	CELL(true, "电话号码");

	/**
	 * 是否需要正则表达式验证
	 */
	private boolean needRegexpValidate;

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

	private OneAuthLoginNameTypeEnum(boolean needRegexpValidate, String message) {
		this.needRegexpValidate = needRegexpValidate;
		this.message = message;
	}

	public boolean needRegexpValidate() {
		return needRegexpValidate;
	}
}
