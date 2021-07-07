package com.yuan.cifcore.common.model.view;

import com.bench.common.model.BaseModel;
import com.bench.lang.base.object.ToStringBuilder;
import com.yuan.cifcore.common.model.enums.UserActionEnum;

import java.util.Date;

/**
 * 用户日志信息
 * 
 * @author chenbug
 * 
 * @version $Id: UserLogInfo.java, v 0.1 2010-10-27 下午12:47:14 chenbug Exp $
 */
public class UserLogInfo extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7475416944980491933L;

	/**
	 * 日志ID
	 */
	private long id;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 日志Action
	 */
	private UserActionEnum action;

	/**
	 * 日志内容
	 */
	private String content;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 创建人
	 */
	private String creator;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public UserActionEnum getAction() {
		return action;
	}

	public void setAction(UserActionEnum action) {
		this.action = action;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
