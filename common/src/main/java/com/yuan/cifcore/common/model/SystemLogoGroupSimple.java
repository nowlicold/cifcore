/**
 * 
 */
package com.yuan.cifcore.common.model;

import com.bench.common.model.BaseModel;

/**
 * 
 * @author Left
 *
 * @version $Id: SystemLogoGroupSimple.java, v 0.1 2016年1月18日 下午6:59:39
 *          Administrator Exp $
 */
public class SystemLogoGroupSimple extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 870950589490725070L;

	/**
	 * 主键,id
	 */
	private long id;

	/**
	 * 分组名
	 */
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
