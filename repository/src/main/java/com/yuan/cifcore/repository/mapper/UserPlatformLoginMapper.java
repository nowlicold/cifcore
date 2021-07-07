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
import com.yuan.cifcore.repository.entity.UserPlatformLoginDO;
import org.springframework.dao.DataAccessException;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//do imports
import java.util.Date;

/**
 * A dao interface provides methods to access database table <tt>cif_user_platform_login</tt>.
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_user_platform_login.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
public interface UserPlatformLoginMapper  extends BaseMapper<UserPlatformLoginDO>{
	/**
	 *  Query DB table <tt>cif_user_platform_login</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, logged_login_name, logged_platform_type, gmt_success, logged_login_ip, logged_login_session_id, logged_login_key, logged_sign_key, logged_crypt_key, logged_crypt_key_type, platform_login_seq, gmt_create, gmt_modified, logged, logged_device_type, logged_device_info from cif_user_platform_login where (id = ?)</tt>
	 *
	 *	@param id 
	 *	@return UserPlatformLoginDO
	 *	@throws DataAccessException
	 */	 

		public UserPlatformLoginDO selectById(@Param("id")long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_platform_login</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, logged_login_name, logged_platform_type, gmt_success, logged_login_ip, logged_login_session_id, logged_login_key, logged_sign_key, logged_crypt_key, logged_crypt_key_type, platform_login_seq, gmt_create, gmt_modified, logged, logged_device_type, logged_device_info from cif_user_platform_login where (id = ?) for update</tt>
	 *
	 *	@param id 
	 *	@return UserPlatformLoginDO
	 *	@throws DataAccessException
	 */	 

		public UserPlatformLoginDO selectByIdForUpdate(@Param("id")long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_platform_login</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, logged_login_name, logged_platform_type, gmt_success, logged_login_ip, logged_login_session_id, logged_login_key, logged_sign_key, logged_crypt_key, logged_crypt_key_type, platform_login_seq, gmt_create, gmt_modified, logged, logged_device_type, logged_device_info from cif_user_platform_login where (logged_login_key = ?)</tt>
	 *
	 *	@param loggedLoginKey 
	 *	@return UserPlatformLoginDO
	 *	@throws DataAccessException
	 */	 

		public UserPlatformLoginDO selectByLoggedLoginKey(@Param("loggedLoginKey")String loggedLoginKey) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_platform_login</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, logged_login_name, logged_platform_type, gmt_success, logged_login_ip, logged_login_session_id, logged_login_key, logged_sign_key, logged_crypt_key, logged_crypt_key_type, platform_login_seq, gmt_create, gmt_modified, logged, logged_device_type, logged_device_info from cif_user_platform_login where ((user_id = ?) AND (logged_platform_type = ?) AND (logged = 1)) order by gmt_create DESC</tt>
	 *
	 *	@param userId 
	 *	@param loggedPlatformType 
	 *	@return List<UserPlatformLoginDO>
	 *	@throws DataAccessException
	 */	 

		public List<UserPlatformLoginDO> selectLoggedByUserIdAndPlatformType(@Param("userId")String userId , @Param("loggedPlatformType")String loggedPlatformType) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_platform_login</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select logged_login_session_id from cif_user_platform_login where ((user_id = ?) AND (logged_platform_type = ?) AND (logged = 1) AND (logged_login_session_id IS NOT NULL))</tt>
	 *
	 *	@param userId 
	 *	@param loggedPlatformType 
	 *	@return List<String>
	 *	@throws DataAccessException
	 */	 

		public List<String> selectLoggedSessionIdsByUserIdAndPlatformType(@Param("userId")String userId , @Param("loggedPlatformType")String loggedPlatformType) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_platform_login</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, logged_login_name, logged_platform_type, gmt_success, logged_login_ip, logged_login_session_id, logged_login_key, logged_sign_key, logged_crypt_key, logged_crypt_key_type, platform_login_seq, gmt_create, gmt_modified, logged, logged_device_type, logged_device_info from cif_user_platform_login where (1 = 0)</tt>
	 *
	 *	@param userIds 
	 *	@param platformType 
	 *	@return List<UserPlatformLoginDO>
	 *	@throws DataAccessException
	 */	 

		public List<UserPlatformLoginDO> selectLoggedByUserIdsAndPlatformType(@Param("userIds")List<?> userIds , @Param("platformType")String platformType) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_platform_login</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select user_id, logged_login_session_id from cif_user_platform_login where (1 = 0)</tt>
	 *
	 *	@param userIds 
	 *	@param platformType 
	 *	@return List<Map<String,Object>>
	 *	@throws DataAccessException
	 */	 

		public List<Map<String,Object>> selectUserIdAndLoggedSessionIdsByUserIdsAndPlatformType(@Param("userIds")List<?> userIds , @Param("platformType")String platformType) throws DataAccessException;

	/**
	 *  Update DB table <tt>cif_user_platform_login</tt>.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>update cif_user_platform_login set logged_login_name=?, gmt_success=@db@.sysdate, gmt_modified=@db@.sysdate, logged_login_ip=?, logged_login_session_id=?, logged_login_key=?, logged_sign_key=?, logged_crypt_key=?, logged_crypt_key_type=?, logged=1, logged_device_type=?, logged_device_info=? where (id = ?)</tt>
	 *
	 *	@param loggedLoginName 
	 *	@param loggedLoginIp 
	 *	@param loggedLoginSessionId 
	 *	@param loggedLoginKey 
	 *	@param loggedSignKey 
	 *	@param loggedCryptKey 
	 *	@param loggedCryptKeyType 
	 *	@param loggedDeviceType 
	 *	@param loggedDeviceInfo 
	 *	@param id 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int updateLoginSuccess(@Param("loggedLoginName")String loggedLoginName , @Param("loggedLoginIp")String loggedLoginIp , @Param("loggedLoginSessionId")String loggedLoginSessionId , @Param("loggedLoginKey")String loggedLoginKey , @Param("loggedSignKey")String loggedSignKey , @Param("loggedCryptKey")String loggedCryptKey , @Param("loggedCryptKeyType")String loggedCryptKeyType , @Param("loggedDeviceType")String loggedDeviceType , @Param("loggedDeviceInfo")String loggedDeviceInfo , @Param("id")long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_platform_login</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select max(platform_login_seq) from cif_user_platform_login where ((user_id = ?) AND (logged_platform_type = ?))</tt>
	 *
	 *	@param userId 
	 *	@param loggedPlatformType 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int selectMaxPlatformLoginSeqByUserIdAndPlatformType(@Param("userId")String userId , @Param("loggedPlatformType")String loggedPlatformType) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_platform_login</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id from cif_user_platform_login where ((user_id = ?) AND (logged_platform_type = ?) AND (logged = 0) AND (platform_login_seq <= ?)) order by gmt_success ASC</tt>
	 *
	 *	@param userId 
	 *	@param loggedPlatformType 
	 *	@param platformLoginSeq 
	 *	@return long
	 *	@throws DataAccessException
	 */	 

		public long selectEarliestLogoutIdByUserIdPlatformTypeAndMaxPlatformLoginSeq(@Param("userId")String userId , @Param("loggedPlatformType")String loggedPlatformType , @Param("platformLoginSeq")int platformLoginSeq) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_platform_login</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, logged_login_name, logged_platform_type, gmt_success, logged_login_ip, logged_login_session_id, logged_login_key, logged_sign_key, logged_crypt_key, logged_crypt_key_type, platform_login_seq, gmt_create, gmt_modified, logged, logged_device_type, logged_device_info from cif_user_platform_login where ((user_id = ?) AND (logged_platform_type = ?) AND (platform_login_seq <= ?)) order by gmt_success ASC</tt>
	 *
	 *	@param userId 
	 *	@param loggedPlatformType 
	 *	@param platformLoginSeq 
	 *	@return UserPlatformLoginDO
	 *	@throws DataAccessException
	 */	 

		public UserPlatformLoginDO selectEarliestLoggedIdByUserIdPlatformTypeAndMaxPlatformLoginSeq(@Param("userId")String userId , @Param("loggedPlatformType")String loggedPlatformType , @Param("platformLoginSeq")int platformLoginSeq) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_platform_login</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, logged_login_name, logged_platform_type, gmt_success, logged_login_ip, logged_login_session_id, logged_login_key, logged_sign_key, logged_crypt_key, logged_crypt_key_type, platform_login_seq, gmt_create, gmt_modified, logged, logged_device_type, logged_device_info from cif_user_platform_login where ((user_id = ?) AND (logged_platform_type = ?) AND (logged_login_session_id = ?) AND (logged = 1))</tt>
	 *
	 *	@param userId 
	 *	@param loggedPlatformType 
	 *	@param loggedLoginSessionId 
	 *	@return UserPlatformLoginDO
	 *	@throws DataAccessException
	 */	 

		public UserPlatformLoginDO selectByUserIdAndPlatformTypeAndLoginSessinId(@Param("userId")String userId , @Param("loggedPlatformType")String loggedPlatformType , @Param("loggedLoginSessionId")String loggedLoginSessionId) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_platform_login</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, logged_login_name, logged_platform_type, gmt_success, logged_login_ip, logged_login_session_id, logged_login_key, logged_sign_key, logged_crypt_key, logged_crypt_key_type, platform_login_seq, gmt_create, gmt_modified, logged, logged_device_type, logged_device_info from cif_user_platform_login where ((user_id = ?) AND (logged_platform_type = ?) AND (logged_login_key = ?) AND (logged = 1))</tt>
	 *
	 *	@param userId 
	 *	@param loggedPlatformType 
	 *	@param loggedLoginKey 
	 *	@return UserPlatformLoginDO
	 *	@throws DataAccessException
	 */	 

		public UserPlatformLoginDO selectByUserIdAndPlatformTypeAndLoginKey(@Param("userId")String userId , @Param("loggedPlatformType")String loggedPlatformType , @Param("loggedLoginKey")String loggedLoginKey) throws DataAccessException;

	/**
	 *  Update DB table <tt>cif_user_platform_login</tt>.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>update cif_user_platform_login set logged=0, gmt_modified=@db@.sysdate where (id = ?)</tt>
	 *
	 *	@param id 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int updateLogoutById(@Param("id")long id) throws DataAccessException;

	/**
	 *  Update DB table <tt>cif_user_platform_login</tt>.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>update cif_user_platform_login set logged=0, gmt_modified=@db@.sysdate where (logged_login_key = ?)</tt>
	 *
	 *	@param loggedLoginKey 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int updateLogoutByLoginKey(@Param("loggedLoginKey")String loggedLoginKey) throws DataAccessException;

	/**
	 *  Update DB table <tt>cif_user_platform_login</tt>.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>update cif_user_platform_login set logged=0, gmt_modified=@db@.sysdate where (logged_login_session_id = ?)</tt>
	 *
	 *	@param loggedLoginSessionId 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int updateLogoutByLoggedLoginSessionId(@Param("loggedLoginSessionId")String loggedLoginSessionId) throws DataAccessException;

	/**
	 *  Update DB table <tt>cif_user_platform_login</tt>.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>update cif_user_platform_login set logged=0, gmt_modified=@db@.sysdate where (1 = 0)</tt>
	 *
	 *	@param loggedLoginSessionIds 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int updateLogoutByLoggedLoginSessionIds(@Param("loggedLoginSessionIds")List<?> loggedLoginSessionIds) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_platform_login</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, logged_login_name, logged_platform_type, gmt_success, logged_login_ip, logged_login_session_id, logged_login_key, logged_sign_key, logged_crypt_key, logged_crypt_key_type, platform_login_seq, gmt_create, gmt_modified, logged, logged_device_type, logged_device_info from cif_user_platform_login where (1 = 0)</tt>
	 *
	 *	@param userIds 
	 *	@return List<UserPlatformLoginDO>
	 *	@throws DataAccessException
	 */	 

		public List<UserPlatformLoginDO> selectLoggedLoginSessionIdsByUserIds(@Param("userIds")List<?> userIds) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_platform_login</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, logged_login_name, logged_platform_type, gmt_success, logged_login_ip, logged_login_session_id, logged_login_key, logged_sign_key, logged_crypt_key, logged_crypt_key_type, platform_login_seq, gmt_create, gmt_modified, logged, logged_device_type, logged_device_info from cif_user_platform_login where ((user_id = ?) AND (logged = 1))</tt>
	 *
	 *	@param userId 
	 *	@return List<UserPlatformLoginDO>
	 *	@throws DataAccessException
	 */	 

		public List<UserPlatformLoginDO> selectLoggedByUserId(@Param("userId")String userId) throws DataAccessException;

}