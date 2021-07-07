/**
 * benchcode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model.view;

import com.bench.common.model.BaseModel;
import com.bench.lang.base.object.ToStringBuilder;
import com.yuan.cifcore.common.model.enums.UserRelationFromTypeEnum;
import com.yuan.cifcore.common.model.enums.UserRelationStatusEnum;
import com.yuan.cifcore.common.model.enums.UserRelationTypeEnum;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author chenbug
 * 
 * @version $Id: UserRelationInfo.java, v 0.1 2010-7-10 下午01:28:24 chenbug Exp $
 */
public class UserRelationInfo extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 904069077676280792L;

	/**
	 * 主键，PK
	 */
	private long id;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 其他用户ID
	 */
	private String otherUserId;

	/**
	 * 其他用户登录名
	 */
	private String otherUserName;

	/**
	 * 关系类型
	 */
	private UserRelationTypeEnum relationType;

	/**
	 * 来源类型
	 */
	private UserRelationFromTypeEnum fromType;

	/**
	 * 状态
	 */
	private UserRelationStatusEnum status;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 创建人
	 */
	private String creator;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 修改人
	 */
	private String modifier;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOtherUserId() {
		return otherUserId;
	}

	public void setOtherUserId(String otherUserId) {
		this.otherUserId = otherUserId;
	}

	public UserRelationTypeEnum getRelationType() {
		return relationType;
	}

	public void setRelationType(UserRelationTypeEnum relationType) {
		this.relationType = relationType;
	}

	public UserRelationFromTypeEnum getFromType() {
		return fromType;
	}

	public void setFromType(UserRelationFromTypeEnum fromType) {
		this.fromType = fromType;
	}

	public UserRelationStatusEnum getStatus() {
		return status;
	}

	public void setStatus(UserRelationStatusEnum status) {
		this.status = status;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOtherUserName() {
		return otherUserName;
	}

	public void setOtherUserName(String otherUserName) {
		this.otherUserName = otherUserName;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
