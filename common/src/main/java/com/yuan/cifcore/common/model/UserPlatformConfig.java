package com.yuan.cifcore.common.model;

import com.bench.common.cache.local.GmtModifiedRefreshableCacheObject;

import java.util.Date;


/**
 * 用户平台配置
 * 
 * @author chenbug
 *
 * @version $Id: UserPlatformConfig.java, v 0.1 2017年2月20日 下午4:26:32 chenbug Exp
 *          $
 */
public class UserPlatformConfig implements GmtModifiedRefreshableCacheObject<String> {
	/**
	 * 平台类型
	 */
	private String platformType;

	/**
	 * 同时登录的数量
	 */
	private int maxLoginCountAtOneTime;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * sessionId是否必须
	 */
	private boolean sessionIdRequiredWhenLogin;

	public String getPlatformType() {
		return platformType;
	}

	public void setPlatformType(String platformType) {
		this.platformType = platformType;
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

	public String returnCacheKey() {
		// TODO Auto-generated method stub
		return platformType;
	}

	public int getMaxLoginCountAtOneTime() {
		return maxLoginCountAtOneTime;
	}

	public void setMaxLoginCountAtOneTime(int maxLoginCountAtOneTime) {
		this.maxLoginCountAtOneTime = maxLoginCountAtOneTime;
	}

	public boolean isSessionIdRequiredWhenLogin() {
		return sessionIdRequiredWhenLogin;
	}

	public void setSessionIdRequiredWhenLogin(boolean sessionIdRequiredWhenLogin) {
		this.sessionIdRequiredWhenLogin = sessionIdRequiredWhenLogin;
	}
}
