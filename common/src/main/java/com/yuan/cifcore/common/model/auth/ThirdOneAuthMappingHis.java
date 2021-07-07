package com.yuan.cifcore.common.model.auth;

import java.util.Date;
import java.util.Map;

import com.bench.common.model.BaseModel;

/**
 * 第三方单认证映射历史实体类
 * 
 * @author qubin
 *
 * @version $Id: ThirdOneAuthMappingHis.java, v 0.1 2018年8月21日 下午4:45:09 qubin Exp $
 */
public class ThirdOneAuthMappingHis extends BaseModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1380282959658487190L;

	/**
	 * 映射ID
	 */
	private String id;

	/**
	 * 第三方单认证ID
	 */
	private String thirdOneAuthId;

	/**
	 * 第三方通道
	 */
	private String thirdChannel;

	/**
	 * 第三方单认证登陆名
	 */
	private String thirdOneAuthName;

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
	 * 单认证ID
	 */
	private String oneAuthId;

	/**
	 * 域
	 */
	private String domain;
	
	/**
	 * 唯一id
	 */
	private String uniqueId;
	
	/**
	 * 历史创建时间
	 */
	private Date gmtHistoryCreate;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getThirdOneAuthId() {
		return thirdOneAuthId;
	}

	public void setThirdOneAuthId(String thirdOneAuthId) {
		this.thirdOneAuthId = thirdOneAuthId;
	}

	public String getThirdChannel() {
		return thirdChannel;
	}

	public void setThirdChannel(String thirdChannel) {
		this.thirdChannel = thirdChannel;
	}

	public String getThirdOneAuthName() {
		return thirdOneAuthName;
	}

	public void setThirdOneAuthName(String thirdOneAuthName) {
		this.thirdOneAuthName = thirdOneAuthName;
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

	public String getOneAuthId() {
		return oneAuthId;
	}

	public void setOneAuthId(String oneAuthId) {
		this.oneAuthId = oneAuthId;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public Date getGmtHistoryCreate() {
		return gmtHistoryCreate;
	}

	public void setGmtHistoryCreate(Date gmtHistoryCreate) {
		this.gmtHistoryCreate = gmtHistoryCreate;
	}

}
