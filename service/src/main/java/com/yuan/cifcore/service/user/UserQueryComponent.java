package com.yuan.cifcore.service.user;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuan.cifcore.api.user.model.User;
import com.yuan.cifcore.api.user.request.UserSearchRequest;
import com.bench.common.model.PageVO;

/**
 * @className UserQueryComponent
 * @autor cold
 * @DATE 2021/5/23 19:54
 **/
public interface UserQueryComponent {
  public PageVO<User> search(UserSearchRequest request);
}
