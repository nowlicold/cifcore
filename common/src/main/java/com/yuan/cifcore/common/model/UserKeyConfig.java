/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model;

import java.util.Date;

/**
 * 会员key配置
 * 
 * @author chenbug
 * 
 * @version $Id: UserKeyConfig.java, v 0.1 2014-5-10 下午2:39:51 chenbug Exp $
 */
public class UserKeyConfig {

	/**
	 * 主键，PK
	 */
	private long id;

	/**
	 * key类型
	 */
	private String keyType;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 过期秒数，-1表示不过期
	 */
	private long expireSeconds;

	/**
	 * 单key最多使用次数
	 */
	private long maxUsePerKey;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getKeyType() {
		return keyType;
	}

	public void setKeyType(String keyType) {
		this.keyType = keyType;
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

	public long getExpireSeconds() {
		return expireSeconds;
	}

	public void setExpireSeconds(long expireSeconds) {
		this.expireSeconds = expireSeconds;
	}

	public long getMaxUsePerKey() {
		return maxUsePerKey;
	}

	public void setMaxUsePerKey(long maxUsePerKey) {
		this.maxUsePerKey = maxUsePerKey;
	}

}
