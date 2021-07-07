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
 * A data object class directly models database table <tt>cif_user_key</tt>.<br>
 * 会员活动KEY
 * 
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_user_key.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserKeyDO对象", description="会员活动KEY")
@TableName("cif_user_key")
public class UserKeyDO implements Serializable  {
    private static final long serialVersionUID = 741231858441822688L;

	public static final String TABLE_NAME = "CIF_USER_KEY";
	//===========column onstants=====
	/**
	 * This constant corresponds to db column <tt>id</tt>.<br>
     */
	 public static final String COLUMN_ID = "id";
	/**
	 * This constant corresponds to db column <tt>user_id</tt>.<br>
     */
	 public static final String COLUMN_USER_ID = "user_id";
	/**
	 * This constant corresponds to db column <tt>key_value</tt>.<br>
     */
	 public static final String COLUMN_KEY_VALUE = "key_value";
	/**
	 * This constant corresponds to db column <tt>gmt_create</tt>.<br>
     */
	 public static final String COLUMN_GMT_CREATE = "gmt_create";
	/**
	 * This constant corresponds to db column <tt>gmt_modified</tt>.<br>
     */
	 public static final String COLUMN_GMT_MODIFIED = "gmt_modified";
	/**
	 * This constant corresponds to db column <tt>gmt_expired</tt>.<br>
     */
	 public static final String COLUMN_GMT_EXPIRED = "gmt_expired";
	/**
	 * This constant corresponds to db column <tt>apply_parameters</tt>.<br>
     */
	 public static final String COLUMN_APPLY_PARAMETERS = "apply_parameters";
	/**
	 * This constant corresponds to db column <tt>key_type</tt>.<br>
     */
	 public static final String COLUMN_KEY_TYPE = "key_type";
	/**
	 * This constant corresponds to db column <tt>used</tt>.<br>
     */
	 public static final String COLUMN_USED = "used";
	/**
	 * This constant corresponds to db column <tt>gmt_used</tt>.<br>
     */
	 public static final String COLUMN_GMT_USED = "gmt_used";
	/**
	 * This constant corresponds to db column <tt>used_parameters</tt>.<br>
     */
	 public static final String COLUMN_USED_PARAMETERS = "used_parameters";
	
	//========== properties ==========

	/**
	 * This property corresponds to db column <tt>id</tt>.<br>
     * 主键，PK
     */
	 @TableId(type = IdType.NONE)
	private long id;
	
	/**
	 * This property corresponds to db column <tt>user_id</tt>.<br>
     * 会员Id
     */
	private String userId;
	
	/**
	 * This property corresponds to db column <tt>key_value</tt>.<br>
     * key值
     */
	private String keyValue;
	
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
	
	/**
	 * This property corresponds to db column <tt>gmt_expired</tt>.<br>
     * 过期时间
     */
	private Date gmtExpired;
	
	/**
	 * This property corresponds to db column <tt>apply_parameters</tt>.<br>
     * 申请参数集合
     */
	private String applyParameters;
	
	/**
	 * This property corresponds to db column <tt>key_type</tt>.<br>
     * key类型
     */
	private String keyType;
	
	/**
	 * This property corresponds to db column <tt>used</tt>.<br>
     * 是否已使用
     */
	private boolean used;
	
	/**
	 * This property corresponds to db column <tt>gmt_used</tt>.<br>
     * 使用时间
     */
	private Date gmtUsed;
	
	/**
	 * This property corresponds to db column <tt>used_parameters</tt>.<br>
     * 使用后参数集合
     */
	private String usedParameters;
	

    //========== getters and setters ==========

}
