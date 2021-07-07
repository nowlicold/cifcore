package com.yuan.cifcore.http.controller.api.user;

import com.yuan.cifcore.api.user.UserLoginApi;
import com.yuan.cifcore.api.user.request.UserLoginByCellRequest;
import com.yuan.cifcore.api.user.result.UserLoginResult;
import com.yuan.cifcore.service.user.UserLoginComponent;
import com.bench.common.model.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.text.MessageFormat;

/**
 * @className UserLoginController
 * @autor cold
 * @DATE 2021/5/9 15:33
 **/
@RestController
@Api(value = "用户登录", tags = "用户登录")
@Slf4j
public class UserLoginController implements UserLoginApi {
    @Autowired
    private UserLoginComponent userLoginService;

    @ApiOperation(value = "用户登录")
    @Override
    public JsonResult<UserLoginResult> loginByCell(@RequestBody @Valid UserLoginByCellRequest request) {
        log.error(MessageFormat.format("UserLoginByCellRequest={0},request.loginPassword={1}",request.toString(),request.getLoginPassword()));
        UserLoginResult  userLoginResult = userLoginService.loginByCell(request);
        //如果失败
        if(!userLoginResult.isSuccess()){
            return JsonResult.error(userLoginResult.getErrorCode().getMessage(), userLoginResult.getErrorCode().toString());
        }
        return JsonResult.success(userLoginResult);
    }
}
