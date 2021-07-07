package com.yuan.cifcore.common.model;

import java.util.Date;

import com.bench.common.model.BaseModel;

/**
 * 注册来源配置的域名
 * 
 * @author chenbug
 * 
 * @version $Id: RegisterFromCfgDomain.java, v 0.1 2014-4-4 下午3:55:01 chenbug
 *          Exp $
 */
public class RegisterFromCfgDomain extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4950153438075579271L;

	/**
	 * 主键，PK
	 */
	private long id;

	/**
	 * 注册来源配置ID
	 */
	private long registerFromConfigId;

	/**
	 * 域名
	 */
	private String domainName;

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getRegisterFromConfigId() {
		return registerFromConfigId;
	}

	public void setRegisterFromConfigId(long registerFromConfigId) {
		this.registerFromConfigId = registerFromConfigId;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
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

}
