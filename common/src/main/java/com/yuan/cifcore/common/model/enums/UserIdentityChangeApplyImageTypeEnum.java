/**
 * 
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 会员实名信息修改申请图片类型
 * 
 * @author chengzi
 *
 * @version $Id: UserIdentityChangeApplyImageTypeEnum.java, v 0.1 2019年10月21日 下午7:50:30 chengzi Exp $
 */
public enum UserIdentityChangeApplyImageTypeEnum implements EnumBase {

	CERT_FRONT_PHOTO("证件正面照片"),
	
	CERT_BACK_PHOTO("证件背面照片"),
	
	VOUCHER_PHOTO("凭证照片"),
	
	;
	
	private UserIdentityChangeApplyImageTypeEnum(String message) {
		this.message = message;
	}

	private String message;

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
