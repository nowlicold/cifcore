package com.yuan.cifcore.common.model.enums;

import com.bench.common.cache.local.LocalCacheAreaName;
import com.bench.common.enums.EnumBase;

/**
 * 本地缓存区域名枚举
 * 
 * @author Left
 *
 * @version $Id: LocalCacheAreaNameEnum.java, v 0.1 2016年1月19日 下午2:09:12
 *          Administrator Exp $
 */
public enum LocalCacheAreaNameEnum implements LocalCacheAreaName, EnumBase {
	CIF_SYSTEM_LOGO_FOR_CLIENT("系统头像缓存"),

	CIF_USER_LOGO_FOR_CLIENT("用户头像缓存"),

	CIF_USER_LOGO_SIMPLE_FOR_CLIENT("用户头像简单缓存"),;

	private String message;

	private LocalCacheAreaNameEnum(String message) {
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
