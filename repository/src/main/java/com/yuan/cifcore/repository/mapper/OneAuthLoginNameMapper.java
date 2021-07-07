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
import com.yuan.cifcore.repository.entity.OneAuthLoginNameDO;
import org.springframework.dao.DataAccessException;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//do imports
import java.util.Date;

/**
 * A dao interface provides methods to access database table <tt>cif_one_auth_login_name</tt>.
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_one_auth_login_name.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
public interface OneAuthLoginNameMapper  extends BaseMapper<OneAuthLoginNameDO>{
	/**
	 *  Query DB table <tt>cif_one_auth_login_name</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, one_auth_id, login_name, login_name_type, gmt_create, gmt_modified from cif_one_auth_login_name where (id = ?)</tt>
	 *
	 *	@param id 
	 *	@return OneAuthLoginNameDO
	 *	@throws DataAccessException
	 */	 

		public OneAuthLoginNameDO selectById(@Param("id")long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_one_auth_login_name</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, one_auth_id, login_name, login_name_type, gmt_create, gmt_modified from cif_one_auth_login_name where (id = ?) for update</tt>
	 *
	 *	@param id 
	 *	@return OneAuthLoginNameDO
	 *	@throws DataAccessException
	 */	 

		public OneAuthLoginNameDO selectByIdForUpdate(@Param("id")long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_one_auth_login_name</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, one_auth_id, login_name, login_name_type, gmt_create, gmt_modified from cif_one_auth_login_name where (login_name = ?)</tt>
	 *
	 *	@param loginName 
	 *	@return OneAuthLoginNameDO
	 *	@throws DataAccessException
	 */	 

		public OneAuthLoginNameDO selectByLoginName(@Param("loginName")String loginName) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_one_auth_login_name</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, one_auth_id, login_name, login_name_type, gmt_create, gmt_modified from cif_one_auth_login_name where ((login_name = ?) AND (login_name_type = ?)) for update</tt>
	 *
	 *	@param loginName 
	 *	@param loginNameType 
	 *	@return OneAuthLoginNameDO
	 *	@throws DataAccessException
	 */	 

		public OneAuthLoginNameDO selectByLoginNameAndLoginNameTypeForUpdate(@Param("loginName")String loginName , @Param("loginNameType")String loginNameType) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_one_auth_login_name</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select one_auth_id from cif_one_auth_login_name where (login_name = ?)</tt>
	 *
	 *	@param loginName 
	 *	@return String
	 *	@throws DataAccessException
	 */	 

		public String selectOneAuthIdByLoginName(@Param("loginName")String loginName) throws DataAccessException;

	/**
	 *  Update DB table <tt>cif_one_auth_login_name</tt>.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>update cif_one_auth_login_name set login_name=?, gmt_modified=@db@.sysdate where (id = ?)</tt>
	 *
	 *	@param loginName 
	 *	@param id 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int updateLoginNameById(@Param("loginName")String loginName , @Param("id")long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_one_auth_login_name</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, one_auth_id, login_name, login_name_type, gmt_create, gmt_modified from cif_one_auth_login_name where (one_auth_id = ?)</tt>
	 *
	 *	@param oneAuthId 
	 *	@return List<OneAuthLoginNameDO>
	 *	@throws DataAccessException
	 */	 

		public List<OneAuthLoginNameDO> selectByOneAuthId(@Param("oneAuthId")String oneAuthId) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_one_auth_login_name</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select login_name from cif_one_auth_login_name where (1 = 0)</tt>
	 *
	 *	@param loginNames 
	 *	@return List<String>
	 *	@throws DataAccessException
	 */	 

		public List<String> selectLoginNamesByLoginNames(@Param("loginNames")List<?> loginNames) throws DataAccessException;

}