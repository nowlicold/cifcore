package com.yuan.cifcore.common.model.auth;

import java.util.Date;

import com.bench.common.model.BaseModel;

/**
 * 单认证身份证照片实体类
 *
 * @Author: chengzi
 * @Date: 2019/3/15 11:15
 * @Version 1.0
 */
public class OneAuthIdentityPhoto extends BaseModel {

	private static final long serialVersionUID = 6767682797610759090L;

	/**
	 * 主键id
	 */
	private String id;

	/**
	 * 单认证id
	 */
	private String oneAuthId;

	/**
	 * 创建人
	 */
	private String creater;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 正面照片资源id
	 */
	private String frontPhotoResourcesId;

	/**
	 * 背面照片资源id
	 */
	private String backPhotoResourcesId;

	/**
	 * 修改人
	 */
	private String modifier;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOneAuthId() {
		return oneAuthId;
	}

	public void setOneAuthId(String oneAuthId) {
		this.oneAuthId = oneAuthId;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
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

	public String getFrontPhotoResourcesId() {
		return frontPhotoResourcesId;
	}

	public void setFrontPhotoResourcesId(String frontPhotoResourcesId) {
		this.frontPhotoResourcesId = frontPhotoResourcesId;
	}

	public String getBackPhotoResourcesId() {
		return backPhotoResourcesId;
	}

	public void setBackPhotoResourcesId(String backPhotoResourcesId) {
		this.backPhotoResourcesId = backPhotoResourcesId;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
}
