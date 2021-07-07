/**
 * 
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * cif.base应用锁名称枚举
 * 
 * @author chengzi
 *
 * @version $Id: CifBaseAppLockNameEnum.java, v 0.1 2019年10月22日 下午2:47:58 chengzi Exp $
 */
public enum CifBaseAppLockNameEnum implements EnumBase  {
	
	USER_IDENTITY_CHANGE_APPLY_CREATE_LOCK("用户实名信息修改申请创建锁")
	
	;
	
	private CifBaseAppLockNameEnum(String message) {
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
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
