/**
 * 
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.cache.global.GlobalCacheAreaName;
import com.bench.common.enums.EnumBase;

/**
 * @author chengzi
 *
 * @version $Id: CifGlobalCacheAreaNameEnum.java, v 0.1 2016年9月29日 下午12:04:08
 *          chengzi Exp $
 */
public enum CifGlobalCacheAreaNameEnum implements GlobalCacheAreaName, EnumBase {

	USER_ID_AND_LOGIN_NAME_CACHE("会员信息缓存"),

	USER_ID_AND_NICK_NAME_CACHE("会员nickName缓存"),

	USER_ID_AN_LOGIN_SESSIONS_CACHE("会员session缓存"),
	
	USER_ID_AND_DOMAIN_INFO_CACHE("会员域信息缓存"),

	;

	private String message;

	private CifGlobalCacheAreaNameEnum(String message) {
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
