/**
 * 
 */
package com.yuan.cifcore.common.model;

import java.util.Date;
import java.util.Map;

import com.bench.common.model.BaseModel;

/**
 * 注册来源类型
 * 
 * @author chenbug
 * 
 * @version $Id: RegisterFromType.java, v 0.1 2014-4-3 下午6:03:34 chenbug Exp $
 */
public class RegisterFromType extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2849129005986669027L;

	/**
	 * 代码
	 */
	private String code;

	/**
	 * 名称
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
	 * 属性集合
	 */
	private Map<String, String> properties;

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

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

}
