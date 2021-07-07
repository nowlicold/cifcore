package com.yuan.cifcore.common.model.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bench.lang.base.collection.utils.CollectionUtils;
import com.bench.lang.base.list.utils.ListUtils;
import com.bench.lang.base.number.utils.NumberUtils;
import com.bench.lang.base.string.utils.StringUtils;
import com.yuan.cifcore.common.model.URMCoreConstant;
import com.yuan.cifcore.common.model.User;
import com.yuan.cifcore.common.model.UserProfile;
import com.yuan.cifcore.common.model.constants.CifConstants;

/**
 * CIF辅助类
 * 
 * @author chenbug
 * 
 * @version $Id: CifHelper.java, v 0.1 2013-3-12 下午5:59:05 chenbug Exp $
 */
public class CifHelper {

	public static final int USER_ID_LENGTH = 32;

	/**
	 * 是否空密码
	 * 
	 * @return
	 */
	public static boolean isEmptyPassword(String password) {
		return StringUtils.isEmpty(password) || StringUtils.equals(CifConstants.DEFAULT_EMPTY_PASSWORD, password);
	}

	/**
	 * 判断会员ID是否正确
	 * 
	 * @return
	 */
	public static boolean isUserIdValid(String userId) {
		if (StringUtils.isEmpty(userId)) {
			return false;
		}
		if (!NumberUtils.isDigits(userId)) {
			return false;
		}
		return userId.length() == USER_ID_LENGTH;
	}

	/**
	 * @param profileList
	 * @param profileName
	 * @return
	 */
	public static UserProfile getByProfileName(List<UserProfile> profileList, String profileName) {
		if (ListUtils.size(profileList) == 0) {
			return null;
		}
		for (UserProfile userProfile : profileList) {
			if (StringUtils.equals(userProfile.getProfileName(), profileName)) {
				return userProfile;
			}
		}
		return null;
	}

	/**
	 * 转换userList为userId为Key的map
	 * 
	 * @param userList
	 * @return
	 */
	public static final Map<String, User > convertToUserIdMap(List<User> userList) {
		Map<String, User> returnMap = new HashMap<String, User>();
		for (User user : userList) {
			returnMap.put(user.getUserId(), user);
		}
		return returnMap;
	}

	/**
	 * 转换userList为userId为Key的map
	 * 
	 * @param userProfileList
	 * @return
	 */
	public static final Map<String, UserProfile> convertToUserIdProfileMap(List<UserProfile> userProfileList) {
		Map<String, UserProfile> returnMap = new HashMap<String, UserProfile>();
		for (UserProfile userProfile : userProfileList) {
			returnMap.put(userProfile.getUserId(), userProfile);
		}
		return returnMap;
	}

	/**
	 * 返回会员ID的URM路径
	 * 
	 * @param userId
	 * @return
	 */
	public static List<String> getURMPathByUserId(String userId) {
		List<String> returnList = new ArrayList<String>();
		returnList.add(URMCoreConstant.RESOURCE_BUCKET_USER_LOGO_PATH);
		CollectionUtils.addAll(returnList, StringUtils.splitByteLength(userId, 2));
		return returnList;
	}

	/**
	 * 返回会员id的年月日
	 * 
	 * @param systemLogoId
	 * @return
	 */
	public static List<String> getURMPathBySystemLogoId(long systemLogoId) {
		List<String> returnList = new ArrayList<String>();
		returnList.add(URMCoreConstant.RESOURCE_BUCKET_SYSTEM_LOGO_PATH);
		CollectionUtils.addAll(returnList, StringUtils.splitByteLength(Long.toString(systemLogoId), 2));
		return returnList;
	}
}
