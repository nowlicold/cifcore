/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model;

import com.bench.common.model.BaseModel;
import com.bench.lang.base.object.ToStringBuilder;
import com.yuan.cifcore.common.model.enums.UserLevelNameEnum;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 
 * @author chenbug
 * 
 * @version $Id: UserLevel.java, v 0.1 2011-9-26 下午09:05:11 chenbug Exp $
 */
public class UserLevel extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3772829019328623285L;

	/**
	 * 主键，PK
	 */
	private long id;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 等级名称
	 */
	private UserLevelNameEnum levelName;

	/**
	 * 用户等级值
	 */
	private String levelValue;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改人
	 */
	private String modifier;

	/**
	 * 创建人
	 */
	private String creater;

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
	 * @return Returns the levelName.
	 */
	public UserLevelNameEnum getLevelName() {
		return levelName;
	}

	/**
	 * @param levelName
	 *            The levelName to set.
	 */
	public void setLevelName(UserLevelNameEnum levelName) {
		this.levelName = levelName;
	}

	/**
	 * @return Returns the levelValue.
	 */
	public String getLevelValue() {
		return levelValue;
	}

	/**
	 * @param levelValue
	 *            The levelValue to set.
	 */
	public void setLevelValue(String levelValue) {
		this.levelValue = levelValue;
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

}
