package com.yuan.cifcore.api.user.request;

import com.yuan.cifcore.api.user.LoginTypeEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @className UserLoginRequest
 * @autor cold
 * @DATE 2021/5/8 22:37
 * 用户登录请求
 **/
@Data
public abstract class UserLoginRequest {
    /**
     * 登录密码
     */
    @ApiModelProperty(value = "登录密码", required = true)
    @NotNull(message = "登录密码不能为空")
    protected String loginPassword;

    /**
     * 登录方式，子类需要实现
     * @return
     */
    public abstract LoginTypeEnum getLoginType();



}
