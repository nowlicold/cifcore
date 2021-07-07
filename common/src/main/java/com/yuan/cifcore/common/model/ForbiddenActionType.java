/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model;

import java.util.Date;

import com.bench.common.cache.local.IdGmtModifiedRefreshableCacheObject;
import com.bench.common.model.BaseModel;

/**
 * 禁止动作类型
 * 
 * @author yiyi
 *
 * @version $Id: ForbiddenActionType.java, v 0.1 2017年11月29日 下午1:29:22 yiyi Exp
 *          $
 */
public class ForbiddenActionType extends BaseModel implements IdGmtModifiedRefreshableCacheObject<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1940666635574082558L;

	/**
	 * 主键，PK
	 */
	private long id;

	/**
	 * 禁止动作中文名称
	 */
	private String message;

	/**
	 * 禁止动作英文代码
	 */
	private String name;

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

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public Long returnCacheKey() {
		// TODO Auto-generated method stub
		return this.id;
	}

}
