/*
 * Bench Inc.
 * Copyright (c) 2004 All Rights Reserved.
 */
package com.yuan.cifcore.repository.mapper;



// auto generated imports
//dao imports
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.yuan.cifcore.repository.entity.OneAuthLoginProcessDO;
import org.springframework.dao.DataAccessException;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//do imports
import java.util.Date;

/**
 * A dao interface provides methods to access database table <tt>cif_one_auth_login_process</tt>.
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_one_auth_login_process.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
public interface OneAuthLoginProcessMapper  extends BaseMapper<OneAuthLoginProcessDO>{
	/**
	 *  Query DB table <tt>cif_one_auth_login_process</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select one_auth_id, gmt_success, gmt_fail, logged_platform_type, logged_login_ip, gmt_create, gmt_modified, logged_device_type, logged_device_info, retry_password_count from cif_one_auth_login_process where (one_auth_id = ?)</tt>
	 *
	 *	@param oneAuthId 
	 *	@return OneAuthLoginProcessDO
	 *	@throws DataAccessException
	 */	 

		public OneAuthLoginProcessDO selectByOneAuthId(@Param("oneAuthId")String oneAuthId) throws DataAccessException;

	/**
	 *  Update DB table <tt>cif_one_auth_login_process</tt>.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>update cif_one_auth_login_process set gmt_success=@db@.sysdate, gmt_modified=@db@.sysdate, logged_login_ip=?, logged_platform_type=?, logged_device_type=?, logged_device_info=?, retry_password_count=0 where (one_auth_id = ?)</tt>
	 *
	 *	@param loggedLoginIp 
	 *	@param loggedPlatformType 
	 *	@param loggedDeviceType 
	 *	@param loggedDeviceInfo 
	 *	@param oneAuthId 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int updateLoginSuccess(@Param("loggedLoginIp")String loggedLoginIp , @Param("loggedPlatformType")String loggedPlatformType , @Param("loggedDeviceType")String loggedDeviceType , @Param("loggedDeviceInfo")String loggedDeviceInfo , @Param("oneAuthId")String oneAuthId) throws DataAccessException;

	/**
	 *  Update DB table <tt>cif_one_auth_login_process</tt>.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>update cif_one_auth_login_process set gmt_modified=@db@.sysdate, gmt_fail=@db@.sysdate, retry_password_count=(retry_password_count + 1) where (one_auth_id = ?)</tt>
	 *
	 *	@param oneAuthId 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int updateLoginFailed(@Param("oneAuthId")String oneAuthId) throws DataAccessException;

	/**
	 *  Update DB table <tt>cif_one_auth_login_process</tt>.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>update cif_one_auth_login_process set gmt_modified=@db@.sysdate, retry_password_count=0 where (one_auth_id = ?)</tt>
	 *
	 *	@param oneAuthId 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int updateRetryCountReset(@Param("oneAuthId")String oneAuthId) throws DataAccessException;

}