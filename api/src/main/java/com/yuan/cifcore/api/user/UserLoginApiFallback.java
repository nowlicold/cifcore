package com.yuan.cifcore.api.user;

import com.yuan.cifcore.api.user.request.UserLoginByCellRequest;
import com.yuan.cifcore.api.user.result.UserLoginResult;
import com.bench.common.model.JsonResult;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @className UserApiFallback
 * @autor cold
 * @DATE 2021/5/9 15:21
 **/
@Component
@Slf4j
public class UserLoginApiFallback implements FallbackFactory<UserLoginApi> {
    @Override
    public UserLoginApi create(Throwable cause) {

        return new UserLoginApi() {
            @Override
            public JsonResult<UserLoginResult> loginByCell(UserLoginByCellRequest request) {
                log.error("rpcError,method:login,request:{}", request);
                return JsonResult.rpcError("调用登录接口异常");            }
        };
    }
}
