/*
 * Bench Inc.
 * Copyright (c) 2004 All Rights Reserved.
 */
package com.yuan.cifcore.common.model;

// auto generated imports
import java.util.Date;

import com.bench.common.model.BaseModel;

/**
 * 域配置・
 * 
 * @author chenbug
 *
 * @version $Id: DomainConfig.java, v 0.1 2016年2月17日 下午5:01:00 chenbug Exp $
 */
public class DomainConfig extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 631989945175015317L;

	// ========== properties ==========
	/**
	 * 域英文代码
	 */
	private String name;

	/**
	 * 域中文名称
	 */
	private String message;

	/**
	 * 是否有效
	 */
	private boolean enabled;

	/**
	 * 是否默认域
	 */
	private boolean defaultDomain;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isDefaultDomain() {
		return defaultDomain;
	}

	public void setDefaultDomain(boolean defaultDomain) {
		this.defaultDomain = defaultDomain;
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
