package com.yuan.cifcore.common.model.view;

import com.bench.common.model.BaseModel;

/**
 * 会员注册来源信息
 * 
 * @author chenbug
 * 
 * @version $Id: UserRegisterFromInfo.java, v 0.1 2013-7-16 下午12:13:47 chenbug
 *          Exp $
 */
public class UserRegisterFrom extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1228816271879901863L;

	private String userId;
	/**
	 * 注册来源ID
	 */
	private String registerFromUserId;

	/**
	 * 注册来源别名,如邀请类注册,则放置邀请人的登录名
	 */
	private String registerFromLoginName;

	/**
	 * 注册来源类型
	 */
	private String registerFromTypeCode;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getRegisterFromLoginName() {
		return registerFromLoginName;
	}

	public void setRegisterFromLoginName(String registerFromLoginName) {
		this.registerFromLoginName = registerFromLoginName;
	}

}
