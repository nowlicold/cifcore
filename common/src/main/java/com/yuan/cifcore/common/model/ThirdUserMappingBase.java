package com.yuan.cifcore.common.model;

import java.util.Map;

/**
 * 第三方用户信息映射基本信息
 * 
 * @author chenbug
 * 
 * @version $Id: ThirdUserMappingBase.java, v 0.1 2013-1-26 下午7:41:04 chenbug
 *          Exp $
 */
public interface ThirdUserMappingBase {

	public String getThirdUserId();

	public String getThirdChannel();

	public String getThirdLoginName();

	public String getThirdUserName();

	public Map<String, String> getProperties();

}
