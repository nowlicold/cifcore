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
 * A data object class directly models database table <tt>cif_forbidden</tt>.<br>
 * 禁止
 * 
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_forbidden.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ForbiddenDO对象", description="禁止")
@TableName("cif_forbidden")
public class ForbiddenDO implements Serializable  {
    private static final long serialVersionUID = 741231858441822688L;

	public static final String TABLE_NAME = "CIF_FORBIDDEN";
	//===========column onstants=====
	/**
	 * This constant corresponds to db column <tt>id</tt>.<br>
     */
	 public static final String COLUMN_ID = "id";
	/**
	 * This constant corresponds to db column <tt>forbidden_object_type</tt>.<br>
     */
	 public static final String COLUMN_FORBIDDEN_OBJECT_TYPE = "forbidden_object_type";
	/**
	 * This constant corresponds to db column <tt>forbidden_object_id</tt>.<br>
     */
	 public static final String COLUMN_FORBIDDEN_OBJECT_ID = "forbidden_object_id";
	/**
	 * This constant corresponds to db column <tt>forbidden_reason</tt>.<br>
     */
	 public static final String COLUMN_FORBIDDEN_REASON = "forbidden_reason";
	/**
	 * This constant corresponds to db column <tt>enabled</tt>.<br>
     */
	 public static final String COLUMN_ENABLED = "enabled";
	/**
	 * This constant corresponds to db column <tt>gmt_start</tt>.<br>
     */
	 public static final String COLUMN_GMT_START = "gmt_start";
	/**
	 * This constant corresponds to db column <tt>gmt_end</tt>.<br>
     */
	 public static final String COLUMN_GMT_END = "gmt_end";
	/**
	 * This constant corresponds to db column <tt>gmt_create</tt>.<br>
     */
	 public static final String COLUMN_GMT_CREATE = "gmt_create";
	/**
	 * This constant corresponds to db column <tt>gmt_modified</tt>.<br>
     */
	 public static final String COLUMN_GMT_MODIFIED = "gmt_modified";
	/**
	 * This constant corresponds to db column <tt>forbidden_minutes</tt>.<br>
     */
	 public static final String COLUMN_FORBIDDEN_MINUTES = "forbidden_minutes";
	/**
	 * This constant corresponds to db column <tt>memo</tt>.<br>
     */
	 public static final String COLUMN_MEMO = "memo";
	/**
	 * This constant corresponds to db column <tt>forbidden_action_type_id</tt>.<br>
     */
	 public static final String COLUMN_FORBIDDEN_ACTION_TYPE_ID = "forbidden_action_type_id";
	/**
	 * This constant corresponds to db column <tt>operator_type</tt>.<br>
     */
	 public static final String COLUMN_OPERATOR_TYPE = "operator_type";
	/**
	 * This constant corresponds to db column <tt>operator_id</tt>.<br>
     */
	 public static final String COLUMN_OPERATOR_ID = "operator_id";
	/**
	 * This constant corresponds to db column <tt>status</tt>.<br>
     */
	 public static final String COLUMN_STATUS = "status";
	/**
	 * This constant corresponds to db column <tt>biz_unique_id</tt>.<br>
     */
	 public static final String COLUMN_BIZ_UNIQUE_ID = "biz_unique_id";
	
	//========== properties ==========

	/**
	 * This property corresponds to db column <tt>id</tt>.<br>
     * 主键，PK
     */
	private String id;
	
	/**
	 * This property corresponds to db column <tt>forbidden_object_type</tt>.<br>
     * 禁止对象类型
     */
	private String forbiddenObjectType;
	
	/**
	 * This property corresponds to db column <tt>forbidden_object_id</tt>.<br>
     * 禁止对象id
     */
	private String forbiddenObjectId;
	
	/**
	 * This property corresponds to db column <tt>forbidden_reason</tt>.<br>
     * 禁止原因
     */
	private String forbiddenReason;
	
	/**
	 * This property corresponds to db column <tt>enabled</tt>.<br>
     * 是否有效
     */
	private boolean enabled;
	
	/**
	 * This property corresponds to db column <tt>gmt_start</tt>.<br>
     * 开始时间
     */
	private Date gmtStart;
	
	/**
	 * This property corresponds to db column <tt>gmt_end</tt>.<br>
     * 结束时间，如果为空代表永久禁止
     */
	private Date gmtEnd;
	
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
	 * This property corresponds to db column <tt>forbidden_minutes</tt>.<br>
     * 禁止分钟数，如果是-1代表永久禁止
     */
	private long forbiddenMinutes;
	
	/**
	 * This property corresponds to db column <tt>memo</tt>.<br>
     * 备注
     */
	private String memo;
	
	/**
	 * This property corresponds to db column <tt>forbidden_action_type_id</tt>.<br>
     * 禁止动作类型id
     */
	private long forbiddenActionTypeId;
	
	/**
	 * This property corresponds to db column <tt>operator_type</tt>.<br>
     * 操作人类型
     */
	private String operatorType;
	
	/**
	 * This property corresponds to db column <tt>operator_id</tt>.<br>
     * 操作人
     */
	private String operatorId;
	
	/**
	 * This property corresponds to db column <tt>status</tt>.<br>
     * 状态
     */
	private String status;
	
	/**
	 * This property corresponds to db column <tt>biz_unique_id</tt>.<br>
     * 业务唯一ID
     */
	 @TableId(type = IdType.NONE)
	private String bizUniqueId;
	

    //========== getters and setters ==========

}
