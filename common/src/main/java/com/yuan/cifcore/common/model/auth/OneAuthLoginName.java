package com.yuan.cifcore.common.model.auth;

import java.util.Date;

import com.bench.app.cif.base.core.model.security.enums.OneAuthLoginNameTypeEnum;
import com.bench.common.model.BaseModel;

/**
 * 单认证登录名实体类
 *
 * @author chengzi
 * @version id: OneAuthLoginName, v 0.1 2019年07月17日 16:38 chengzi Exp $
 */
public class OneAuthLoginName extends BaseModel {

	private static final long serialVersionUID = 6699367035459441922L;
	/**
	 * 主键，PK
	 */
	private long id;

	/**
	 * 用户ID
	 */
	private String oneAuthId;

	/**
	 * 用户登录名
	 */
	private String loginName;

	/**
	 * 登录名类型
	 */
	private OneAuthLoginNameTypeEnum loginNameType;

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

	public String getOneAuthId() {
		return oneAuthId;
	}

	public void setOneAuthId(String oneAuthId) {
		this.oneAuthId = oneAuthId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public OneAuthLoginNameTypeEnum getLoginNameType() {
		return loginNameType;
	}

	public void setLoginNameType(OneAuthLoginNameTypeEnum loginNameType) {
		this.loginNameType = loginNameType;
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
