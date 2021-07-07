/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model.user;

import java.util.Date;
import java.util.Map;

import com.bench.common.model.BaseModel;

/**
 * 
 * @author chenbug
 *
 * @version $Id: UserRegister.java, v 0.1 2017年6月21日 下午3:09:07 chenbug Exp $
 */
public class UserRegister extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4586337164038914047L;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 注册IP
	 */
	private String registerIp;

	/**
	 * 注册来源会员ID
	 */
	private String fromUserId;

	/**
	 * 注册来源会员类型
	 */
	private String fromTypeCode;

	/**
	 * 注册的客户端设备类型
	 */
	private String deviceType;

	/**
	 * 注册的平台类型
	 */
	private String platformType;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 注册的设备信息
	 */
	private String deviceInfo;

	/**
	 * 来源属性
	 */
	private Map<String, String> fromProperties;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRegisterIp() {
		return registerIp;
	}

	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

	public String getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	public String getFromTypeCode() {
		return fromTypeCode;
	}

	public void setFromTypeCode(String fromTypeCode) {
		this.fromTypeCode = fromTypeCode;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getPlatformType() {
		return platformType;
	}

	public void setPlatformType(String platformType) {
		this.platformType = platformType;
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

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public Map<String, String> getFromProperties() {
		return fromProperties;
	}

	public void setFromProperties(Map<String, String> fromProperties) {
		this.fromProperties = fromProperties;
	}
}
