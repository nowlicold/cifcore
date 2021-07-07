/**
 * 
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 用户关系类型
 * 
 * @author chenbug 2009-10-15 下午09:56:46
 * 
 */
public enum UserRelationTypeEnum implements EnumBase {

	//
	F("我的好友"),
	//
	LT_P("彩票专家");
	private String message;

	private UserRelationTypeEnum(String message) {
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
