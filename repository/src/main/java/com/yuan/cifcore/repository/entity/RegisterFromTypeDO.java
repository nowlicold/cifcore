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
 * A data object class directly models database table <tt>cif_register_from_type</tt>.<br>
 * 注册来源类型
 * 
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_register_from_type.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="RegisterFromTypeDO对象", description="注册来源类型")
@TableName("cif_register_from_type")
public class RegisterFromTypeDO implements Serializable  {
    private static final long serialVersionUID = 741231858441822688L;

	public static final String TABLE_NAME = "CIF_REGISTER_FROM_TYPE";
	//===========column onstants=====
	/**
	 * This constant corresponds to db column <tt>code</tt>.<br>
     */
	 public static final String COLUMN_CODE = "code";
	/**
	 * This constant corresponds to db column <tt>name</tt>.<br>
     */
	 public static final String COLUMN_NAME = "name";
	/**
	 * This constant corresponds to db column <tt>gmt_create</tt>.<br>
     */
	 public static final String COLUMN_GMT_CREATE = "gmt_create";
	/**
	 * This constant corresponds to db column <tt>gmt_modified</tt>.<br>
     */
	 public static final String COLUMN_GMT_MODIFIED = "gmt_modified";
	/**
	 * This constant corresponds to db column <tt>enabled</tt>.<br>
     */
	 public static final String COLUMN_ENABLED = "enabled";
	/**
	 * This constant corresponds to db column <tt>properties</tt>.<br>
     */
	 public static final String COLUMN_PROPERTIES = "properties";
	
	//========== properties ==========

	/**
	 * This property corresponds to db column <tt>code</tt>.<br>
     * 代码
     */
	 @TableId(type = IdType.NONE)
	private String code;
	
	/**
	 * This property corresponds to db column <tt>name</tt>.<br>
     * 名称
     */
	private String name;
	
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
	 * This property corresponds to db column <tt>enabled</tt>.<br>
     * 是否有效
     */
	private boolean enabled;
	
	/**
	 * This property corresponds to db column <tt>properties</tt>.<br>
     * 属性集合
     */
	private String properties;
	

    //========== getters and setters ==========

}
