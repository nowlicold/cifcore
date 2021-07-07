/**
 * 
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 会员实名信息修改申请状态枚举
 * 
 * @author chengzi
 *
 * @version $Id: UserIdentityChangeApplyStatusEnum.java, v 0.1 2019年10月21日 下午8:21:18 chengzi Exp $
 */
public enum UserIdentityChangeApplyStatusEnum implements EnumBase {

	WAIT_AUDIT("等待审核"),

	AUDIT_PASS("审核通过"),

	AUDIT_REJECT("审核拒绝"),

	;

	private String message;

	private UserIdentityChangeApplyStatusEnum(String message) {
		this.message = message;
	}

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return this.message;
	}

	@Override
	public Number value() {
		return null;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
