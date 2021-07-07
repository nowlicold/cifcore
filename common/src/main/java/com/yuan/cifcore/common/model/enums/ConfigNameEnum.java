/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 
 * @author chenbug
 * 
 * @version $Id: ConfigNameEnum.java, v 0.1 2011-9-6 上午11:58:48 chenbug Exp $
 */
public enum ConfigNameEnum implements EnumBase {

	REGISTRABLE_CELL_CONFIG("可注册手机号配置"),

	CREATE_ACCOUNT("是否创建资金账户"),

	CREATE_POINT_ACCOUNT("是否创建积分账户"),

	CREATE_PRESENT_ACCOUNT("是否创建彩金账户"),

	LOGIN_NAME_VALIDATE_REG_EXP("登录名验证正则表达式"),

	LOGIN_PASSWORD_VALIDATE_REG_EXP("登录密码验证正则表达式"),

	ACCOUNT_PASSWORD_VALIDATE_REG_EXP("支付密码验证正则表达式"),

	USER_DOMAIN_UPDATEABLE("用户域是否可更新,如果不配置，表示可更新"),

	ROLE_NAME_VALIDATE_REG_EXP("角色名验证正则表达式"),

	INNER_CHANNEL_CREATE_DEFULT_ROLE("内部渠道创建默认角色"),

	USER_ID_AND_LOGIN_NAME_CACHE_MAX_GMT_MODIFIED("会员id和登录名最大修改时间"),

	MAX_USER_QUERY_COUNT_EVERY_TIME("每次查询会员最大数量"),

	THIRD_USER_MAPPING_CONFIG("第三方会员映射配置"),

	ONE_AUTH_CONFIG("单认证配置"),
	
	PICTURE_COMPRESS_CONFIG("会员头像压缩配置"),
	
	ADD_USER_PROPERTIES("新增用户配置"),
	
	USER_CAN_CREATE_ROLE_NUM_PER_DAY_CONFIG("用户每天可创建角色数量配置"),

	NICK_NAME_IS_UNIQUE_IN_SUB_DOMAIN("昵称在子域是否唯一"),
	
	;

	private String message;

	private ConfigNameEnum(String message) {
		this.message = message;
	}

	public String message() {
		// TODO Auto-generated method stub
		return message;
	}

	public Number value() {
		// TODO Auto-generated method stub
		return null;
	}

}
