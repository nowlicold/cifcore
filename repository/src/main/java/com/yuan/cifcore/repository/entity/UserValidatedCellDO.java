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
 * A data object class directly models database table <tt>cif_user_validated_cell</tt>.<br>
 * 会员绑定的手机历史记录
 * 
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_user_validated_cell.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserValidatedCellDO对象", description="会员绑定的手机历史记录")
@TableName("cif_user_validated_cell")
public class UserValidatedCellDO implements Serializable  {
    private static final long serialVersionUID = 741231858441822688L;

	public static final String TABLE_NAME = "CIF_USER_VALIDATED_CELL";
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
	 * This constant corresponds to db column <tt>cell</tt>.<br>
     */
	 public static final String COLUMN_CELL = "cell";
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
     * 主键，PK
     */
	 @TableId(type = IdType.NONE)
	private long id;
	
	/**
	 * This property corresponds to db column <tt>user_id</tt>.<br>
     * 会员编号
     */
	private String userId;
	
	/**
	 * This property corresponds to db column <tt>cell</tt>.<br>
     * 手机号
     */
	private String cell;
	
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
