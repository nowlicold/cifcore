/**
 * 
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 *用户关系来源类型
 * 
 * @author chenbug 2009-10-15 下午09:56:46
 * 
 */
public enum UserRelationFromTypeEnum implements EnumBase {

	//  
	R("用户注册邀请"),

	//
	S("自助添加");

	private String message;

	private UserRelationFromTypeEnum(String message) {
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
