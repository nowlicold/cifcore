package com.yuan.cifcore.common.model.user;

import com.bench.common.model.BaseModel;

import java.util.Date;

/**
 * 用户基于平台的登录
 *
 * @author chenbug
 *
 * @version $Id: UserPlatformLogin.java, v 0.1 2017年2月20日 下午8:32:44 chenbug Exp $
 */
public class UserPlatformLogin extends BaseModel {
	/**
	 *
	 */
	private static final long serialVersionUID = -5524475194010530753L;

	/**
	 * 主键PK
	 */
	private long id;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 当前登录的登陆名
	 */
	private String loggedLoginName;

	/**
	 * 登录的平台类型
	 */
	private String loggedPlatformType;

	/**
	 * 最近登录时间
	 */
	private Date gmtSuccess;

	/**
	 * 登录IP
	 */
	private String loggedLoginIp;

	/**
	 * 登录SESSIONID
	 */
	private String loggedLoginSessionId;

	/**
	 * 登录后生成的登录key
	 */
	private String loggedLoginKey;

	/**
	 * 登录后生成的签名key
	 */
	private String loggedSignKey;

	/**
	 * 登录后生成的加密key
	 */
	private String loggedCryptKey;

	/**
	 * 登录后生成的加密key类型
	 */
	private String loggedCryptKeyType;

	/**
	 * 登录ID，通过登录ID来控制唯一性和同时登录的数量
	 */
	private String loggedUniqueId;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 是否登录状态
	 */
	private boolean logged;

	/**
	 * 登录的设备类型
	 */
	private String loggedDeviceType;

	/**
	 * 登录的设备信息
	 */
	private String loggedDeviceInfo;

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

	public String getLoggedLoginName() {
		return loggedLoginName;
	}

	public void setLoggedLoginName(String loggedLoginName) {
		this.loggedLoginName = loggedLoginName;
	}

	public String getLoggedPlatformType() {
		return loggedPlatformType;
	}

	public void setLoggedPlatformType(String loggedPlatformType) {
		this.loggedPlatformType = loggedPlatformType;
	}

	public Date getGmtSuccess() {
		return gmtSuccess;
	}

	public void setGmtSuccess(Date gmtSuccess) {
		this.gmtSuccess = gmtSuccess;
	}

	public String getLoggedLoginIp() {
		return loggedLoginIp;
	}

	public void setLoggedLoginIp(String loggedLoginIp) {
		this.loggedLoginIp = loggedLoginIp;
	}

	public String getLoggedLoginSessionId() {
		return loggedLoginSessionId;
	}

	public void setLoggedLoginSessionId(String loggedLoginSessionId) {
		this.loggedLoginSessionId = loggedLoginSessionId;
	}

	public String getLoggedLoginKey() {
		return loggedLoginKey;
	}

	public void setLoggedLoginKey(String loggedLoginKey) {
		this.loggedLoginKey = loggedLoginKey;
	}

	public String getLoggedSignKey() {
		return loggedSignKey;
	}

	public void setLoggedSignKey(String loggedSignKey) {
		this.loggedSignKey = loggedSignKey;
	}

	public String getLoggedCryptKey() {
		return loggedCryptKey;
	}

	public void setLoggedCryptKey(String loggedCryptKey) {
		this.loggedCryptKey = loggedCryptKey;
	}

	public String getLoggedCryptKeyType() {
		return loggedCryptKeyType;
	}

	public void setLoggedCryptKeyType(String loggedCryptKeyType) {
		this.loggedCryptKeyType = loggedCryptKeyType;
	}

	public String getLoggedUniqueId() {
		return loggedUniqueId;
	}

	public void setLoggedUniqueId(String loggedUniqueId) {
		this.loggedUniqueId = loggedUniqueId;
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

	public boolean isLogged() {
		return logged;
	}

	public void setLogged(boolean logged) {
		this.logged = logged;
	}

	public String getLoggedDeviceType() {
		return loggedDeviceType;
	}

	public void setLoggedDeviceType(String loggedDeviceType) {
		this.loggedDeviceType = loggedDeviceType;
	}

	public String getLoggedDeviceInfo() {
		return loggedDeviceInfo;
	}

	public void setLoggedDeviceInfo(String loggedDeviceInfo) {
		this.loggedDeviceInfo = loggedDeviceInfo;
	}
}
