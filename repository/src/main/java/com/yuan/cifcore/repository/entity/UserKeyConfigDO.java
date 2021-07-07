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
 * A data object class directly models database table <tt>cif_user_key_config</tt>.<br>
 * 会员key配置
 * 
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_user_key_config.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserKeyConfigDO对象", description="会员key配置")
@TableName("cif_user_key_config")
public class UserKeyConfigDO implements Serializable  {
    private static final long serialVersionUID = 741231858441822688L;

	public static final String TABLE_NAME = "CIF_USER_KEY_CONFIG";
	//===========column onstants=====
	/**
	 * This constant corresponds to db column <tt>id</tt>.<br>
     */
	 public static final String COLUMN_ID = "id";
	/**
	 * This constant corresponds to db column <tt>key_type</tt>.<br>
     */
	 public static final String COLUMN_KEY_TYPE = "key_type";
	/**
	 * This constant corresponds to db column <tt>gmt_create</tt>.<br>
     */
	 public static final String COLUMN_GMT_CREATE = "gmt_create";
	/**
	 * This constant corresponds to db column <tt>gmt_modified</tt>.<br>
     */
	 public static final String COLUMN_GMT_MODIFIED = "gmt_modified";
	/**
	 * This constant corresponds to db column <tt>expire_seconds</tt>.<br>
     */
	 public static final String COLUMN_EXPIRE_SECONDS = "expire_seconds";
	/**
	 * This constant corresponds to db column <tt>max_use_per_key</tt>.<br>
     */
	 public static final String COLUMN_MAX_USE_PER_KEY = "max_use_per_key";
	
	//========== properties ==========

	/**
	 * This property corresponds to db column <tt>id</tt>.<br>
     * 主键，PK
     */
	 @TableId(type = IdType.NONE)
	private long id;
	
	/**
	 * This property corresponds to db column <tt>key_type</tt>.<br>
     * key类型
     */
	private String keyType;
	
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
	 * This property corresponds to db column <tt>expire_seconds</tt>.<br>
     * 过期秒数，-1表示不过期
     */
	private long expireSeconds;
	
	/**
	 * This property corresponds to db column <tt>max_use_per_key</tt>.<br>
     * 单key最多使用次数
     */
	private long maxUsePerKey;
	

    //========== getters and setters ==========

}