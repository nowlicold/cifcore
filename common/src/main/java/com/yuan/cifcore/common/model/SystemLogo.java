/**
 * 
 */
package com.yuan.cifcore.common.model;

import com.bench.common.model.BaseModel;

import java.util.Date;

/**
 * 系统头像
 * 
 * @author Left
 *
 * @version $Id: SystemLogo.java, v 0.1 2016年1月19日 上午11:01:28 Administrator Exp
 *          $
 */
public class SystemLogo extends BaseModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8514109251009391513L;

	/**
	 * 主键id
	 */
	private long id;

	/**
	 * 文件名
	 */
	private String fileName;

	/**
	 * 头像代码
	 */
	private String code;

	/**
	 * 头像名
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
	 * 修改人
	 */
	private String modifier;

	/**
	 * 分组id
	 */
	private long groupId;

	/**
	 * 排序值
	 */
	private long orderNumber;

	/**
	 * 是否有效
	 */
	private boolean enabled;

	/**
	 * 图片源Id
	 */
	private String imageResourceId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
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

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getImageResourceId() {
		return imageResourceId;
	}

	public void setImageResourceId(String imageResourceId) {
		this.imageResourceId = imageResourceId;
	}
}
