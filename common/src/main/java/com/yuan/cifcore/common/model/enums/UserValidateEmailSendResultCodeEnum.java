/**
 * 
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;


/**
 * 验证邮件发送结果
 * 
 * @author chenbug 2009-10-29 下午06:55:13
 * 
 */
public enum UserValidateEmailSendResultCodeEnum implements EnumBase {
	//
	SUCCESS("成功"),

	EMAIL_ALREAY_VALIDATED("邮件已验证"),
	//
	EMAIL_REQUIRED("没有填写邮件");

	private String message;

	private UserValidateEmailSendResultCodeEnum(String message) {
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
