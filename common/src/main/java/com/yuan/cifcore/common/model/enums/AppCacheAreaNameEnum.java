/**
 * 
 */
package com.yuan.cifcore.common.model.enums;

import com.bench.common.cache.app.AppCacheAreaName;
import com.bench.common.enums.EnumBase;
/**
 * @author chengzi
 *
 * @version $Id: AppCacheAreaNameEnum.java, v 0.1 2016年9月26日 下午12:02:38 chengzi Exp $
 */
public enum AppCacheAreaNameEnum  implements AppCacheAreaName, EnumBase {
	
	USER_ID_AND_LOGIN_NAME_MAX_GMT_MODIFIED_CACHE("会员信息缓存最大修改时间"),
	
	USER_ID_AND_DOMAIN_INFO_MAX_GMT_MODIFIED_CACHE("会员id和域信息修改最大时间"),
	
	USER_CREATE_ROLE_NUM_PER_DAY_CACHE("用户每天创建角色数量缓存");
	
	;

	private String message;
	
	private AppCacheAreaNameEnum(String message){
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
