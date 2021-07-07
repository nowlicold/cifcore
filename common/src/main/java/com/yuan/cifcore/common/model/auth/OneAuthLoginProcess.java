package com.yuan.cifcore.common.model.auth;

import java.util.Date;

import com.bench.common.model.BaseModel;

/**
 * 单认证登录过程
 * 
 * @author chenbug
 *
 * @version $Id: OneAuthLoginProcess.java, v 0.1 2017年2月3日 下午3:28:31 chenbug Exp
 *          $
 */
public class OneAuthLoginProcess extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2294652049557507584L;

	/**
	 * 主键，PK
	 */
	private String oneAuthId;

	/**
	 * 最近登录时间
	 */
	private Date gmtSuccess;

	/**
	 * 最近失败登录时间
	 */
	private Date gmtFail;

	/**
	 * 登录密码重试次数
	 */
	private int retryPasswordCount;

	/**
	 * 最近登录的平台类型
	 */
	private String loggedPlatformType;

	/**
	 * 最近登录IP
	 */
	private String loggedLoginIp;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	public String getOneAuthId() {
		return oneAuthId;
	}

	public void setOneAuthId(String oneAuthId) {
		this.oneAuthId = oneAuthId;
	}

	public Date getGmtSuccess() {
		return gmtSuccess;
	}

	public void setGmtSuccess(Date gmtSuccess) {
		this.gmtSuccess = gmtSuccess;
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
