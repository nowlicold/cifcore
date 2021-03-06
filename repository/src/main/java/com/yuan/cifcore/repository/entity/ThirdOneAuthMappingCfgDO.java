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
 * A data object class directly models database table <tt>cif_third_one_auth_mapping_cfg</tt>.<br>
 * 第三方单认证配置
 * 
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_third_one_auth_mapping_cfg.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ThirdOneAuthMappingCfgDO对象", description="第三方单认证配置")
@TableName("cif_third_one_auth_mapping_cfg")
public class ThirdOneAuthMappingCfgDO implements Serializable  {
    private static final long serialVersionUID = 741231858441822688L;

	public static final String TABLE_NAME = "CIF_THIRD_ONE_AUTH_MAPPING_CFG";
	//===========column onstants=====
	/**
	 * This constant corresponds to db column <tt>id</tt>.<br>
     */
	 public static final String COLUMN_ID = "id";
	/**
	 * This constant corresponds to db column <tt>third_channel_code</tt>.<br>
     */
	 public static final String COLUMN_THIRD_CHANNEL_CODE = "third_channel_code";
	/**
	 * This constant corresponds to db column <tt>third_channel_name</tt>.<br>
     */
	 public static final String COLUMN_THIRD_CHANNEL_NAME = "third_channel_name";
	/**
	 * This constant corresponds to db column <tt>enabled</tt>.<br>
     */
	 public static final String COLUMN_ENABLED = "enabled";
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
	 * This property corresponds to db column <tt>id</tt>.<br>
     * 主键
     */
	 @TableId(type = IdType.NONE)
	private long id;
	
	/**
	 * This property corresponds to db column <tt>third_channel_code</tt>.<br>
     * 第三方通道代码
     */
	private String thirdChannelCode;
	
	/**
	 * This property corresponds to db column <tt>third_channel_name</tt>.<br>
     * 第三方通道名称
     */
	private String thirdChannelName;
	
	/**
	 * This property corresponds to db column <tt>enabled</tt>.<br>
     * 是否有效
     */
	private boolean enabled;
	
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
