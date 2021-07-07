/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringStyle;

import com.bench.common.model.BaseModel;
import com.bench.lang.base.object.ToStringBuilder;

/**
 * 用户属性
 * 
 * @author chenbug
 * 
 * @version $Id: UserProfile.java, v 0.1 2010-10-20 下午01:16:05 chenbug Exp $
 */
public class UserProfile extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6387421073319291250L;

	/**
	 * 主键,PK
	 */
	private long id;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 属性名
	 */
	private String profileName;

	/**
	 * 属性值
	 */
	private String profileValue;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 修改人
	 */
	private String modifier;

	/**
	 * 创建人
	 */
	private String creater;

	/**
	 * 是否有效
	 */
	private boolean enabled;

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
	 * @return Returns the profileName.
	 */
	public String getProfileName() {
		return profileName;
	}

	/**
	 * @param profileName
	 *            The profileName to set.
	 */
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	/**
	 * @return Returns the profileValue.
	 */
	public String getProfileValue() {
		return profileValue;
	}

	/**
	 * @param profileValue
	 *            The profileValue to set.
	 */
	public void setProfileValue(String profileValue) {
		this.profileValue = profileValue;
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
	 * @return Returns the modifier.
	 */
	public String getModifier() {
		return modifier;
	}

	/**
	 * @param modifier
	 *            The modifier to set.
	 */
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	/**
	 * @return Returns the creater.
	 */
	public String getCreater() {
		return creater;
	}

	/**
	 * @param creater
	 *            The creater to set.
	 */
	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	/**
	 * @return Returns the enabled.
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param enabled
	 *            The enabled to set.
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
