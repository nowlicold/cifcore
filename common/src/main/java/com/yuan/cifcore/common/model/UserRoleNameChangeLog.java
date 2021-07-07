/**
 * 
 */
package com.yuan.cifcore.common.model;

import java.util.Date;

/**
 * 会员角色名修改日志实体类
 * @author chengzi
 *
 * @version $Id: UserRoleNameChangeLog.java, v 0.1 2016年9月26日 下午6:02:49 chengzi Exp $
 */
public class UserRoleNameChangeLog {
	
	/**
     * 主键，PK
     */
    private long id;
	
	/**
     * 会员ID
     */
    private String userId;
	
	/**
     * 角色ID
     */
    private String roleId;
	
	/**
     * 修改前角色名
     */
    private String roleNameBeforeChange;
	
	/**
     * 修改后角色名
     */
    private String roleNameAfterChange;
	
	/**
     * 修改人
     */
    private String operator;
	
	/**
     * 备注
     */
    private String memo;
	
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
	 * @return the roleId
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	
	/**
	 * @return the roleNameBeforeChange
	 */
	public String getRoleNameBeforeChange() {
		return roleNameBeforeChange;
	}

	/**
	 * @param roleNameBeforeChange the roleNameBeforeChange to set
	 */
	public void setRoleNameBeforeChange(String roleNameBeforeChange) {
		this.roleNameBeforeChange = roleNameBeforeChange;
	}

	/**
	 * @return the roleNameAfterChange
	 */
	public String getRoleNameAfterChange() {
		return roleNameAfterChange;
	}

	/**
	 * @param roleNameAfterChange the roleNameAfterChange to set
	 */
	public void setRoleNameAfterChange(String roleNameAfterChange) {
		this.roleNameAfterChange = roleNameAfterChange;
	}

	/**
	 * @return the operator
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * @param operator the operator to set
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * @return the memo
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo the memo to set
	 */
	public void setMemo(String memo) {
		this.memo = memo;
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
