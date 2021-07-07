/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model;

import java.util.Date;

import com.bench.common.model.BaseModel;
import com.bench.lang.base.object.ToStringBuilder;

/**
 * 用户logo
 * 
 * @author chenbug
 * 
 * @version $Id: UserLogo.java, v 0.1 2011-1-25 下午08:44:04 chenbug Exp $
 */
public class UserLogo extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7014058497001012281L;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 内容
	 */
	private byte[] content;

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
	 * 系统头像id
	 */
	private long systemLogoId;

	/**
	 * 图片源id
	 */
	private String imageResourceId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
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

	/**
	 * @return the imageResourceId
	 */
	public String getImageResourceId() {
		return imageResourceId;
	}

	/**
	 * @param imageResourceId
	 *            the imageResourceId to set
	 */
	public void setImageResourceId(String imageResourceId) {
		this.imageResourceId = imageResourceId;
	}

}
