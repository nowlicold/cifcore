package com.yuan.cifcore.api.user.request;

import com.yuan.cifcore.api.user.LoginTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * @className UserLoginByCellRequest
 * @autor cold
 * @DATE 2021/5/10 0:30
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description = "用户登录")
public class UserLoginByCellRequest extends UserLoginRequest {
    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号", required = true)
    @NotNull(message = "手机号不能为空")
    private String cell;

    @Override
    public LoginTypeEnum getLoginType() {
        return LoginTypeEnum.CELL;
    }
}
