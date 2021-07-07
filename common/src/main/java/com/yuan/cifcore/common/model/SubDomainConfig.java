/*
 * Bench Inc.
 * Copyright (c) 2004 All Rights Reserved.
 */
package com.yuan.cifcore.common.model;

// auto generated imports
import com.bench.common.model.BaseModel;

import java.util.Date;

/**
 * 子域配置
 * 
 * @author chenbug
 *
 * @version $Id: SubDomainConfig.java, v 0.1 2016年2月18日 下午2:32:26 chenbug Exp $
 */
public class SubDomainConfig extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5193885920447347319L;

	// ========== properties ==========
	/**
	 * 子域英文代码
	 */
	private String subName;

	/**
	 * 子域中文名称
	 */
	private String subMessage;

	/**
	 * 父域名称
	 */
	private String parentDomainName;

	/**
	 * 是否有效
	 */
	private boolean enabled;

	/**
	 * 是否默认子域
	 */
	private boolean defaultSubDomain;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * @return Returns the subName.
	 */
	public String getSubName() {
		return subName;
	}

	/**
	 * @param subName
	 *            The subName to set.
	 */
	public void setSubName(String subName) {
		this.subName = subName;
	}

	/**
	 * @return Returns the subMessage.
	 */
	public String getSubMessage() {
		return subMessage;
	}

	/**
	 * @param subMessage
	 *            The subMessage to set.
	 */
	public void setSubMessage(String subMessage) {
		this.subMessage = subMessage;
	}

	/**
	 * @return Returns the parentDomainName.
	 */
	public String getParentDomainName() {
		return parentDomainName;
	}

	/**
	 * @param parentDomainName
	 *            The parentDomainName to set.
	 */
	public void setParentDomainName(String parentDomainName) {
		this.parentDomainName = parentDomainName;
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

	/**
	 * @return Returns the defaultSubDomain.
	 */
	public boolean isDefaultSubDomain() {
		return defaultSubDomain;
	}

	/**
	 * @param defaultSubDomain
	 *            The defaultSubDomain to set.
	 */
	public void setDefaultSubDomain(boolean defaultSubDomain) {
		this.defaultSubDomain = defaultSubDomain;
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

}
