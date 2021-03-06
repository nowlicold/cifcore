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
import com.yuan.cifcore.repository.entity.RegistrableCellDO;
import org.springframework.dao.DataAccessException;
import java.util.Date;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//do imports

/**
 * A dao interface provides methods to access database table <tt>cif_registrable_cell</tt>.
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_registrable_cell.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
public interface RegistrableCellMapper  extends BaseMapper<RegistrableCellDO>{
	/**
	 *  Query DB table <tt>cif_registrable_cell</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from cif_registrable_cell where ((cell = ?) AND (enabled = 1))</tt>
	 *
	 *	@param cell 
	 *	@return long
	 *	@throws DataAccessException
	 */	 

		public long selectEnabledCountByCell(@Param("cell")String cell) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_registrable_cell</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from cif_registrable_cell where (cell = ?)</tt>
	 *
	 *	@param cell 
	 *	@return long
	 *	@throws DataAccessException
	 */	 

		public long selectCountByCell(@Param("cell")String cell) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_registrable_cell</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select count(cell) from cif_registrable_cell where ((enabled = 1) AND (user_id = ?) AND (register_from_type = ?))</tt>
	 *
	 *	@param userId 
	 *	@param registerFromType 
	 *	@return long
	 *	@throws DataAccessException
	 */	 

		public long selectEnabledByUserIdAndFromType(@Param("userId")String userId , @Param("registerFromType")String registerFromType) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_registrable_cell</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, cell, enabled, gmt_create, gmt_modified, gmt_apply, memo, user_id, register_from_type from cif_registrable_cell where (cell = ?)</tt>
	 *
	 *	@param cell 
	 *	@return RegistrableCellDO
	 *	@throws DataAccessException
	 */	 

		public RegistrableCellDO selectByCell(@Param("cell")String cell) throws DataAccessException;

	/**
	 *  Update DB table <tt>cif_registrable_cell</tt>.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>update cif_registrable_cell set enabled=?, gmt_apply=?, memo=?, gmt_modified=@db@.sysdate where (cell = ?)</tt>
	 *
	 *	@param enabled 
	 *	@param gmtApply 
	 *	@param memo 
	 *	@param cell 
	 *	@return int
	 *	@throws DataAccessException
	 */	 

		public int updateEnabled(@Param("enabled")boolean enabled , @Param("gmtApply")Date gmtApply , @Param("memo")String memo , @Param("cell")String cell) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_registrable_cell</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, cell, enabled, gmt_create, gmt_modified, gmt_apply, memo, user_id, register_from_type from cif_registrable_cell where (1 = 0)</tt>
	 *
	 *	@param cell 
	 *	@param enabled 
	 *	@param gmtCreateStart 
	 *	@param gmtCreateEnd 
	 *	@param gmtModifiedStart 
	 *	@param gmtModifiedEnd 
	 *	@param gmtApplyStart 
	 *	@param gmtApplyEnd 
	 *	@param userId 
	 *	@param registerFromType 
	 *	@param page 
	 *	@return List<RegistrableCellDO>
	 *	@throws DataAccessException
	 */	 

		public List<RegistrableCellDO> search(@Param("cell")String cell , @Param("enabled")Boolean enabled , @Param("gmtCreateStart")Date gmtCreateStart , @Param("gmtCreateEnd")Date gmtCreateEnd , @Param("gmtModifiedStart")Date gmtModifiedStart , @Param("gmtModifiedEnd")Date gmtModifiedEnd , @Param("gmtApplyStart")Date gmtApplyStart , @Param("gmtApplyEnd")Date gmtApplyEnd , @Param("userId")String userId , @Param("registerFromType")String registerFromType , @Param("page")Page<RegistrableCellDO> page) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_registrable_cell</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select count(cell) from cif_registrable_cell where (1 = 0)</tt>
	 *
	 *	@param cell 
	 *	@param registerFromType 
	 *	@return long
	 *	@throws DataAccessException
	 */	 

		public long selectEnabledByCellAndFromType(@Param("cell")String cell , @Param("registerFromType")String registerFromType) throws DataAccessException;

}