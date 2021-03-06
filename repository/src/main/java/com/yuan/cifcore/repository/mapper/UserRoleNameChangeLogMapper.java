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
import com.yuan.cifcore.repository.entity.UserRoleNameChangeLogDO;
import org.springframework.dao.DataAccessException;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//do imports
import java.util.Date;

/**
 * A dao interface provides methods to access database table <tt>cif_user_role_name_change_log</tt>.
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_user_role_name_change_log.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
public interface UserRoleNameChangeLogMapper  extends BaseMapper<UserRoleNameChangeLogDO>{
	/**
	 *  Query DB table <tt>cif_user_role_name_change_log</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, role_id, role_name_before_change, role_name_after_change, operator, memo, gmt_create from cif_user_role_name_change_log where (id = ?)</tt>
	 *
	 *	@param id 
	 *	@return UserRoleNameChangeLogDO
	 *	@throws DataAccessException
	 */	 

		public UserRoleNameChangeLogDO selectById(@Param("id")long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_role_name_change_log</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, role_id, role_name_before_change, role_name_after_change, operator, memo, gmt_create from cif_user_role_name_change_log where (1 = 0)</tt>
	 *
	 *	@param id 
	 *	@param userId 
	 *	@param roleId 
	 *	@param roleName 
	 *	@param page 
	 *	@return List<UserRoleNameChangeLogDO>
	 *	@throws DataAccessException
	 */	 

		public List<UserRoleNameChangeLogDO> search(@Param("id")long id , @Param("userId")String userId , @Param("roleId")String roleId , @Param("roleName")String roleName , @Param("page")Page<UserRoleNameChangeLogDO> page) throws DataAccessException;

}