/**
 * 
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.enums.EnumBase;

/**
 * 证件类型枚举
 * 
 * @author chenbug 2009-10-15 下午09:56:46
 * 
 */
public enum CertTypeEnum implements EnumBase {

	IDENTITY_CARD("身份证"),

	/** 护照 */
	PASSPORT("护照"),

	/** 军官证 */
	OFFICER_CARD("军官证"),

	/** 士兵证 */
	SOLDIER_CARD("士兵证"),

	/** 回乡证 */
	BACK_HOMETOWN_CARD("回乡证"),

	/** 临时身份证 */
	TEMP_INDENTITY_CARD("临时身份证"),

	/** 户口簿 */
	HOKOU("户口簿"),

	/** 警官证 */
	POLICE_CARD("警官证"),

	/** 台胞证 */
	TAIWAN_CARD("台胞证"),

	/** 营业执照 */
	BUSINESS_LICENSE("营业执照"),

	/** 港澳台居民大陆通行证 */
	TW_HK_MC_LICENSE("港澳台居民大陆通行证"),

	//
	OTHERS("其他证件");

	private String message;

	private CertTypeEnum(String message) {
		this.message = message;
	}

	public String message() {
		// TODO Auto-generated method stub
		return message;
	}

	public Number value() {
		// TODO Auto-generated method stub
		return 0;
	}

}
