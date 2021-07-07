/**
 * 
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 用户性别枚举
 * 
 * @author zuoer
 *
 * @version $Id: UserSexEnum.java, v 0.1 2016年12月30日 下午5:26:57 zuoer Exp $
 */
public enum UserSexEnum implements EnumBase {

	M("男"),

	F("女"),

	U("未知"),

	;

	private String message;

	private UserSexEnum(String message) {
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
