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
import com.yuan.cifcore.repository.entity.RegisterFromCfgDomainDO;
import org.springframework.dao.DataAccessException;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//do imports
import java.util.Date;

/**
 * A dao interface provides methods to access database table <tt>cif_register_from_cfg_domain</tt>.
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/cif_register_from_cfg_domain.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author cold
 */
public interface RegisterFromCfgDomainMapper  extends BaseMapper<RegisterFromCfgDomainDO>{
	/**
	 *  Query DB table <tt>cif_register_from_cfg_domain</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, register_from_config_id, domain_name, enabled, gmt_create, gmt_modified from cif_register_from_cfg_domain where (id = ?)</tt>
	 *
	 *	@param id 
	 *	@return RegisterFromCfgDomainDO
	 *	@throws DataAccessException
	 */	 

		public RegisterFromCfgDomainDO selectById(@Param("id")long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_register_from_cfg_domain</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, register_from_config_id, domain_name, enabled, gmt_create, gmt_modified from cif_register_from_cfg_domain where (1 = 0)</tt>
	 *
	 *	@param domainNames 
	 *	@param enabled 
	 *	@return List<RegisterFromCfgDomainDO>
	 *	@throws DataAccessException
	 */	 

		public List<RegisterFromCfgDomainDO> selectByDomainNames(@Param("domainNames")List<?> domainNames , @Param("enabled")Boolean enabled) throws DataAccessException;

	/**
	 *  Query DB table <tt>cif_register_from_cfg_domain</tt> for records.
	 *
	 *  <p>
	 *   
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, register_from_config_id, domain_name, enabled, gmt_create, gmt_modified from cif_register_from_cfg_domain where (register_from_config_id = ?)</tt>
	 *
	 *	@param registerFromConfigId 
	 *	@return RegisterFromCfgDomainDO
	 *	@throws DataAccessException
	 */	 

		public RegisterFromCfgDomainDO selectByRegisterFromConfigId(@Param("registerFromConfigId")long registerFromConfigId) throws DataAccessException;

}