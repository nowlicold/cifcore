package com.yuan.cifcore.common.model;

import com.bench.common.model.BaseModel;

/**
 * 会员域简单信息
 * 
 * @author chenbug
 *
 * @version $Id: UserDomainSimple.java, v 0.1 2016年2月18日 下午2:49:34 chenbug Exp $
 */
public class UserDomainSimpleInfo extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6658291142040379789L;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 子名称
	 */
	private String subName;

	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Returns the subName.
	 */
	public String getSubName() {
		return subName;
	}

	/**
	 * @param subName
	 *            The subName to set.
	 */
	public void setSubName(String subName) {
		this.subName = subName;
	}

}
