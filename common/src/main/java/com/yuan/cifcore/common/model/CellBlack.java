package com.yuan.cifcore.common.model;

import com.bench.common.model.BaseModel;

import java.util.Date;

/**
 * 手机黑名单
 * 
 * @author chenbug
 * 
 * @version $Id: CellBlack.java, v 0.1 2014-5-12 上午11:57:06 chenbug Exp $
 */
public class CellBlack extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5034095357229060290L;

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
	 * 来源会员id
	 */
	private String fromUserId;

	/**
	 * 当前会员id
	 */
	private String currentUserId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
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

	public String getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	public String getCurrentUserId() {
		return currentUserId;
	}

	public void setCurrentUserId(String currentUserId) {
		this.currentUserId = currentUserId;
	}
}
