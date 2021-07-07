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
import com.yuan.cifcore.repository.entity.UserLevelDO;
import org.springframework.dao.DataAccessException;
import java.util.Date;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//do imports

/**
 * A dao interface provides methods to access database table <tt>cif_user_level</tt>.
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_user_level.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
public interface UserLevelMapper  extends BaseMapper<UserLevelDO>{
	/**
	 *  Query DB table <tt>cif_user_level</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, level_name, level_value, gmt_modified, gmt_create, modifier, creater from cif_user_level where (id = ?)</tt>
	 *
	 *	@param id 
	 *	@return UserLevelDO
	 *	@throws DataAccessException
	 */	 

		public UserLevelDO selectById(@Param("id")long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_level</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, level_name, level_value, gmt_modified, gmt_create, modifier, creater from cif_user_level where (1 = 0)</tt>
	 *
	 *	@param loginName 
	 *	@param userId 
	 *	@param levelName 
	 *	@param levelValue 
	 *	@param beginCreateDate 
	 *	@param endCreateDate 
	 *	@param page 
	 *	@return List<UserLevelDO>
	 *	@throws DataAccessException
	 */	 

		public List<UserLevelDO> search(@Param("loginName")String loginName , @Param("userId")String userId , @Param("levelName")String levelName , @Param("levelValue")String levelValue , @Param("beginCreateDate")Date beginCreateDate , @Param("endCreateDate")Date endCreateDate , @Param("page")Page<UserLevelDO> page) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_level</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, level_name, level_value, gmt_modified, gmt_create, modifier, creater from cif_user_level where ((user_id = ?) AND (level_name = ?))</tt>
	 *
	 *	@param userId 
	 *	@param levelName 
	 *	@return UserLevelDO
	 *	@throws DataAccessException
	 */	 

		public UserLevelDO selectByUserIdAndLevelName(@Param("userId")String userId , @Param("levelName")String levelName) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_user_level</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select level_value from cif_user_level where ((user_id = ?) AND (level_name = ?))</tt>
	 *
	 *	@param userId 
	 *	@param levelName 
	 *	@return String
	 *	@throws DataAccessException
	 */	 

		public String selectLevelValueByUserIdAndLevelName(@Param("userId")String userId , @Param("levelName")String levelName) throws DataAccessException;

	/**
	 *  Update DB table <tt>cif_user_level</tt>.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>update cif_user_level set level_value=?, gmt_modified=@db@.sysdate, modifier=? where ((user_id = ?) AND (level_name = ?))</tt>
	 *
	 *	@param levelValue 
	 *	@param modifier 
	 *	@param userId 
	 *	@param levelName 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int updateLevelValueByUserIdAndLevelName(@Param("levelValue")String levelValue , @Param("modifier")String modifier , @Param("userId")String userId , @Param("levelName")String levelName) throws DataAccessException;

}