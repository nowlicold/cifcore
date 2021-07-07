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
 * A data object class directly models database table <tt>cif_user_logo</tt>.<br>
 * 用户Logo
 * 
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_user_logo.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserLogoDO对象", description="用户Logo")
@TableName("cif_user_logo")
public class UserLogoDO implements Serializable  {
    private static final long serialVersionUID = 741231858441822688L;

	public static final String TABLE_NAME = "CIF_USER_LOGO";
	//===========column onstants=====
	/**
	 * This constant corresponds to db column <tt>user_id</tt>.<br>
     */
	 public static final String COLUMN_USER_ID = "user_id";
	/**
	 * This constant corresponds to db column <tt>gmt_modified</tt>.<br>
     */
	 public static final String COLUMN_GMT_MODIFIED = "gmt_modified";
	/**
	 * This constant corresponds to db column <tt>gmt_create</tt>.<br>
     */
	 public static final String COLUMN_GMT_CREATE = "gmt_create";
	/**
	 * This constant corresponds to db column <tt>file_type</tt>.<br>
     */
	 public static final String COLUMN_FILE_TYPE = "file_type";
	/**
	 * This constant corresponds to db column <tt>system_logo_id</tt>.<br>
     */
	 public static final String COLUMN_SYSTEM_LOGO_ID = "system_logo_id";
	/**
	 * This constant corresponds to db column <tt>image_resource_id</tt>.<br>
     */
	 public static final String COLUMN_IMAGE_RESOURCE_ID = "image_resource_id";
	
	//========== properties ==========

	/**
	 * This property corresponds to db column <tt>user_id</tt>.<br>
     * 用户ID
     */
	 @TableId(type = IdType.NONE)
	private String userId;
	
	/**
	 * This property corresponds to db column <tt>gmt_modified</tt>.<br>
     * 修改时间
     */
	private Date gmtModified;
	
	/**
	 * This property corresponds to db column <tt>gmt_create</tt>.<br>
     * 创建时间
     */
	private Date gmtCreate;
	
	/**
	 * This property corresponds to db column <tt>file_type</tt>.<br>
     * 文件格式
     */
	private String fileType;
	
	/**
	 * This property corresponds to db column <tt>system_logo_id</tt>.<br>
     * 系统头像id
     */
	private long systemLogoId;
	
	/**
	 * This property corresponds to db column <tt>image_resource_id</tt>.<br>
     * 图片源id
     */
	private String imageResourceId;
	

    //========== getters and setters ==========

}