/**
 * 
 */
package com.yuan.cifcore.common.model;

import com.bench.common.model.BaseModel;

import java.util.Date;

/**
 * 可注册手机号实体类
 * 
 * @author chengzi
 *
 * @version $Id: RegistrableCell.java, v 0.1 2018年7月2日 下午4:46:41 chengzi Exp $
 */
public class RegistrableCell extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1985641291819664742L;

	/**
	 * 主键，PK
	 */
	private long id;

	/**
	 * 手机号
	 */
	private String cell;

	/**
	 * 是否有效
	 */
	private boolean enabled;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 申请变更时间
	 */
	private Date gmtApply;

	/**
	 * 备注
	 */
	private String memo;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 注册来源类型
	 */
	private String registerFromType;

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
	 * @return the cell
	 */
	public String getCell() {
		return cell;
	}

	/**
	 * @param cell
	 *            the cell to set
	 */
	public void setCell(String cell) {
		this.cell = cell;
	}

	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param enabled
	 *            the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
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
	 * @return the gmtApply
	 */
	public Date getGmtApply() {
		return gmtApply;
	}

	/**
	 * @param gmtApply
	 *            the gmtApply to set
	 */
	public void setGmtApply(Date gmtApply) {
		this.gmtApply = gmtApply;
	}

	/**
	 * @return the memo
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo
	 *            the memo to set
	 */
	public void setMemo(String memo) {
		this.memo = memo;
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
	 * @return the registerFromType
	 */
	public String getRegisterFromType() {
		return registerFromType;
	}

	/**
	 * @param registerFromType
	 *            the registerFromType to set
	 */
	public void setRegisterFromType(String registerFromType) {
		this.registerFromType = registerFromType;
	}

}
