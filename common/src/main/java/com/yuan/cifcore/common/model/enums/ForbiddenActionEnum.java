package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 禁止动作枚举
 * 
 * @author xiaohu
 *
 * @version $Id: ForbiddenActionEnum.java, v 0.1 2017年12月5日 下午5:13:23 xiaohu Exp
 *          $
 */
public enum ForbiddenActionEnum implements EnumBase {

	CREATE("创建"),

	MODIFY("修改"),

	CANCEL("取消"), ;

	private String message;

	private ForbiddenActionEnum(String message) {
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
