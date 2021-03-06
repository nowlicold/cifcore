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
 * A data object class directly models database table <tt>one_auth_identity_photo</tt>.<br>
 * 会员单认证身份证照片
 * 
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/one_auth_identity_photo.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="OneAuthIdentityPhotoDO对象", description="会员单认证身份证照片")
@TableName("one_auth_identity_photo")
public class OneAuthIdentityPhotoDO implements Serializable  {
    private static final long serialVersionUID = 741231858441822688L;

	public static final String TABLE_NAME = "ONE_AUTH_IDENTITY_PHOTO";
	//===========column onstants=====
	/**
	 * This constant corresponds to db column <tt>id</tt>.<br>
     */
	 public static final String COLUMN_ID = "id";
	/**
	 * This constant corresponds to db column <tt>one_auth_id</tt>.<br>
     */
	 public static final String COLUMN_ONE_AUTH_ID = "one_auth_id";
	/**
	 * This constant corresponds to db column <tt>creater</tt>.<br>
     */
	 public static final String COLUMN_CREATER = "creater";
	/**
	 * This constant corresponds to db column <tt>gmt_create</tt>.<br>
     */
	 public static final String COLUMN_GMT_CREATE = "gmt_create";
	/**
	 * This constant corresponds to db column <tt>gmt_modified</tt>.<br>
     */
	 public static final String COLUMN_GMT_MODIFIED = "gmt_modified";
	/**
	 * This constant corresponds to db column <tt>front_photo_resources_id</tt>.<br>
     */
	 public static final String COLUMN_FRONT_PHOTO_RESOURCES_ID = "front_photo_resources_id";
	/**
	 * This constant corresponds to db column <tt>back_photo_resources_id</tt>.<br>
     */
	 public static final String COLUMN_BACK_PHOTO_RESOURCES_ID = "back_photo_resources_id";
	/**
	 * This constant corresponds to db column <tt>modifier</tt>.<br>
     */
	 public static final String COLUMN_MODIFIER = "modifier";
	
	//========== properties ==========

	/**
	 * This property corresponds to db column <tt>id</tt>.<br>
     * 主键id
     */
	 @TableId(type = IdType.NONE)
	private String id;
	
	/**
	 * This property corresponds to db column <tt>one_auth_id</tt>.<br>
     * 单认证id
     */
	private String oneAuthId;
	
	/**
	 * This property corresponds to db column <tt>creater</tt>.<br>
     * 创建人
     */
	private String creater;
	
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
	 * This property corresponds to db column <tt>front_photo_resources_id</tt>.<br>
     * 正面照片资源id
     */
	private String frontPhotoResourcesId;
	
	/**
	 * This property corresponds to db column <tt>back_photo_resources_id</tt>.<br>
     * 背面照片资源id
     */
	private String backPhotoResourcesId;
	
	/**
	 * This property corresponds to db column <tt>modifier</tt>.<br>
     * 修改人
     */
	private String modifier;
	

    //========== getters and setters ==========

}
