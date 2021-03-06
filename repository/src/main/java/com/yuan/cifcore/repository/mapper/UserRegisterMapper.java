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
import com.yuan.cifcore.repository.entity.UserRegisterDO;
import org.springframework.dao.DataAccessException;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//do imports
import java.util.Date;

/**
 * A dao interface provides methods to access database table <tt>cif_user_register</tt>.
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_user_register.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
public interface UserRegisterMapper  extends BaseMapper<UserRegisterDO>{
	/**
	 *  Query DB table <tt>cif_user_register</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select user_id, register_ip, from_user_id, from_type_code, device_type, device_info, platform_type, gmt_create, gmt_modified, from_properties from cif_user_register where (user_id = ?)</tt>
	 *
	 *	@param userId 
	 *	@return UserRegisterDO
	 *	@throws DataAccessException
	 */	 

		public UserRegisterDO selectByUserId(@Param("userId")String userId) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_register</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select register_ip from cif_user_register where (user_id = ?)</tt>
	 *
	 *	@param userId 
	 *	@return String
	 *	@throws DataAccessException
	 */	 

		public String selectRegisterIpByUserId(@Param("userId")String userId) throws DataAccessException;

	/**
	 *  Update DB table <tt>cif_user_register</tt>.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>update cif_user_register set gmt_modified=@db@.sysdate, register_ip=? where (user_id = ?)</tt>
	 *
	 *	@param registerIp 
	 *	@param userId 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int updateRegisterIpByUserId(@Param("registerIp")String registerIp , @Param("userId")String userId) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_register</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select user_id, register_from_user_id, register_from_type_code from cif_user where (0 = 1)</tt>
	 *
	 *	@param userIds 
	 *	@param registerFromTypeCodes 
	 *	@return List<Map<String,Object>>
	 *	@throws DataAccessException
	 */	 

		public List<Map<String,Object>> selectRegisterFromInfoByUserIdsAndRegisterFromTypeCodes(@Param("userIds")List<?> userIds , @Param("registerFromTypeCodes")List<?> registerFromTypeCodes) throws DataAccessException;

}