package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * @Author: chengzi
 * @Date: 2019/3/14 17:46
 * @Version 1.0
 */
public enum OneAuthIdentityPhotoApplyStatusEnum implements EnumBase {

    APPLY("申请"),

    AUDIT_PASS("审核通过"),

    AUDIT_REJECT("审核拒绝"),

	;

	private OneAuthIdentityPhotoApplyStatusEnum(String message) {
		this.message = message;
	}

	private String message;

	public String message() {
		// TODO Auto-generated method stub
		return message;
	}

	public Number value() {
		// TODO Auto-generated method stub
		return null;
	}

}
