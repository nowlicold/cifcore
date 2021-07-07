package com.yuan.cifcore.common.model.auth;

import java.util.Date;

import com.bench.common.model.BaseModel;

/**
 * 单认证，一次认证关联多个用户的登录
 * 
 * @author chenbug
 *
 * @version $Id: OneAuth.java, v 0.1 2017年2月3日 下午3:28:31 chenbug Exp $
 */
public class OneAuthPlatformLogin extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1487705358657075638L;

	/**
	 * 主键，PK
	 */
	private long id;

	/**
	 * 单登录ID
	 */
	private String oneAuthId;

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
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 平台登录SEQ，one_auth_id+platform_type+platform_login_seq唯一控制
	 */
	private int platformLoginSeq;

	/**
	 * 是否登录状态
	 */
	private boolean logged;

	public String getOneAuthId() {
		return oneAuthId;
	}

	public void setOneAuthId(String oneAuthId) {
		this.oneAuthId = oneAuthId;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPlatformLoginSeq() {
		return platformLoginSeq;
	}

	public void setPlatformLoginSeq(int platformLoginSeq) {
		this.platformLoginSeq = platformLoginSeq;
	}

	public boolean isLogged() {
		return logged;
	}

	public void setLogged(boolean logged) {
		this.logged = logged;
	}

}
