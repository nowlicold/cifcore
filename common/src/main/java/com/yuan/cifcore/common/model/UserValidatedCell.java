package com.yuan.cifcore.common.model;

import com.bench.common.model.BaseModel;

import java.util.Date;

/**
 * 用户手机验证属性
 * 
 * @author wangkai
 *
 * @version $Id: UserValidatedCell.java, v 0.1 2015年2月2日 上午11:04:03 Administrator Exp $
 */
public class UserValidatedCell extends BaseModel{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 476415750507231746L;

	/**
	 * 主键,PK
	 */
	private long id;
	
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 用户登录名
	 */
	private String loginName;
	/**
	 * 手机
	 */
	private String cell;
	
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	
	/**
	 * 修改时间
	 */
	private Date gmtModified;

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
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

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	
}
