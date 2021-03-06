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
import com.yuan.cifcore.repository.entity.DomainConfigDO;
import org.springframework.dao.DataAccessException;
import java.util.Date;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//do imports

/**
 * A dao interface provides methods to access database table <tt>cif_domain_config</tt>.
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_domain_config.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
public interface DomainConfigMapper  extends BaseMapper<DomainConfigDO>{
	/**
	 *  Query DB table <tt>cif_domain_config</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select name, message, enabled, default_domain, gmt_create, gmt_modified from cif_domain_config</tt>
	 *
	 *	@return List<DomainConfigDO>
	 *	@throws DataAccessException
	 */	 

		public List<DomainConfigDO> selectAll() throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_domain_config</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select name, message, enabled, default_domain, gmt_create, gmt_modified from cif_domain_config where (gmt_modified > ?)</tt>
	 *
	 *	@param gmtModified 
	 *	@return List<DomainConfigDO>
	 *	@throws DataAccessException
	 */	 

		public List<DomainConfigDO> selectByMaxGmtModified(@Param("gmtModified")Date gmtModified) throws DataAccessException;

}