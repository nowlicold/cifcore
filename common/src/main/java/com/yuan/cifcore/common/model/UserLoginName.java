/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model;

import java.io.Serializable;
import java.util.Date;

import com.bench.common.model.BaseModel;
import com.yuan.cifcore.common.model.enums.LoginNameTypeEnum;

/**
 * 用户登录名
 * 
 * @author chenbug
 * 
 * @version $Id: UserLoginName.java, v 0.1 2013-3-11 下午4:24:32 chenbug Exp $
 */
public class UserLoginName extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5594838266262385602L;

	/**
	 * 主键，PK
	 */
	private long id;

	/**
	 * 会员ID
	 */
	private String userId;

	/**
	 * 登录名
	 */
	private String loginName;

	/**
	 * 登录名类型
	 */
	private LoginNameTypeEnum loginNameType;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 最后登录时间
	 */
	private Date gmtLastLogin;

	/**
	 * @return Returns the id.
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            The id to set.
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return Returns the userId.
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            The userId to set.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return Returns the loginName.
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * @param loginName
	 *            The loginName to set.
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * @return Returns the loginNameType.
	 */
	public LoginNameTypeEnum getLoginNameType() {
		return loginNameType;
	}

	/**
	 * @param loginNameType
	 *            The loginNameType to set.
	 */
	public void setLoginNameType(LoginNameTypeEnum loginNameType) {
		this.loginNameType = loginNameType;
	}

	/**
	 * @return Returns the gmtCreate.
	 */
	public Date getGmtCreate() {
		return gmtCreate;
	}

	/**
	 * @param gmtCreate
	 *            The gmtCreate to set.
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	/**
	 * @return Returns the gmtModified.
	 */
	public Date getGmtModified() {
		return gmtModified;
	}

	/**
	 * @param gmtModified
	 *            The gmtModified to set.
	 */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	/**
	 * @return Returns the gmtLastLogin.
	 */
	public Date getGmtLastLogin() {
		return gmtLastLogin;
	}

	/**
	 * @param gmtLastLogin
	 *            The gmtLastLogin to set.
	 */
	public void setGmtLastLogin(Date gmtLastLogin) {
		this.gmtLastLogin = gmtLastLogin;
	}

}
