package com.yuan.cifcore.http.controller.api.user;

import com.yuan.cifcore.api.user.UserQueryApi;
import com.yuan.cifcore.api.user.model.User;
import com.yuan.cifcore.api.user.request.UserSearchRequest;
import com.yuan.cifcore.service.user.UserQueryComponent;
import com.bench.common.model.JsonResult;
import com.bench.common.model.PageVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @className UserQueryController
 * @autor cold
 * @DATE 2021/5/24 10:51
 **/
@RestController
@Api(value = "用户查询", tags = "用户查询")
@Slf4j
public class UserQueryController implements UserQueryApi {
    @Autowired
    private UserQueryComponent userQueryComponent;

    @ApiOperation(value = "用户查询")
    @Override
    public JsonResult<PageVO<User>> search(@RequestBody @Valid UserSearchRequest request) {
       return JsonResult.success(userQueryComponent.search(request));
    }
}
