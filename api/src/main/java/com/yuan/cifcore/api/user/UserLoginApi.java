package com.yuan.cifcore.api.user;

import com.yuan.cifcore.api.user.request.UserLoginByCellRequest;
import com.yuan.cifcore.api.user.result.UserLoginResult;
import com.bench.common.model.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 */
@FeignClient(
        value = "userApi",
        url = "${rpc.cifcore.url}",
        fallbackFactory = UserLoginApiFallback.class
)
public interface UserLoginApi {
    @PostMapping("/private/user/login")
    JsonResult<UserLoginResult> loginByCell(UserLoginByCellRequest request);
}
