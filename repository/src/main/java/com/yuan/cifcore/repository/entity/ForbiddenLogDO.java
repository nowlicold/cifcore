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
 * A data object class directly models database table <tt>cif_forbidden_log</tt>.<br>
 * 禁止日志表
 * 
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_forbidden_log.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ForbiddenLogDO对象", description="禁止日志表")
@TableName("cif_forbidden_log")
public class ForbiddenLogDO implements Serializable  {
    private static final long serialVersionUID = 741231858441822688L;

	public static final String TABLE_NAME = "CIF_FORBIDDEN_LOG";
	//===========column onstants=====
	/**
	 * This constant corresponds to db column <tt>id</tt>.<br>
     */
	 public static final String COLUMN_ID = "id";
	/**
	 * This constant corresponds to db column <tt>forbidden_id</tt>.<br>
     */
	 public static final String COLUMN_FORBIDDEN_ID = "forbidden_id";
	/**
	 * This constant corresponds to db column <tt>action</tt>.<br>
     */
	 public static final String COLUMN_ACTION = "action";
	/**
	 * This constant corresponds to db column <tt>content</tt>.<br>
     */
	 public static final String COLUMN_CONTENT = "content";
	/**
	 * This constant corresponds to db column <tt>gmt_create</tt>.<br>
     */
	 public static final String COLUMN_GMT_CREATE = "gmt_create";
	/**
	 * This constant corresponds to db column <tt>operator_id</tt>.<br>
     */
	 public static final String COLUMN_OPERATOR_ID = "operator_id";
	/**
	 * This constant corresponds to db column <tt>operator_type</tt>.<br>
     */
	 public static final String COLUMN_OPERATOR_TYPE = "operator_type";
	
	//========== properties ==========

	/**
	 * This property corresponds to db column <tt>id</tt>.<br>
     * 主键，PK
     */
	 @TableId(type = IdType.NONE)
	private long id;
	
	/**
	 * This property corresponds to db column <tt>forbidden_id</tt>.<br>
     * 禁止ID
     */
	private String forbiddenId;
	
	/**
	 * This property corresponds to db column <tt>action</tt>.<br>
     * 操作类型
     */
	private String action;
	
	/**
	 * This property corresponds to db column <tt>content</tt>.<br>
     * 操作内容
     */
	private String content;
	
	/**
	 * This property corresponds to db column <tt>gmt_create</tt>.<br>
     * 创建时间
     */
	private Date gmtCreate;
	
	/**
	 * This property corresponds to db column <tt>operator_id</tt>.<br>
     * 操作人ID
     */
	private String operatorId;
	
	/**
	 * This property corresponds to db column <tt>operator_type</tt>.<br>
     * 操作人类型
     */
	private String operatorType;
	

    //========== getters and setters ==========

}
