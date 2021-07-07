package com.yuan.cifcore.common.model.auth;

import java.util.Date;

import com.bench.common.model.BaseModel;
import com.bench.runtime.core.cache.memory.object.IdGmtModifiedRefreshableCacheObject;

/**
 * 第三方单认证映射配置
 * 
 * @author qubin
 *
 * @version $Id: ThirdOneAuthMappingConfig.java, v 0.1 2018年8月15日 上午10:27:24 qubin Exp $
 */
public class ThirdOneAuthMappingConfig extends BaseModel implements IdGmtModifiedRefreshableCacheObject<Long> {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1858491536907128363L;

	/**
	 * 主键，PK
	 */
	private long id;

	/**
	 * 第三方通道代码
	 */
	private String thirdChannelCode;

	/**
	 * 第三方通道名称
	 */
	private String thirdChannelName;

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

	public String getThirdChannelCode() {
		return thirdChannelCode;
	}

	public void setThirdChannelCode(String thirdChannelCode) {
		this.thirdChannelCode = thirdChannelCode;
	}

	public String getThirdChannelName() {
		return thirdChannelName;
	}

	public void setThirdChannelName(String thirdChannelName) {
		this.thirdChannelName = thirdChannelName;
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

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	@Override
	public Long returnCacheKey() {
		// TODO Auto-generated method stub
		return id;
	}
	
	@Override
	public Date getGmtModified() {
		// TODO Auto-generated method stub
		return gmtModified;
	}

	

}
