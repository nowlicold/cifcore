/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model;

import java.util.Date;

import com.bench.common.model.BaseModel;
import com.yuan.cifcore.common.model.enums.ForbiddenObjectTypeEnum;
import com.yuan.cifcore.common.model.enums.OperatorTypeEnum;

/**
 * 禁止
 * 
 * @author yiyi
 *
 * @version $Id: Forbidden.java, v 0.1 2017年11月23日 下午8:13:26 yiyi Exp $
 */
public class Forbidden extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7354377698192468343L;

	/**
	 * 主键，PK
	 */
	private String id;

	/**
	 * 禁止对象类型
	 */
	private ForbiddenObjectTypeEnum forbiddenObjectType;

	/**
	 * 禁止对象id
	 */
	private String forbiddenObjectId;

	/**
	 * 禁止原因
	 */
	private String forbiddenReason;

	/**
	 * 是否有效
	 */
	private boolean enabled;

	/**
	 * 开始时间
	 */
	private Date gmtStart;

	/**
	 * 结束时间，如果为空代表永久禁止
	 */
	private Date gmtEnd;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 禁止分钟数，如果是-1代表永久禁止
	 */
	private long forbiddenMinutes;

	/**
	 * 备注
	 */
	private String memo;

	/**
	 * 禁止动作类型id
	 */
	private long forbiddenActionTypeId;

	/**
	 * 操作人类型
	 */
	private OperatorTypeEnum operatorType;

	/**
	 * 操作人
	 */
	private String operatorId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ForbiddenObjectTypeEnum getForbiddenObjectType() {
		return forbiddenObjectType;
	}

	public void setForbiddenObjectType(ForbiddenObjectTypeEnum forbiddenObjectType) {
		this.forbiddenObjectType = forbiddenObjectType;
	}

	public String getForbiddenObjectId() {
		return forbiddenObjectId;
	}

	public void setForbiddenObjectId(String forbiddenObjectId) {
		this.forbiddenObjectId = forbiddenObjectId;
	}

	public String getForbiddenReason() {
		return forbiddenReason;
	}

	public void setForbiddenReason(String forbiddenReason) {
		this.forbiddenReason = forbiddenReason;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Date getGmtStart() {
		return gmtStart;
	}

	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

	public Date getGmtEnd() {
		return gmtEnd;
	}

	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
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

	public long getForbiddenMinutes() {
		return forbiddenMinutes;
	}

	public void setForbiddenMinutes(long forbiddenMinutes) {
		this.forbiddenMinutes = forbiddenMinutes;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public long getForbiddenActionTypeId() {
		return forbiddenActionTypeId;
	}

	public void setForbiddenActionTypeId(long forbiddenActionTypeId) {
		this.forbiddenActionTypeId = forbiddenActionTypeId;
	}

	public OperatorTypeEnum getOperatorType() {
		return operatorType;
	}

	public void setOperatorType(OperatorTypeEnum operatorType) {
		this.operatorType = operatorType;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

}
