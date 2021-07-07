package com.yuan.cifcore.common.model.enums;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bench.common.enums.EnumBase;
import com.bench.lang.base.string.utils.StringUtils;

/**
 * 会员等级
 * 
 * @author chenbug
 * 
 * @version $Id: UserGradeEnum, v 0.1 2011-9-26 上午09:08:34 chenbug Exp $
 */
public enum UserGradeEnum implements EnumBase, UserLevelValueEnum {

	NORMAL("普通会员", 1),

	VIP("VIP会员", 2);

	private static final Logger log = LoggerFactory.getLogger(UserGradeEnum.class);

	private UserGradeEnum(String message, int value) {
		this.message = message;
		this.value = value;
	}

	public static UserGradeEnum safeValueOf(String gradeName) {
		for (UserGradeEnum enumObj : UserGradeEnum.values()) {
			if (StringUtils.equals(enumObj.name(), gradeName)) {
				return enumObj;
			}
		}
		log.error("无法识别的用户等级参数,name" + gradeName);
		return UserGradeEnum.NORMAL;
	}

	private String message;

	private int value;

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
		return value;
	}

	/**
	 * @return Returns the message.
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            The message to set.
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
