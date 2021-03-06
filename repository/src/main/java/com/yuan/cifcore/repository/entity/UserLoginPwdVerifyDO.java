/*
 * Bench Inc.
 * Copyright (c) 2004 All Rights Reserved.
 */
package com.yuan.cifcore.repository.entity;

// auto generated imports
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.IdType;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * A data object class directly models database table <tt>cif_user_login_pwd_verify</tt>.<br>
 * 用户表登录密码检查表，一般用户密码修改场景，检查失败次数不累计到登录验证错误次数
 * 
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_user_login_pwd_verify.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserLoginPwdVerifyDO对象", description="用户表登录密码检查表，一般用户密码修改场景，检查失败次数不累计到登录验证错误次数")
@TableName("cif_user_login_pwd_verify")
public class UserLoginPwdVerifyDO implements Serializable  {
    private static final long serialVersionUID = 741231858441822688L;

	public static final String TABLE_NAME = "CIF_USER_LOGIN_PWD_VERIFY";
	//===========column onstants=====
	/**
	 * This constant corresponds to db column <tt>user_id</tt>.<br>
     */
	 public static final String COLUMN_USER_ID = "user_id";
	/**
	 * This constant corresponds to db column <tt>gmt_failed</tt>.<br>
     */
	 public static final String COLUMN_GMT_FAILED = "gmt_failed";
	/**
	 * This constant corresponds to db column <tt>retry_count</tt>.<br>
     */
	 public static final String COLUMN_RETRY_COUNT = "retry_count";
	/**
	 * This constant corresponds to db column <tt>gmt_success</tt>.<br>
     */
	 public static final String COLUMN_GMT_SUCCESS = "gmt_success";
	/**
	 * This constant corresponds to db column <tt>gmt_create</tt>.<br>
     */
	 public static final String COLUMN_GMT_CREATE = "gmt_create";
	/**
	 * This constant corresponds to db column <tt>gmt_modified</tt>.<br>
     */
	 public static final String COLUMN_GMT_MODIFIED = "gmt_modified";
	
	//========== properties ==========

	/**
	 * This property corresponds to db column <tt>user_id</tt>.<br>
     * 用户ID
     */
	 @TableId(type = IdType.NONE)
	private String userId;
	
	/**
	 * This property corresponds to db column <tt>gmt_failed</tt>.<br>
     * 最近校验登录密码失败时间
     */
	private Date gmtFailed;
	
	/**
	 * This property corresponds to db column <tt>retry_count</tt>.<br>
     * 验证登录密码重试次数
     */
	private int retryCount;
	
	/**
	 * This property corresponds to db column <tt>gmt_success</tt>.<br>
     * 验证登录密码成功时间
     */
	private Date gmtSuccess;
	
	/**
	 * This property corresponds to db column <tt>gmt_create</tt>.<br>
     * 创建时间
     */
	private Date gmtCreate;
	
	/**
	 * This property corresponds to db column <tt>gmt_modified</tt>.<br>
     * 修改时间
     */
	private Date gmtModified;
	

    //========== getters and setters ==========

}
