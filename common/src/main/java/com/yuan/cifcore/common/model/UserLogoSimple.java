/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model;

import com.bench.common.model.BaseModel;
import com.bench.lang.base.object.ToStringBuilder;

import java.util.Date;

/**
 * 用户logo简单对象
 * 
 * @author chenbug
 * 
 * @version $Id: UserLogo.java, v 0.1 2011-1-25 下午08:44:04 chenbug Exp $
 */
public class UserLogoSimple extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8047458417648158637L;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 文件类型
	 */
	private String fileType;

	/**
	 * 系统头像id，大于0表示使用了系统头像
	 */
	private long systemLogoId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public long getSystemLogoId() {
		return systemLogoId;
	}

	public void setSystemLogoId(long systemLogoId) {
		this.systemLogoId = systemLogoId;
	}
}
