package com.yuan.cifcore.common.model;

import java.util.Date;

import com.bench.common.cache.local.IdGmtModifiedRefreshableCacheObject;
import com.bench.common.model.BaseModel;

/**
 * 第三方用户映射配置
 * 
 * @author chenbug
 *
 * @version $Id: ThirdUserMappingConfig.java, v 0.1 2017年1月12日 下午9:38:53 chenbug
 *          Exp $
 */
public class ThirdUserMappingConfig extends BaseModel implements IdGmtModifiedRefreshableCacheObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5764262933213591255L;

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
	 * 一个会员映射到第三方会员的数量
	 */
	private int userToThirdUserCount;

	/**
	 * 一个会员映射到第三方会员的数量
	 */
	private int mapToThirdUserCount;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 一个会员映射到第三方父会员的数量
	 */
	private int mapToThirdParentUserCount;

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

	public int getUserToThirdUserCount() {
		return userToThirdUserCount;
	}

	public void setUserToThirdUserCount(int userToThirdUserCount) {
		this.userToThirdUserCount = userToThirdUserCount;
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

	public Long returnCacheKey() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public Date returnGmtModified() {
		// TODO Auto-generated method stub
		return gmtModified;
	}

	public int getMapToThirdUserCount() {
		return mapToThirdUserCount;
	}

	public void setMapToThirdUserCount(int mapToThirdUserCount) {
		this.mapToThirdUserCount = mapToThirdUserCount;
	}

	public int getMapToThirdParentUserCount() {
		return mapToThirdParentUserCount;
	}

	public void setMapToThirdParentUserCount(int mapToThirdParentUserCount) {
		this.mapToThirdParentUserCount = mapToThirdParentUserCount;
	}

}
