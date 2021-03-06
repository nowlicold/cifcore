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
import com.yuan.cifcore.repository.entity.RegisterFromConfigDO;
import org.springframework.dao.DataAccessException;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//do imports
import java.util.Date;

/**
 * A dao interface provides methods to access database table <tt>cif_register_from_config</tt>.
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_register_from_config.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
public interface RegisterFromConfigMapper  extends BaseMapper<RegisterFromConfigDO>{
	/**
	 *  Query DB table <tt>cif_register_from_config</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, from_user_id, from_type_code, special_properties, gmt_create, gmt_modified, creater, modifier, FROM_CODE, from_USER_HAS_WEBSITE, enabled, default_from from cif_register_from_config where (id = ?)</tt>
	 *
	 *	@param id 
	 *	@return RegisterFromConfigDO
	 *	@throws DataAccessException
	 */	 

		public RegisterFromConfigDO selectById(@Param("id")long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_register_from_config</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, from_user_id, from_type_code, special_properties, gmt_create, gmt_modified, creater, modifier, FROM_CODE, from_USER_HAS_WEBSITE, enabled, default_from from cif_register_from_config where (1 = 0)</tt>
	 *
	 *	@param fromUserId 
	 *	@param enabled 
	 *	@return List<RegisterFromConfigDO>
	 *	@throws DataAccessException
	 */	 

		public List<RegisterFromConfigDO> selectEnabledByFromUserId(@Param("fromUserId")String fromUserId , @Param("enabled")Boolean enabled) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_register_from_config</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, from_user_id, from_type_code, special_properties, gmt_create, gmt_modified, creater, modifier, FROM_CODE, from_USER_HAS_WEBSITE, enabled, default_from from cif_register_from_config where ((from_user_id = ?) AND (default_from = 1) AND (enabled = 1))</tt>
	 *
	 *	@param fromUserId 
	 *	@return RegisterFromConfigDO
	 *	@throws DataAccessException
	 */	 

		public RegisterFromConfigDO selectDefaultByFromUserId(@Param("fromUserId")String fromUserId) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_register_from_config</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, from_user_id, from_type_code, special_properties, gmt_create, gmt_modified, creater, modifier, FROM_CODE, from_USER_HAS_WEBSITE, enabled, default_from from cif_register_from_config where (1 = 0)</tt>
	 *
	 *	@param loginName 
	 *	@return RegisterFromConfigDO
	 *	@throws DataAccessException
	 */	 

		public RegisterFromConfigDO selectDefaultByFromUserLoginName(@Param("loginName")String loginName) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_register_from_config</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, from_user_id, from_type_code, special_properties, gmt_create, gmt_modified, creater, modifier, FROM_CODE, from_USER_HAS_WEBSITE, enabled, default_from from cif_register_from_config where (1 = 0)</tt>
	 *
	 *	@param domainNames 
	 *	@param enabled 
	 *	@return List<RegisterFromConfigDO>
	 *	@throws DataAccessException
	 */	 

		public List<RegisterFromConfigDO> selectEnabledByDomainNames(@Param("domainNames")List<?> domainNames , @Param("enabled")Boolean enabled) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_register_from_config</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, from_user_id, from_type_code, special_properties, gmt_create, gmt_modified, creater, modifier, FROM_CODE, from_USER_HAS_WEBSITE, enabled, default_from from cif_register_from_config where (1 = 0)</tt>
	 *
	 *	@param fromCode 
	 *	@param enabled 
	 *	@return RegisterFromConfigDO
	 *	@throws DataAccessException
	 */	 

		public RegisterFromConfigDO selectEnabledByFromCode(@Param("fromCode")String fromCode , @Param("enabled")Boolean enabled) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_register_from_config</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, from_user_id, from_type_code, special_properties, gmt_create, gmt_modified, creater, modifier, FROM_CODE, from_USER_HAS_WEBSITE, enabled, default_from from cif_register_from_config where (1 = 0)</tt>
	 *
	 *	@param fromUserId 
	 *	@param fromTypeCode 
	 *	@param enabled 
	 *	@return RegisterFromConfigDO
	 *	@throws DataAccessException
	 */	 

		public RegisterFromConfigDO selectEnabledByFromUserIdAndFromTypeCode(@Param("fromUserId")String fromUserId , @Param("fromTypeCode")String fromTypeCode , @Param("enabled")Boolean enabled) throws DataAccessException;

}