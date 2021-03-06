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
import com.yuan.cifcore.repository.entity.UserLoginNameDO;
import org.springframework.dao.DataAccessException;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//do imports
import java.util.Date;

/**
 * A dao interface provides methods to access database table <tt>cif_user_login_name</tt>.
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_user_login_name.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
public interface UserLoginNameMapper  extends BaseMapper<UserLoginNameDO>{
	/**
	 *  Query DB table <tt>cif_user_login_name</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, login_name, login_name_type, gmt_create, gmt_modified, gmt_last_login, change_stage from cif_user_login_name where (login_name = ?)</tt>
	 *
	 *	@param loginName 
	 *	@return UserLoginNameDO
	 *	@throws DataAccessException
	 */	 

		public UserLoginNameDO selectByLoginName(@Param("loginName")String loginName) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_login_name</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select user_id from cif_user_login_name where (login_name = ?)</tt>
	 *
	 *	@param loginName 
	 *	@return String
	 *	@throws DataAccessException
	 */	 

		public String selectUserIdbyLoginName(@Param("loginName")String loginName) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_login_name</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from cif_user_login_name where (login_name = ?)</tt>
	 *
	 *	@param loginName 
	 *	@return long
	 *	@throws DataAccessException
	 */	 

		public long selectCountByLoginName(@Param("loginName")String loginName) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>cif_user_login_name</tt>.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from cif_user_login_name where ((user_id = ?) AND (login_name = ?))</tt>
	 *
	 *	@param userId 
	 *	@param loginName 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int deleteByUserIdAndLoginName(@Param("userId")String userId , @Param("loginName")String loginName) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_login_name</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, login_name, login_name_type, gmt_create, gmt_modified, gmt_last_login, change_stage from cif_user_login_name where (user_id = ?)</tt>
	 *
	 *	@param userId 
	 *	@return List<UserLoginNameDO>
	 *	@throws DataAccessException
	 */	 

		public List<UserLoginNameDO> selectByUserId(@Param("userId")String userId) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_login_name</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select login_name from cif_user_login_name where (1 = 0)</tt>
	 *
	 *	@param loginNames 
	 *	@return List<String>
	 *	@throws DataAccessException
	 */	 

		public List<String> selectLoginNamesByLoginNames(@Param("loginNames")List<?> loginNames) throws DataAccessException;

	/**
	 *  Update DB table <tt>cif_user_login_name</tt>.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>update cif_user_login_name set gmt_modified=@db@.sysdate where (1 = 0)</tt>
	 *
	 *	@param newLoginName 
	 *	@param userId 
	 *	@param oldLoginName 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int updateNewLoginNameByUserIdAndOldLoginName(@Param("newLoginName")String newLoginName , @Param("userId")String userId , @Param("oldLoginName")String oldLoginName) throws DataAccessException;

	/**
	 *  Update DB table <tt>cif_user_login_name</tt>.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>update cif_user_login_name set login_name=?, gmt_modified=@db@.sysdate where ((user_id = ?) AND (login_name_type = ?))</tt>
	 *
	 *	@param loginName 
	 *	@param userId 
	 *	@param loginNameType 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int updateLoginNameByUserIdAndLoginNameType(@Param("loginName")String loginName , @Param("userId")String userId , @Param("loginNameType")String loginNameType) throws DataAccessException;

}