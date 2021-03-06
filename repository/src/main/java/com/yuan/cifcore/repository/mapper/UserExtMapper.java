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
import com.yuan.cifcore.repository.entity.UserExtDO;
import org.springframework.dao.DataAccessException;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//do imports
import java.util.Date;

/**
 * A dao interface provides methods to access database table <tt>cif_user_ext</tt>.
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_user_ext.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
public interface UserExtMapper  extends BaseMapper<UserExtDO>{
	/**
	 *  Query DB table <tt>cif_user_ext</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select user_id, protect_password_issue, protect_password_key, gmt_modified, gmt_create from cif_user_ext where (user_id = ?)</tt>
	 *
	 *	@param userId 
	 *	@return UserExtDO
	 *	@throws DataAccessException
	 */	 

		public UserExtDO selectByUserId(@Param("userId")String userId) throws DataAccessException;

	/**
	 *  Update DB table <tt>cif_user_ext</tt>.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>update cif_user_ext set protect_password_issue=?, protect_password_key=?, gmt_modified=@db@.sysdate where (user_id = ?)</tt>
	 *
	 *	@param protectPasswordIssue 
	 *	@param protectPasswordKey 
	 *	@param userId 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int updateProtectePasswordInfo(@Param("protectPasswordIssue")String protectPasswordIssue , @Param("protectPasswordKey")String protectPasswordKey , @Param("userId")String userId) throws DataAccessException;

}