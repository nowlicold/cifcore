package com.yuan.cifcore.common.model.auth;

import java.util.Date;

import com.bench.common.model.BaseModel;

/**
 * 单认证登录密码检查
 * 
 * @author chenbug
 *
 * @version $Id: OneAuthLoginPasswordCheck.java, v 0.1 2017年2月20日 下午5:20:18
 *          chenbug Exp $
 */
public class OneAuthLoginPasswordCheck extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2058266321553715554L;

	/**
	 * 主键，PK
	 */
	private String oneAuthId;

	/**
	 * 最近检查成功时间
	 */
	private Date gmtSuccess;

	/**
	 * 最近检查失败时间
	 */
	private Date gmtFail;

	/**
	 * 检查次数
	 */
	private int retryCheckCount;

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

	public int getRetryCheckCount() {
		return retryCheckCount;
	}

	public void setRetryCheckCount(int retryCheckCount) {
		this.retryCheckCount = retryCheckCount;
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
