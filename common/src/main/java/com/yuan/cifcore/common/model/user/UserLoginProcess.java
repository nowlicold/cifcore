package com.yuan.cifcore.common.model.user;

import com.bench.common.model.BaseModel;

import java.util.Date;

/**
 * 用户登录过程
 * 
 * @author chenbug
 *
 * @version $Id: UserLoginProcess.java, v 0.1 2017年2月20日 下午8:30:49 chenbug Exp $
 */
public class UserLoginProcess extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8941284805751981561L;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 最近成功登录的登陆名
	 */
	private String loggedLoginName;

	/**
	 * 最近成功登录时间
	 */
	private Date gmtSuccess;

	/**
	 * 最近登录的平台类型
	 */
	private String loggedPlatformType;

	/**
	 * 最近登录IP
	 */
	private String loggedLoginIp;

	/**
	 * 最近失败登陆时间
	 */
	private Date gmtFail;

	/**
	 * 登录密码重试次数
	 */
	private int retryPasswordCount;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

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

	public Date getGmtSuccess() {
		return gmtSuccess;
	}

	public void setGmtSuccess(Date gmtSuccess) {
		this.gmtSuccess = gmtSuccess;
	}

	public String getLoggedPlatformType() {
		return loggedPlatformType;
	}

	public void setLoggedPlatformType(String loggedPlatformType) {
		this.loggedPlatformType = loggedPlatformType;
	}

	public String getLoggedLoginIp() {
		return loggedLoginIp;
	}

	public void setLoggedLoginIp(String loggedLoginIp) {
		this.loggedLoginIp = loggedLoginIp;
	}

	public Date getGmtFail() {
		return gmtFail;
	}

	public void setGmtFail(Date gmtFail) {
		this.gmtFail = gmtFail;
	}

	public int getRetryPasswordCount() {
		return retryPasswordCount;
	}

	public void setRetryPasswordCount(int retryPasswordCount) {
		this.retryPasswordCount = retryPasswordCount;
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
}
