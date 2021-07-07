package com.yuan.cifcore.service.user;

import com.yuan.cifcore.api.user.request.UserLoginByCellRequest;
import com.yuan.cifcore.api.user.result.UserLoginResult;

/**
 @className UserLoginService
 @autor admin
 @DATE 2021/5/8 22:48
 **/
public interface UserLoginComponent {
    /**
     * 进行登录
     * @param request
     * @return
     */
    public UserLoginResult loginByCell(UserLoginByCellRequest request);

}
