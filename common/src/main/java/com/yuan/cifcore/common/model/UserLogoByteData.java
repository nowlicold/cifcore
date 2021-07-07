/**
 * 
 */
package com.yuan.cifcore.common.model;

import com.bench.common.model.BaseModel;

/**
 * 用户头像数据
 * @author Left
 *
 * @version $Id: UserLogoByteData.java, v 0.1 2016年1月20日 下午6:19:03 Administrator Exp $
 */
public class UserLogoByteData extends BaseModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7606134357040506378L;
	
	/**
	 * 文件名
	 */
	private String fileName;
	
	/**
	 * 二进制数据
	 */
	private byte[] data;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
	
}
