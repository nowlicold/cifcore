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
 * A data object class directly models database table <tt>cif_register_from_config</tt>.<br>
 * 注册来源配置登记表，针对个性化的注册来源进行配置
 * 
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_register_from_config.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="RegisterFromConfigDO对象", description="注册来源配置登记表，针对个性化的注册来源进行配置")
@TableName("cif_register_from_config")
public class RegisterFromConfigDO implements Serializable  {
    private static final long serialVersionUID = 741231858441822688L;

	public static final String TABLE_NAME = "CIF_REGISTER_FROM_CONFIG";
	//===========column onstants=====
	/**
	 * This constant corresponds to db column <tt>id</tt>.<br>
     */
	 public static final String COLUMN_ID = "id";
	/**
	 * This constant corresponds to db column <tt>from_user_id</tt>.<br>
     */
	 public static final String COLUMN_FROM_USER_ID = "from_user_id";
	/**
	 * This constant corresponds to db column <tt>from_type_code</tt>.<br>
     */
	 public static final String COLUMN_FROM_TYPE_CODE = "from_type_code";
	/**
	 * This constant corresponds to db column <tt>special_properties</tt>.<br>
     */
	 public static final String COLUMN_SPECIAL_PROPERTIES = "special_properties";
	/**
	 * This constant corresponds to db column <tt>gmt_create</tt>.<br>
     */
	 public static final String COLUMN_GMT_CREATE = "gmt_create";
	/**
	 * This constant corresponds to db column <tt>gmt_modified</tt>.<br>
     */
	 public static final String COLUMN_GMT_MODIFIED = "gmt_modified";
	/**
	 * This constant corresponds to db column <tt>creater</tt>.<br>
     */
	 public static final String COLUMN_CREATER = "creater";
	/**
	 * This constant corresponds to db column <tt>modifier</tt>.<br>
     */
	 public static final String COLUMN_MODIFIER = "modifier";
	/**
	 * This constant corresponds to db column <tt>from_code</tt>.<br>
     */
	 public static final String COLUMN_FROM_CODE = "from_code";
	/**
	 * This constant corresponds to db column <tt>from_user_has_website</tt>.<br>
     */
	 public static final String COLUMN_FROM_USER_HAS_WEBSITE = "from_user_has_website";
	/**
	 * This constant corresponds to db column <tt>enabled</tt>.<br>
     */
	 public static final String COLUMN_ENABLED = "enabled";
	/**
	 * This constant corresponds to db column <tt>default_from</tt>.<br>
     */
	 public static final String COLUMN_DEFAULT_FROM = "default_from";
	
	//========== properties ==========

	/**
	 * This property corresponds to db column <tt>id</tt>.<br>
     * 主键，PK
     */
	 @TableId(type = IdType.NONE)
	private long id;
	
	/**
	 * This property corresponds to db column <tt>from_user_id</tt>.<br>
     * 注册来源配置的会员ID
     */
	private String fromUserId;
	
	/**
	 * This property corresponds to db column <tt>from_type_code</tt>.<br>
     * 来源类型代码
     */
	private String fromTypeCode;
	
	/**
	 * This property corresponds to db column <tt>special_properties</tt>.<br>
     * 个性化属性
     */
	private String specialProperties;
	
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
	 * This property corresponds to db column <tt>creater</tt>.<br>
     * 创建人
     */
	private String creater;
	
	/**
	 * This property corresponds to db column <tt>modifier</tt>.<br>
     * 创建时间
     */
	private String modifier;
	
	/**
	 * This property corresponds to db column <tt>from_code</tt>.<br>
     * 代码
     */
	private String fromCode;
	
	/**
	 * This property corresponds to db column <tt>from_user_has_website</tt>.<br>
     * 源会员是否有网站
     */
	private boolean fromUserHasWebsite;
	
	/**
	 * This property corresponds to db column <tt>enabled</tt>.<br>
     * 是否有效
     */
	private boolean enabled;
	
	/**
	 * This property corresponds to db column <tt>default_from</tt>.<br>
     * 是否默认来源
     */
	private boolean defaultFrom;
	

    //========== getters and setters ==========

}