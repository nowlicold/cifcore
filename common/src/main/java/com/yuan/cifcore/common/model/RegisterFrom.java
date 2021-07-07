/**
 * 
 */
package com.yuan.cifcore.common.model;

import com.bench.common.model.BaseModel;

import java.util.Map;

/**
 * 注册来源
 * 
 * @author chenbug 2009-10-15 下午12:10:55
 * 
 */
public class RegisterFrom extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8903868172036384329L;

	/**
	 * 注册来源的会员ID
	 */
	private String fromUserId;

	/**
	 * 注册来源代码类型
	 */
	private String fromTypeCode;

	/**
	 * 注册来源属性集合
	 */
	private Map<String, String> properties;
	
	/**
	 * 是否验证注册来源，主要是内部创建不需要验证
	 */
	private boolean validate=true;

	public String getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	public String getFromTypeCode() {
		return fromTypeCode;
	}

	public void setFromTypeCode(String fromTypeCode) {
		this.fromTypeCode = fromTypeCode;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	public boolean isValidate() {
		return validate;
	}

	public void setValidate(boolean validate) {
		this.validate = validate;
	}

}
