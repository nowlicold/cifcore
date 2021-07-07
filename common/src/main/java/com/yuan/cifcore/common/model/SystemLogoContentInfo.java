/**
 * 
 */
package com.yuan.cifcore.common.model;

import com.bench.common.model.BaseModel;

/**
 * 系统头像内容信息
 * 
 * @author Left
 *
 * @version $Id: SystemLogoSimple.java, v 0.1 2016年1月19日 上午11:02:51
 *          Administrator Exp $
 */
public class SystemLogoContentInfo extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1436118442893094437L;

	/**
	 * 主键id
	 */
	private SystemLogo systemLogo;

	/**
	 * 头像内容
	 */
	private byte[] content;

	public SystemLogo getSystemLogo() {
		return systemLogo;
	}

	public void setSystemLogo(SystemLogo systemLogo) {
		this.systemLogo = systemLogo;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

}
