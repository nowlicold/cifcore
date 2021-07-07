package com.yuan.cifcore.common.model.user;

import com.bench.common.model.BaseModel;

import java.util.Date;
import java.util.Map;

/**
 * 用户扩展
 * 
 * @author chenbug
 *
 * @version $Id: UserExt.java, v 0.1 2017年6月21日 下午2:57:52 chenbug Exp $
 */
public class UserExt extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1153040677272594754L;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 来源属性
	 */
	private Map<String, String> registerFromProperties;

	/**
	 * 密码保护问题
	 */
	private String protectPasswordIssue;

	/**
	 * 密码保护答案
	 */
	private String protectPasswordKey;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Map<String, String> getRegisterFromProperties() {
		return registerFromProperties;
	}

	public void setRegisterFromProperties(Map<String, String> registerFromProperties) {
		this.registerFromProperties = registerFromProperties;
	}

	public String getProtectPasswordIssue() {
		return protectPasswordIssue;
	}

	public void setProtectPasswordIssue(String protectPasswordIssue) {
		this.protectPasswordIssue = protectPasswordIssue;
	}

	public String getProtectPasswordKey() {
		return protectPasswordKey;
	}

	public void setProtectPasswordKey(String protectPasswordKey) {
		this.protectPasswordKey = protectPasswordKey;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
}
