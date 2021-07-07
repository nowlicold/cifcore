/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model;

import java.util.Date;
import java.util.Map;

import com.bench.common.model.BaseModel;


/**
 * 注册来源配置
 * 
 * @author chenbug
 * 
 * @version $Id: RegisterFromConfig.java, v 0.1 2012-6-26 下午8:30:10 chenbug Exp
 *          $
 */
public class RegisterFromConfig extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3268433167269709603L;

	/**
	 * 主键，PK
	 */
	private long id;

	/**
	 * 注册来源配置的会员ID
	 */
	private String fromUserId;

	/**
	 * 来源类型代码
	 */
	private String fromTypeCode;

	/**
	 * 个性化属性
	 */
	private Map<String, String> specialProperties;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 创建人
	 */
	private String creater;

	/**
	 * 创建时间
	 */
	private String modifier;

	/**
	 * 代码
	 */
	private String fromCode;

	/**
	 * 源会员是否有网站
	 */
	private boolean fromUserHasWebsite;

	/**
	 * 是否有效
	 */
	private boolean enabled;

	/**
	 * 是否默认来源
	 */
	private boolean defaultFrom;

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
	 * @return Returns the specialProperties.
	 */
	public Map<String, String> getSpecialProperties() {
		return specialProperties;
	}

	/**
	 * @param specialProperties
	 *            The specialProperties to set.
	 */
	public void setSpecialProperties(Map<String, String> specialProperties) {
		this.specialProperties = specialProperties;
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
	 * @return Returns the fromCode.
	 */
	public String getFromCode() {
		return fromCode;
	}

	/**
	 * @param fromCode
	 *            The fromCode to set.
	 */
	public void setFromCode(String fromCode) {
		this.fromCode = fromCode;
	}

	public String getFromTypeCode() {
		return fromTypeCode;
	}

	public void setFromTypeCode(String fromTypeCode) {
		this.fromTypeCode = fromTypeCode;
	}

	public String getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	public boolean isFromUserHasWebsite() {
		return fromUserHasWebsite;
	}

	public void setFromUserHasWebsite(boolean fromUserHasWebsite) {
		this.fromUserHasWebsite = fromUserHasWebsite;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isDefaultFrom() {
		return defaultFrom;
	}

	public void setDefaultFrom(boolean defaultFrom) {
		this.defaultFrom = defaultFrom;
	}

}
