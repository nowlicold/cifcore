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
import com.yuan.cifcore.repository.entity.UserAccountPwdVerifyDO;
import org.springframework.dao.DataAccessException;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//do imports
import java.util.Date;

/**
 * A dao interface provides methods to access database table <tt>cif_user_account_pwd_verify</tt>.
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_user_account_pwd_verify.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
public interface UserAccountPwdVerifyMapper  extends BaseMapper<UserAccountPwdVerifyDO>{
	/**
	 *  Query DB table <tt>cif_user_account_pwd_verify</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select user_id, gmt_failed, retry_count, gmt_success, gmt_create, gmt_modified from cif_user_account_pwd_verify where (user_id = ?)</tt>
	 *
	 *	@param userId 
	 *	@return UserAccountPwdVerifyDO
	 *	@throws DataAccessException
	 */	 

		public UserAccountPwdVerifyDO selectByUserId(@Param("userId")String userId) throws DataAccessException;

	/**
	 *  Update DB table <tt>cif_user_account_pwd_verify</tt>.
	 *
	 *  <p>
	 *  账户密码验证成功后,更新信息<br>
 
	 *  The sql statement for this operation is <br>
	 *  <tt>update cif_user_account_pwd_verify set gmt_modified=@db@.sysdate, retry_count=0, gmt_success=@db@.sysdate where (user_id = ?)</tt>
	 *
	 *	@param userId 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int updateVerifySuccess(@Param("userId")String userId) throws DataAccessException;

	/**
	 *  Update DB table <tt>cif_user_account_pwd_verify</tt>.
	 *
	 *  <p>
	 *  账户密码验证失败后,更新信息<br>
 
	 *  The sql statement for this operation is <br>
	 *  <tt>update cif_user_account_pwd_verify set gmt_modified=@db@.sysdate, retry_count=(retry_count + 1), gmt_failed=@db@.sysdate where (user_id = ?)</tt>
	 *
	 *	@param userId 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int updateVerifyFail(@Param("userId")String userId) throws DataAccessException;

	/**
	 *  Update DB table <tt>cif_user_account_pwd_verify</tt>.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>update cif_user_account_pwd_verify set retry_count=0, gmt_modified=@db@.sysdate where (user_id = ?)</tt>
	 *
	 *	@param userId 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int updateResetVerify(@Param("userId")String userId) throws DataAccessException;

}