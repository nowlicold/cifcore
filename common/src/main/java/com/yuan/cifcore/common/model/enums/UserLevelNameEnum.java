package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 用户等级类型
 * 
 * @author chenbug
 * 
 * @version $Id: UserLevelNameEnum, v 0.1 2011-9-26 上午09:08:34 chenbug Exp $
 */
public enum UserLevelNameEnum implements EnumBase {

	GRADE("会员等级", UserGradeEnum.class, UserGradeEnum.NORMAL);

	private UserLevelNameEnum(String message, Class<? extends UserLevelValueEnum> valueEnumClass,
			UserLevelValueEnum defaultValue) {
		this.message = message;
		this.valueEnumClass = valueEnumClass;
		this.defaultValue = defaultValue;
	}

	private String message;

	private UserLevelValueEnum defaultValue;

	private Class<? extends UserLevelValueEnum> valueEnumClass;

	/**
	 * @return
	 */
	public Class<? extends UserLevelValueEnum> valueEnumClass() {
		return valueEnumClass;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bench.common.enums.EnumBase#message()
	 */
	public String message() {
		// TODO Auto-generated method stub
		return message;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bench.common.enums.EnumBase#value()
	 */
	public Number value() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserLevelValueEnum defaultValue() {
		// TODO Auto-generated method stub
		return defaultValue;
	}
}
