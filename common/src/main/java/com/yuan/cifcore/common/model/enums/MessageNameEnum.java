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
 * @version $Id: MessageNameEnum, v 0.1 2011-5-3 下午12:29:32 chenbug Exp $
 */
public enum MessageNameEnum implements EnumBase{

	MSG_USER_REGISTER_AFTER("用户注册事件"),

	MSG_USER_RELATION_ADD("用户关系创建事件"),

	MSG_USER_RELATION_DELETE("用户关系删除事件"),

	MSG_USER_LOGIN_SUCCESS_AFTER("用户登录成功事件"),

	MSG_USER_CELL_VALIDATED_AFTER("用户手机绑定成功事件"),

	MSG_USER_IDENTIFY_SET_AFTER("用户实名信息设置成功事件"),

	MSG_ONE_AUTH_IDENTIFY_SET_AFTER("单认证实名信息设置成功事件"),

	MSG_USER_DOMAIN_UPDATE_AFTER("用户域信息更新成功"),

	MSG_USER_STATUS_UPDATE_AFTER("用户状态信息更新成功"),

	MSG_USER_ROLE_NAME_CHANGE_FANISH("用户角色名修改结束"),

	MSG_CIF_USER_LOGIN_NAME_CHANGE_REQ("用户登录名修改请求"),

	MSG_CIF_THIRD_USER_LOGIN_NAME_CHANGE_REQ("用户第三方登录名修改请求"),

	MSG_CIF_ONE_AUTH_LOGIN_SUCCESS_AFTER("单认证登录成功事件"),

	MSG_CIF_ONE_AUTH_CREATE_AFTER("单认证创建成功事件"),

	MSG_CIF_ONE_AUTH_CELL_VALIDATED_AFTER("单认证手机绑定成功事件"),

	MSG_CIF_THIRD_USER_MAPPING_CREATE_FINISH("第三方映射创建结束消息"),
	
	MSG_CIF_THIRD_USER_MAPPING_DELETE_FINISH("第三方映射删除结束消息"),
	
	MSG_CIF_THIRD_ONE_AUTH_MAPPING_CREATE_FINISH("第三方单认证映射创建结束消息"),
	
	MSG_CIF_THIRD_ONE_AUTH_MAPPING_DELETE_FINISH("第三方单认证映射删除结束消息"),

	MSG_CIF_USER_LOGIN_KICKED_OUT("用户登录被踢出消息"),

	MSG_CIF_USER_LOGIN_BATCH_KICKED_OUT("用户登录批量被踢出消息"),

	MSG_CIF_USER_IDENTIFY_CHANGE_REQ("用户实名信息更改请求"),

	MSG_ONE_AUTH_IDENTITY_PHOTO_APPLY_AUDIT_FINISH("单认证身份证照片申请审核结束消息"),

	;

	private MessageNameEnum(String message) {
		this.message = message;
	}

	private String message;

	public String message() {
		// TODO Auto-generated method stub
		return message;
	}

	public Number value() {
		// TODO Auto-generated method stub
		return null;
	}

}
