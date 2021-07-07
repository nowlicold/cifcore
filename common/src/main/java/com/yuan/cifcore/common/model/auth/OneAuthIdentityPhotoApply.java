package com.yuan.cifcore.common.model.auth;

import java.util.Date;

import com.bench.app.cif.base.core.model.enums.OneAuthIdentityPhotoApplyStatusEnum;
import com.bench.common.model.BaseModel;

/**
 * 单认证身份证照片申请实体类
 *
 * @Author: chengzi
 * @Date: 2019/3/14 17:45
 * @Version 1.0
 */
public class OneAuthIdentityPhotoApply extends BaseModel {

	private static final long serialVersionUID = 4713077227936491307L;

	/**
	 * 状态
	 */
	private OneAuthIdentityPhotoApplyStatusEnum status;

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
	 * 审核人
	 */
	private String auditor;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 审核时间
	 */
	private Date gmtAudit;

	/**
	 * 正面照片资源id
	 */
	private String frontPhotoResourcesId;

	/**
	 * 背面照片资源id
	 */
	private String backPhotoResourcesId;

	/**
	 * 审核备注
	 */
	private String auditMemo;

	public OneAuthIdentityPhotoApplyStatusEnum getStatus() {
		return status;
	}

	public void setStatus(OneAuthIdentityPhotoApplyStatusEnum status) {
		this.status = status;
	}

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

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
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

	public Date getGmtAudit() {
		return gmtAudit;
	}

	public void setGmtAudit(Date gmtAudit) {
		this.gmtAudit = gmtAudit;
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

	public String getAuditMemo() {
		return auditMemo;
	}

	public void setAuditMemo(String auditMemo) {
		this.auditMemo = auditMemo;
	}
}
