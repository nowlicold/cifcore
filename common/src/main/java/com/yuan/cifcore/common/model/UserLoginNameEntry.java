package com.yuan.cifcore.common.model;

import com.bench.common.model.BaseModel;
import com.yuan.cifcore.common.model.enums.LoginNameTypeEnum;

/**
 * 
 * 登录名条目
 * 
 * @author chenbug
 *
 * @version $Id: UserLoginNameEntry.java, v 0.1 2015年6月4日 上午10:44:45 chenbug Exp
 *          $
 */
public class UserLoginNameEntry extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2091769258829552133L;

	/**
	 * 登陆名
	 */
	private String loginName;

	/**
	 * 登录名类型
	 */
	private LoginNameTypeEnum loginNameType = LoginNameTypeEnum.COMMON;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public LoginNameTypeEnum getLoginNameType() {
		return loginNameType;
	}

	public void setLoginNameType(LoginNameTypeEnum loginNameType) {
		this.loginNameType = loginNameType;
	}

}
