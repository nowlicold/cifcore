/**
 * 
 */
package com.yuan.cifcore.common.model;

import com.bench.common.model.BaseModel;

import java.util.Date;

/**
 * 会员第三方映射关联历史实体类
 * 
 * @author chengzi
 *
 * @version $Id: ThirdUserMappingHis.java, v 0.1 2018年8月1日 下午2:46:10 chengzi Exp
 *          $
 */
public class ThirdUserMappingHis extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2445203509775917406L;

	/**
	 * 主键，PK
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
	private String properties;

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
	 * 域
	 */
	private String domain;

	/**
	 * 第三方角色归属会员id
	 */
	private String thirdParentUserId;

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

	public String getThirdChannel() {
		return thirdChannel;
	}

	public void setThirdChannel(String thirdChannel) {
		this.thirdChannel = thirdChannel;
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

	public String getProperties() {
		return properties;
	}

	public void setProperties(String properties) {
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

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getThirdParentUserId() {
		return thirdParentUserId;
	}

	public void setThirdParentUserId(String thirdParentUserId) {
		this.thirdParentUserId = thirdParentUserId;
	}

}
