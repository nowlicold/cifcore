/*
 * Bench Inc.
 * Copyright (c) 2004 All Rights Reserved.
 */
package com.yuan.cifcore.common.model;

// auto generated imports
import com.bench.common.model.BaseModel;

import java.util.Date;
import java.util.List;

/**
 * 
 * 
 * @author chenbug
 *
 * @version $Id: UserType.java, v 0.1 2015年5月13日 上午11:20:11 chenbug Exp $
 */
public class UserType extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// ========== properties ==========
	/**
	 * 会员类型英文名称
	 */
	private String name;

	/**
	 * 会员类型中文消息
	 */
	private String message;

	/**
	 * 是否有效
	 */
	private boolean enabled;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 属性集合
	 */
	private String properties;

	/**
	 * 资金账户类型，默认为USER
	 */
	private List<String> fundAccountTypes;

	/**
	 * 彩金账户类型，默认为USER
	 */
	private List<String> presentAccountTypes;

	/**
	 * 积分账户类型，默认为USER
	 */
	private List<String> pointAccountTypes;

	/**
	 * 是否允许登录
	 */
	private boolean allowLogin;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getProperties() {
		return properties;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getFundAccountTypes() {
		return fundAccountTypes;
	}

	public void setFundAccountTypes(List<String> fundAccountTypes) {
		this.fundAccountTypes = fundAccountTypes;
	}

	public List<String> getPresentAccountTypes() {
		return presentAccountTypes;
	}

	public void setPresentAccountTypes(List<String> presentAccountTypes) {
		this.presentAccountTypes = presentAccountTypes;
	}

	public List<String> getPointAccountTypes() {
		return pointAccountTypes;
	}

	public void setPointAccountTypes(List<String> pointAccountTypes) {
		this.pointAccountTypes = pointAccountTypes;
	}

	public boolean isAllowLogin() {
		return allowLogin;
	}

	public void setAllowLogin(boolean allowLogin) {
		this.allowLogin = allowLogin;
	}

}
