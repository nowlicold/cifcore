package com.yuan.cifcore.common.model.enums;


import com.bench.common.enums.error.ErrorEnum;

/**
 * 错误代码
 * 
 * @author chenbug
 *
 * @version $Id: ErrorCodeEnum.java, v 0.1 2018年5月2日 下午8:00:55 chenbug Exp $
 */
public enum ErrorCodeEnum implements ErrorEnum {

	THIRD_SYSTEM_ERROR("第三方系统错误"),

	REQUEST_LIST_EMPTY("请求列表为空"),

	SUBDOMAIN_NOT_EXISTS("子域不存在"),

	SUBDOMAIN_NOT_ONLY("该子域已存在"),

	SM_NOT_NULL("子域中文名称不能为空"),

	OPERATION_ENVIRONMENT_ERROR("操作环境异常"),

	PLATFORM_TYPE_UNKNOWN("平台类型未知"),

	APP_DATA_LOCK_FAILED("数据锁定失败"),

	PASSWORD_SIGN_ERROR("密码加密错误"),

	/**
	 * 单认证错误
	 */
	ONE_AUTH_NOT_EXISTS("登录账号不存在"),

	ONE_AUTH_EXISTS("单认证账号已存在"),

	ONE_AUTH_ID_REQUIRED("单认证id不能为空"),

	ONE_AUTH_PLATFORM_LOGIN_UNAVAIABLE("单认证平台登录不可用"),

	THIRD_ONE_AUTH_MAPPING_CONFIG_NOT_FOUND("第三方单认证映射配置无法找到"),

	THIRD_ONE_AUTH_MAPPING_CONFIG_DISABLED("第三方单认证映射配置无效"),

	THIRD_ONE_AUTH_MAPPING_EXISTS("第三方单认证映射已经存在"),

	THIRD_ONE_AUTH_MAPPING_NOT_FOUND("第三方单认证映射不存在"),

	THIRD_ONE_AUTH_MAPPING_DELETE_FAILED("第三方单认证映射删除失败"),

	ONE_AUTH_LOGIN_NAME_EMPTY("单认证登录名为空"),

	ONE_AUTH_LOGIN_NAME_EXISTS("单认证登录名已存在"),

	OLD_ONE_AUTH_LOGIN_NAME_NOT_FOUND("旧单认证登录名未找到"),

	/************************
	 * 激活类错误
	 ************************/
	//
	ACTIVE_KEY_ERROR("激活码错误"),
	//
	USER_ALREADY_ACTIVED("用户已激活"),

	PARAMTER_NOT_ENOUGH("参数不足"),

	USER_NOT_EXISTS("用户不存在"),

	USER_PROFILE_NOT_EXISTS("用户Profile不存在"),

	USER_TYPE_NOT_FOUND("会员类型无法找到"),

	USER_TYPE_DISABLED("会员类型无效"),

	USER_TYPE_NOT_ALLOW_LOGIN("当前会员类型无法登录"),

	CELL_VALIDATED_BIND_OTHER_USER("手机已绑定到其他用户"),

	CELL_IN_BLACK_LIST("手机号在黑名单中"),

	CELL_FORMAT_ERROR("手机号格式错误"),

	CELL_NOT_VALIDATE("手机未绑定"),

	CELL_MISMATCH("手机号不匹配"),

	CELL_REQUIRED("手机号不能为空"),

	REGISTRABLE_CELL_NOT_FOUND("可注册的手机号不存在"),

	CELL_NOT_REGISTRABLE("手机号不可注册"),

	USER_REAL_NAME_EXISTS("用户真实姓名已经存在"),

	IDENTITY_PHOTO_FILE_INFO_DEFECT("身份证照片文件信息缺失"),

	ONE_AUTH_IDENTITY_PHOTO_APPLY_NOT_FOUNT("单认证身份证照片申请未找到"),

	ONE_AUTH_IDENTITY_PHOTO_APPLY_ALREADY_AUDITED("单认证身份证照片申请已被审核"),

	IDENTITY_NO_NOT_MATCH_CERT_NO("身份证号码不匹配"),
	
	USER_IDENTITY_CHANGE_APPLY_INFO_REQUIRED("会员实名信息修改申请信息缺失"),
	
	USER_IDENTITY_CHANGE_APPLY_CREATER_INFO_REQUIRED("会员实名信息修改申请人信息缺失"),
	
	USER_IDENTITY_CHANGE_APPLY_AUDITER_INFO_REQUIRED("会员实名信息修改审核人信息缺失"),
	
	USER_IDENTITY_CHANGE_APPLY_AUDIT_RESULT_REQUIRED("会员实名信息修改审核结果缺失"),
	
	USER_IDENTITY_CHANGE_APPLY_NOT_FOUND("会员实名信息修改申请单未找到"),
	
	USER_IDENTITY_CHANGE_APPLY_ALREADEY_AUDITED("会员实名信息修改申请单已被审核过"),
	
	SAME_USER_IDENTITY_CHANGE_APPLY_CREATING_NOW("当前有同一用户的实名信息修改在申请,请稍后再尝试"),
	
	THIS_USER_HAVE_IDENTITY_CHANGE_APPLY_WAIT_AUDIT("当前用户存在待审核的实名信息修改申请"),
	
	USER_IDENTITY_CHANGE_APPLY_PHOTO_DATA_SAVE_ERROR("会员实名信息修改申请照片信息存储出错"),

	//
	LOGIN_PASSWORD_ERROR("登录密码错误"),

	LOGIN_PASSWORD_NOT_SET("登录密码未设置"),

	LOGIN_PASSWORD_NOT_MATCH_RULE("登录密码不符合规范,至少包含一个字母以及数字！"),

	LOGIN_PASSWORD_NEW_CAN_NOT_EUQLS_WITH_OLD("新登录密码不能和原登录密码相同"),

	ACCOUNT_PASSWORD_NEW_CAN_NOT_EUQLS_WITH_OLD("新支付密码不能和原支付密码相同"),

	USER_PLATFORM_LOGIN_UNAVAIABLE("会员平台登录不可用"),

	USER_PLATFORM_LOGIN_RECORD_NOT_FOUND("会员平台登录记录未找到"),

	//
	ACCOUNT_PASSWORD_NOT_MATCH_RULE("支付密码不符合规范"),

	ACCOUNT_PASSWORD_ERROR("支付密码错误"),

	ACCOUNT_PASSWORD_NOT_SET("支付密码未设置"),

	ACCOUNT_PASSWORD_EXISTED("支付密码已经存在"),

	LOGIN_NAME_EXISTED("登录名已经存在"),

	LOGIN_NAME_NOT_MATCH_RULE("登录名不符合规范"),

	LOGIN_NAME_DUPLICATED("登录名重复"),

	LOGIN_NAME_NOT_VALIDATED("当前登录名未验证"),

	LOGIN_NAME_CAN_NOT_LOGIN("当前登录名不允许登录"),

	NICK_NAME_EXIST_IN_THIS_SUBDOMAIN("昵称在当前子域已存在"),

	LOGIN_NAME_NOT_EXISTED("登录名不存在"),

	LOGIN_NAME_AVAILABLE_NOT_FOUND("找不到可用登录名"),

	LOGIN_NAME_NOT_BELONG_TO_USER("登录名不属于用户"),

	BEFORE_CHANGE_LOGIN_NAME_NOT_BELONG_TO_USER_WHEN_LOGIN_NAME_CHANGE("修改登录名时，修改前的登录名不属于用户"),

	BEFORE_CHANGE_LOGIN_NAME_NOT_FOUND_WHEN_LOGIN_NAME_CHANGE("修改登录名时，修改前的登录名无法找到"),

	AFTER_CHANGE_LOGIN_NAME_EXISTED_WHEN_LOGIN_NAME_CHANGE("修改登录名时，修改后的登录名已存在"),

	LOGIN_NAME_REQUIRED("登录名不能为空"),

	REGISTER_ROLE_NAME_CONTAIN_SENSITIVE_WORDS("角色名包含敏感词汇或与存在的角色名相似度较高暂不可用"),

	DOMAIN_MODIFY_NOT_SUPPORT("域不支持修改"),

	DOMAIN_NOT_FOUND("用户所属域不存在"),

	DEFAULT_DOMAIN_NOT_FOUND("用户所属默认域不存在"),

	DOMAIN_DISABLED("用户所属域无效"),

	DOMAIN_REQUIRED("用户所属域不能为空"),

	SUB_DOMAIN_NOT_FOUND("用户所属子域不存在"),

	DEFAULT_SUB_DOMAIN_NOT_FOUND("用户所属默认子域不存在"),

	DOMAIN_AND_SUB_DOMAIN_MISMATCH("域和子域不匹配"),

	SUB_DOMAIN_DISABLED("用户所属子域无效"),

	SUB_DOMAIN_REQUIRED("用户所属子域不能为空"),
	//
	SUCCESS("验证成功"),

	CERT_NO_ERROR("证件号错误"),
	//
	OLD_PASSWORD_ERROR("原密码错误"),
	//
	VERIFY_REFUSED("重试次数太多，拒绝认证"),
	//
	LOGIN_FORBIDDEN("禁止登录"),

	LOGIN_SESSION_ID_REQUIRED("登录sessionId不能为空"),

	LOGIN_KEY_REQUIRED("登录key为空"),

	//
	USER_STATUS_Q("用户为Q状态"),

	USER_ID_REQUIRED("会员id不能为空"),

	USER_ID_LIST_EMPTY("会员idList为空"),

	USER_ID_EXISTED("会员id已存在"),

	USER_STATUS_ERROR("用户状态不正确"),

	LOGIN_PASSWORD_IS_NULL("登录密码为空"),

	USER_KEY_REQUIRED("会员key为空"),

	USER_REGISTER_FROM_NOT_FOUND("会员注册来源不存在"),

	USER_KEY_ERROR("会员key不正确"),

	USER_KEY_EXPIRED("会员key已过期"),

	USER_KEY_ALREADY_USED("会员key已使用"),

	MAIL_ADDRESS_NOT_VALIDATE("邮箱未绑定"),

	MAIL_ADDRESS_REQUIRED("邮箱不能为空"),

	MAIL_ADDRESS_EXISTED("邮箱已存在"),

	MAIL_ADDRESS_MISMATCH("邮箱不匹配"),

	NEW_MAIL_ADDRESS_EQUAL_WITH_OLD_MAIL_ADDRESS("新邮件地址和原邮件地址相同"),

	MAIL_ADDRESS_FORMAT_ERROR("邮箱格式不正确"),

	MAIL_ADDRESS_HAS_VALIDATED("邮箱已绑定"),

	USER_LOGO_NOT_FOUND("没有用户Logo"),

	USER_LOGO_MODIFY_FAILED("头像修改失败"),

	THIRD_USER_MAPPING_CONFIG_NOT_FOUND("第三方会员映射配置无法找到"),

	THIRD_USER_MAPPING_CONFIG_DISABLED("第三方会员映射配置无效"),

	THIRD_USER_MAPPING_BY_THIRD_USER_ID_TOO_MANY("第三方用户根据第三方会员id映射过多"),

	THIRD_USER_MAPPING_BY_THIRD_PARENT_USER_ID_TOO_MANY("第三方用户根据第三方父会员id映射过多"),

	THIRD_USER_MAPPING_EXISTS("第三方用户映射已经存在"),

	THIRD_USER_MAPPING_NOT_FOUND("第三方用户映射不存在"),

	THIRD_USER_MAPPING_DELETE_FAILED("第三方映射删除失败"),

	THIRD_PARENT_USER_ID_EMPTY("第三方角色归属会员id为空"),

	/*********************************
	 * 用户关系错误代码
	 **********************************/
	USER_RELATION_STATUS_T("用户关系已经是有效状态了"),

	USER_RELATION_STATUS_F("用户关系已经是无效状态了"),

	USER_RELATION_LOCK_ERROR("用户关系记录锁定失败"),

	USER_RELATION_NOT_EXISTS("用户关系不存在"),

	UNKNOW_ERROR("未知错误"),

	LOGIN_PASSWORD_EXISTED("用户登录密码已经存在"),

	USER_LOGO_GATHER_TOO_MANY("用户头像采集过多"),

	USER_LOGO_GATHER_EXISTED("用户头像采集已存在"),
	/**************************************
	 * 系统头像错误代码
	 ****************************************/
	SYSTEM_LOGO_FILENAME_REQUIRED("文件名不能为空"),

	SYSTEM_LOGO_FILENAME_EXISTED("该文件已存在"),

	SYSTEM_LOGO_MODIFIER_REQUIRED("修改人不能为空"),

	SYSTEM_LOGO_GROUP_REQUIRED("需要指定头像分组"),

	SYSTEM_LOGO_NOT_FOUND("未找到指定有效的系统头像"),

	SYSTEM_LOGO_NAME_EXISTED("该头像名已使用"),

	CAN_NOT_USE_CELL_AS_ROLE_NAME("不能使用手机作为角色名"),

	ROLE_NAME_NOT_MATCH_RULE("角色名不符合规则"),

	USER_ROLE_EXISTED("角色已存在"),

	USER_ROLE_NOT_EXISTED("角色不存在"),

	USER_ROLE_NAME_EXISTED("角色名已存在"),

	USER_REAL_NAME_NOT_MATCH_RULE("用户真实姓名不符合规则"),

	USER_CREATE_ROLE_NUM_PER_DAY_HAS_REACHED_THE_UPPER_LIMIT("用户日创建角色数量达到上限"),

	USER_CREATE_NUM_HAS_REACHED_THE_UPPER_LIMIT("会员创建数量超过上限"),

	/**************
	 * 用户平台类型
	 *************/
	USER_PLATFORM_TYPE_REQUIRED("用户平台类型不能为空"),

	USER_PLATFORM_TYPE_NOT_FOUND("找不到用户平台类型"),

	PARAMTER_ERROR("参数错误"),

	USER_GEOGRAPHIC_LOC_EXISTED("用户地理信息已存在"),

	USER_GEOGRAPHIC_LOC_NOT_EXISTS("用户地理信息不存在"),

	/**************************
	 * 禁止错误
	 ************************/
	FORBIDDEN_OBJECT_TYPE_REQUIRED("禁止对象类型不能为空"),

	FORBIDDEN_OBJECT_ID_REQUIRED("禁止对象ID不能为空"),

	FORBIDDEN_ID_REQUIRED("禁止ID不能为空"),

	FORBIDDEN_RECORD_DATA_LOCK_FAILED("禁止记录数据锁定失败"),

	FORBIDDEN_REASON_REQUIRED("禁止理由不能为空"),

	FORBIDDEN_ACTION_TYPE_REQUIRED("禁止动作类型不能为空"),

	FORBIDDEN_ACTION_TYPE_EXISTED("禁止动作类型已存在"),

	FORBIDDEN_ACTION_TYPE_NOT_FOUND("禁止动作类型未找到"),

	FORBIDDEN_ACTION_NAME_REQUIRED("禁止动作名称不能为空"),

	FORBIDDEN_OPERATOR_REQUIRED("禁止操作人不能为空"),

	FORBIDDEN_NOT_FOUND("找不到禁止对象"),

	FORBIDDEN_OBJECT_HANDLER_NOT_FOUND("禁止对象处理器未找到"),

	FORBIDDEN_ACTION_TYPE_AND_OBJECT_TYPE_HANDLER_NOT_FOUND("禁止动作类型和对象类型处理器未找到"),

	FORBIDDEN_BIZ_UNIQUE_ID_EXISTED("禁止对象业务唯一已存在"),

	/********
	 * ip业务错误
	 *******/
	USER_IP_REQUIRED("会员ip不能为空"),

	USER_IP_NOT_MATCH_RULE("会员ip不符合规则"),

	;

	private String message;

	ErrorCodeEnum(String message) {
		this.message = message;
	}

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public Number value() {
		// TODO Auto-generated method stub
		return null;
	}
}
