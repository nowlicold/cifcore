package com.yuan.cifcore.api.user;

import com.yuan.cifcore.api.user.model.User;
import com.yuan.cifcore.api.user.request.UserLoginByCellRequest;
import com.yuan.cifcore.api.user.request.UserSearchRequest;
import com.yuan.cifcore.api.user.result.UserLoginResult;
import com.bench.common.model.JsonResult;
import com.bench.common.model.PageVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 */
@FeignClient(
        value = "userApi",
        url = "${rpc.cifcore.url}",
        fallbackFactory = UserQueryApiFallback.class
)
public interface UserQueryApi {
    @PostMapping("/private/user/search")
    JsonResult<PageVO<User>> search(UserSearchRequest request);
}
