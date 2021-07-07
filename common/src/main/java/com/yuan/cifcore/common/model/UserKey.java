/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.bench.common.model.BaseModel;

/**
 * 会员活动key
 * 
 * @author chenbug
 * 
 * @version $Id: UserActivityKey.java, v 0.1 2014-5-10 上午11:33:53 chenbug Exp $
 */
public class UserKey extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1166881792726194615L;

	/**
	 * 主键，PK
	 */
	private long id;

	/**
	 * 会员Id
	 */
	private String userId;

	/**
	 * key值
	 */
	private String keyValue;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 过期时间
	 */
	private Date gmtExpired;

	/**
	 * 参数集合
	 */
	private Map<String, String> applyParameters = new HashMap<String, String>();

	/**
	 * 活动类型
	 */
	private String keyType;

	/**
	 * 是否已使用
	 */
	private boolean used;

	/**
	 * 使用时间
	 */
	private Date gmtUsed;

	/**
	 * 使用后的参数集合
	 */
	private Map<String, String> usedParameters = new HashMap<String, String>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public Date getGmtExpired() {
		return gmtExpired;
	}

	public void setGmtExpired(Date gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

	public Date getGmtUsed() {
		return gmtUsed;
	}

	public void setGmtUsed(Date gmtUsed) {
		this.gmtUsed = gmtUsed;
	}

	public Map<String, String> getUsedParameters() {
		return usedParameters;
	}

	public void setUsedParameters(Map<String, String> usedParameters) {
		this.usedParameters = usedParameters;
	}

	public void setApplyParameters(Map<String, String> applyParameters) {
		this.applyParameters = applyParameters;
	}

	public Map<String, String> getApplyParameters() {
		return applyParameters;
	}

	public String getKeyValue() {
		return keyValue;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

	public String getKeyType() {
		return keyType;
	}

	public void setKeyType(String keyType) {
		this.keyType = keyType;
	}

}
