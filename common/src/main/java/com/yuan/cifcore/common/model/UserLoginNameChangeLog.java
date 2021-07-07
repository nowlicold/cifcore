/**
 * 
 */
package com.yuan.cifcore.common.model;

import java.util.Date;

/**
 * 会员登录名修改日志实体类
 * @author chengzi
 *
 * @version $Id: UserLoginNameChangeLog.java, v 0.1 2016年9月26日 下午6:30:14 chengzi Exp $
 */
public class UserLoginNameChangeLog {
	
	/**
     * 主键,PK
     */
    private long id;
	
	/**
     * 会员ID
     */
    private String userId;
	
	/**
     * 修改前登录名
     */
    private String loginNameBeforeChange;
	
	/**
     * 修改后登录名
     */
    private String loginNameAfterChange;
	
	/**
     * 创建时间
     */
    private Date gmtCreate;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the loginNameBeforeChange
	 */
	public String getLoginNameBeforeChange() {
		return loginNameBeforeChange;
	}

	/**
	 * @param loginNameBeforeChange the loginNameBeforeChange to set
	 */
	public void setLoginNameBeforeChange(String loginNameBeforeChange) {
		this.loginNameBeforeChange = loginNameBeforeChange;
	}

	/**
	 * @return the loginNameAfterChange
	 */
	public String getLoginNameAfterChange() {
		return loginNameAfterChange;
	}

	/**
	 * @param loginNameAfterChange the loginNameAfterChange to set
	 */
	public void setLoginNameAfterChange(String loginNameAfterChange) {
		this.loginNameAfterChange = loginNameAfterChange;
	}

	/**
	 * @return the gmtCreate
	 */
	public Date getGmtCreate() {
		return gmtCreate;
	}

	/**
	 * @param gmtCreate the gmtCreate to set
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
    
    

}
