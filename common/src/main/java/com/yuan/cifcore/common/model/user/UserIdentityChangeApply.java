/**
 * 
 */
package com.yuan.cifcore.common.model.user;

import com.bench.common.model.BaseModel;
import com.yuan.cifcore.common.model.enums.CertTypeEnum;
import com.yuan.cifcore.common.model.enums.UserIdentityChangeApplyStatusEnum;

import java.util.Date;

/**
 * 会员实名修改申请实体类
 * 
 * @author chengzi
 *
 * @version $Id: UserIdentityChangeApply.java, v 0.1 2019年10月21日 下午7:55:38 chengzi Exp $
 */
public class UserIdentityChangeApply extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9085297623215213304L;

	/**
	 * id
	 */
	private long id;

	/**
	 * 更改的真实证件号
	 */
	private String changeCertNo;

	/**
	 * 更改的真实姓名
	 */
	private String changeRealName;

	/**
	 * 申请者id
	 */
	private String createrId;

	/**
	 * 申请时间
	 */
	private Date gmtCreate;

	/**
	 * 审核id
	 */
	private String auditerId;

	/**
	 * 审核状态
	 */
	private UserIdentityChangeApplyStatusEnum status;

	/**
	 * 审核记录
	 */
	private String auditMemo;

	/**
	 * 审核时间
	 */
	private Date gmtAudit;

	/**
	 * 申请记录
	 */
	private String createMemo;

	/**
	 * 申请修改的时间
	 */
	private Date gmtModified;

	/**
	 * 用户id
	 */
	private String userId;

	/**
	 * 更改的证件类型
	 */
	private CertTypeEnum changeCertType;

	/**
	 * 创建人平台code
	 */
	private String createrPlatformCode;

	/**
	 * 审核人平台code
	 */
	private String auditerPlatformCode;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the changeCertNo
	 */
	public String getChangeCertNo() {
		return changeCertNo;
	}

	/**
	 * @param changeCertNo
	 *            the changeCertNo to set
	 */
	public void setChangeCertNo(String changeCertNo) {
		this.changeCertNo = changeCertNo;
	}

	/**
	 * @return the changeRealName
	 */
	public String getChangeRealName() {
		return changeRealName;
	}

	/**
	 * @param changeRealName
	 *            the changeRealName to set
	 */
	public void setChangeRealName(String changeRealName) {
		this.changeRealName = changeRealName;
	}

	/**
	 * @return the createrId
	 */
	public String getCreaterId() {
		return createrId;
	}

	/**
	 * @param createrId
	 *            the createrId to set
	 */
	public void setCreaterId(String createrId) {
		this.createrId = createrId;
	}

	/**
	 * @return the gmtCreate
	 */
	public Date getGmtCreate() {
		return gmtCreate;
	}

	/**
	 * @param gmtCreate
	 *            the gmtCreate to set
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	/**
	 * @return the auditerId
	 */
	public String getAuditerId() {
		return auditerId;
	}

	/**
	 * @param auditerId
	 *            the auditerId to set
	 */
	public void setAuditerId(String auditerId) {
		this.auditerId = auditerId;
	}

	/**
	 * @return the status
	 */
	public UserIdentityChangeApplyStatusEnum getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(UserIdentityChangeApplyStatusEnum status) {
		this.status = status;
	}

	/**
	 * @return the auditMemo
	 */
	public String getAuditMemo() {
		return auditMemo;
	}

	/**
	 * @param auditMemo
	 *            the auditMemo to set
	 */
	public void setAuditMemo(String auditMemo) {
		this.auditMemo = auditMemo;
	}

	/**
	 * @return the gmtAudit
	 */
	public Date getGmtAudit() {
		return gmtAudit;
	}

	/**
	 * @param gmtAudit
	 *            the gmtAudit to set
	 */
	public void setGmtAudit(Date gmtAudit) {
		this.gmtAudit = gmtAudit;
	}

	/**
	 * @return the createMemo
	 */
	public String getCreateMemo() {
		return createMemo;
	}

	/**
	 * @param createMemo
	 *            the createMemo to set
	 */
	public void setCreateMemo(String createMemo) {
		this.createMemo = createMemo;
	}

	/**
	 * @return the gmtModified
	 */
	public Date getGmtModified() {
		return gmtModified;
	}

	/**
	 * @param gmtModified
	 *            the gmtModified to set
	 */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the changeCertType
	 */
	public CertTypeEnum getChangeCertType() {
		return changeCertType;
	}

	/**
	 * @param changeCertType
	 *            the changeCertType to set
	 */
	public void setChangeCertType(CertTypeEnum changeCertType) {
		this.changeCertType = changeCertType;
	}

	/**
	 * @return the createrPlatformCode
	 */
	public String getCreaterPlatformCode() {
		return createrPlatformCode;
	}

	/**
	 * @param createrPlatformCode
	 *            the createrPlatformCode to set
	 */
	public void setCreaterPlatformCode(String createrPlatformCode) {
		this.createrPlatformCode = createrPlatformCode;
	}

	/**
	 * @return the auditerPlatformCode
	 */
	public String getAuditerPlatformCode() {
		return auditerPlatformCode;
	}

	/**
	 * @param auditerPlatformCode
	 *            the auditerPlatformCode to set
	 */
	public void setAuditerPlatformCode(String auditerPlatformCode) {
		this.auditerPlatformCode = auditerPlatformCode;
	}

}
