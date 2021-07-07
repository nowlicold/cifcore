package com.yuan.cifcore.common.model;

import com.bench.common.model.BaseModel;
import com.bench.lang.base.object.ToStringBuilder;

import java.util.Date;
import java.util.Map;

/**
 * 第三方用户映射
 * 
 * @author chenbug
 * 
 * @version $Id: ThirdUserMapping.java, v 0.1 2011-5-31 下午02:28:42 chenbug Exp $
 */
public class ThirdUserMapping extends BaseModel  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5685621568282159232L;

	/**
	 * 映射ID
	 */
	private long id;

	/**
	 * 第三方用户ID
	 */
	private String thirdUserId;

	/**
	 * 第三方通道
	 */
	private String thirdChannel;

	/**
	 * 第三方登陆名
	 */
	private String thirdLoginName;

	/**
	 * 第三方用户名
	 */
	private String thirdUserName;

	/**
	 * 属性集合
	 */
	private Map<String, String> properties;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 第三方角色归属会员id
	 */
	private String thirdParentUserId;

	/**
	 * 域
	 */
	private String domain;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getThirdUserId() {
		return thirdUserId;
	}

	public void setThirdUserId(String thirdUserId) {
		this.thirdUserId = thirdUserId;
	}

	public String getThirdLoginName() {
		return thirdLoginName;
	}

	public void setThirdLoginName(String thirdLoginName) {
		this.thirdLoginName = thirdLoginName;
	}

	public String getThirdUserName() {
		return thirdUserName;
	}

	public void setThirdUserName(String thirdUserName) {
		this.thirdUserName = thirdUserName;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String getThirdChannel() {
		return thirdChannel;
	}

	public void setThirdChannel(String thirdChannel) {
		this.thirdChannel = thirdChannel;
	}

	public String getThirdParentUserId() {
		return thirdParentUserId;
	}

	public void setThirdParentUserId(String thirdParentUserId) {
		this.thirdParentUserId = thirdParentUserId;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

}
