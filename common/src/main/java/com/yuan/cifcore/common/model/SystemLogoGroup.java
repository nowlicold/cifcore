/**
 * 
 */
package com.yuan.cifcore.common.model;

import com.bench.common.model.BaseModel;

import java.util.Date;

/**
 * 系统头像分组
 * @author Left
 *
 * @version $Id: SystemLogoGroup.java, v 0.1 2016年1月18日 下午6:58:24 Administrator
 *          Exp $
 */
public class SystemLogoGroup extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4727513846780444840L;

	/**
	 * 主键,id
	 */
	private long id;

	/**
	 * 分组代码
	 */
	private String code;

	/**
	 * 分组名
	 */
	private String name;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 是否有效
	 */
	private boolean enabled;

	/**
	 * 排序值
	 */
	private double orderNumber;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public double getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(double orderNumber) {
		this.orderNumber = orderNumber;
	}

}
