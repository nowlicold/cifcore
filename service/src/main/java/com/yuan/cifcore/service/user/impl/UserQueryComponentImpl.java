package com.yuan.cifcore.service.user.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuan.cifcore.api.user.model.User;
import com.yuan.cifcore.api.user.request.UserSearchRequest;
import com.yuan.cifcore.repository.entity.UserDO;
import com.yuan.cifcore.repository.mapper.UserMapper;
import com.yuan.cifcore.service.user.UserConvert;
import com.yuan.cifcore.service.user.UserQueryComponent;
import com.bench.common.model.PageVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @className UserQueryComponentImpl
 * @autor cold
 * @DATE 2021/5/23 20:00
 **/
@Service
@Slf4j
public class UserQueryComponentImpl implements UserQueryComponent {
	@Resource
	private UserMapper userMapper;

	@Override
	public PageVO<User> search(UserSearchRequest request) {
		Page<UserDO> page = new Page<>(request.getCurrent(), request.getSize());
		List<UserDO> userDOList = userMapper.search(request.getUserId(),null,request.getLoginName(),null,null,null,request.getCell(),null,null,null,null,null,null,null,null,null,null,page);

		page.setRecords(userDOList);
		PageVO<User> pageVO = UserConvert.convertPage(page);
		return pageVO;
	}
}
