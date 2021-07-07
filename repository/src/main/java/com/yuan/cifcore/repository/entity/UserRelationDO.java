/*
 * Bench Inc.
 * Copyright (c) 2004 All Rights Reserved.
 */
package com.yuan.cifcore.repository.entity;

// auto generated imports
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * A data object class directly models database table <tt>cif_user_relation</tt>.<br>
 * 用户关系表
 * 
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_user_relation.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserRelationDO对象", description="用户关系表")
@TableName("cif_user_relation")
public class UserRelationDO implements Serializable  {
    private static final long serialVersionUID = 741231858441822688L;

	public static final String TABLE_NAME = "CIF_USER_RELATION";
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
	 * This constant corresponds to db column <tt>other_user_id</tt>.<br>
     */
	 public static final String COLUMN_OTHER_USER_ID = "other_user_id";
	/**
	 * This constant corresponds to db column <tt>relation_type</tt>.<br>
     */
	 public static final String COLUMN_RELATION_TYPE = "relation_type";
	/**
	 * This constant corresponds to db column <tt>from_type</tt>.<br>
     */
	 public static final String COLUMN_FROM_TYPE = "from_type";
	/**
	 * This constant corresponds to db column <tt>status</tt>.<br>
     */
	 public static final String COLUMN_STATUS = "status";
	/**
	 * This constant corresponds to db column <tt>gmt_create</tt>.<br>
     */
	 public static final String COLUMN_GMT_CREATE = "gmt_create";
	/**
	 * This constant corresponds to db column <tt>creator</tt>.<br>
     */
	 public static final String COLUMN_CREATOR = "creator";
	/**
	 * This constant corresponds to db column <tt>gmt_modified</tt>.<br>
     */
	 public static final String COLUMN_GMT_MODIFIED = "gmt_modified";
	/**
	 * This constant corresponds to db column <tt>modifier</tt>.<br>
     */
	 public static final String COLUMN_MODIFIER = "modifier";
	/**
	 * This constant corresponds to db column <tt>other_user_name</tt>.<br>
     */
	 public static final String COLUMN_OTHER_USER_NAME = "other_user_name";
	
	//========== properties ==========

	/**
	 * This property corresponds to db column <tt>id</tt>.<br>
     * 主键，PK
     */
	 @TableId(type = IdType.AUTO)
	private long id;
	
	/**
	 * This property corresponds to db column <tt>user_id</tt>.<br>
     * 用户ID
     */
	private String userId;
	
	/**
	 * This property corresponds to db column <tt>other_user_id</tt>.<br>
     * 另一个用户ID
     */
	private String otherUserId;
	
	/**
	 * This property corresponds to db column <tt>relation_type</tt>.<br>
     * 关系类型
     */
	private String relationType;
	
	/**
	 * This property corresponds to db column <tt>from_type</tt>.<br>
     * 来源类型
     */
	private String fromType;
	
	/**
	 * This property corresponds to db column <tt>status</tt>.<br>
     * 状态
     */
	private String status;
	
	/**
	 * This property corresponds to db column <tt>gmt_create</tt>.<br>
     * 创建时间
     */
	private Date gmtCreate;
	
	/**
	 * This property corresponds to db column <tt>creator</tt>.<br>
     * 创建人
     */
	private String creator;
	
	/**
	 * This property corresponds to db column <tt>gmt_modified</tt>.<br>
     * 修改时间
     */
	private Date gmtModified;
	
	/**
	 * This property corresponds to db column <tt>modifier</tt>.<br>
     * 修改人
     */
	private String modifier;
	
	/**
	 * This property corresponds to db column <tt>other_user_name</tt>.<br>
     * 另一用户名
     */
	private String otherUserName;
	

    //========== getters and setters ==========

}