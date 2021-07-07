/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model.view;

import com.bench.common.model.BaseModel;

/**
 * 
 * @author chenbug
 * 
 * @version $Id: UserRegisterFromQueryInfo.java, v 0.1 2011-1-25 下午08:57:17
 *          chenbug Exp $
 */
public class UserRegisterFromQueryInfo extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2382053642563069700L;

	private String userId;

	private String loginName;

	private String registerFromUserId;

	private String registerFromTypeCode;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getRegisterFromUserId() {
		return registerFromUserId;
	}

	public void setRegisterFromUserId(String registerFromUserId) {
		this.registerFromUserId = registerFromUserId;
	}

	public String getRegisterFromTypeCode() {
		return registerFromTypeCode;
	}

	public void setRegisterFromTypeCode(String registerFromTypeCode) {
		this.registerFromTypeCode = registerFromTypeCode;
	}

}
