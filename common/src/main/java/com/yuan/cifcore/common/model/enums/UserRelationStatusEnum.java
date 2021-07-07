/**
 * 
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 用户关系状态
 * 
 * @author chenbug 2009-10-15 下午09:56:46
 * 
 */
public enum UserRelationStatusEnum implements EnumBase {

	//  
	T("有效"),
	//
	W("等待对方验证"),
	//
	F("无效");

	private String message;

	private UserRelationStatusEnum(String message) {
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
