package com.yuan.cifcore.api.user.result;

import com.bench.common.model.BaseResult;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @className UserLoginResult
 * @autor cold
 * @DATE 2021/5/8 23:05
 * 用户登录成功后响应结果
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class UserLoginResult extends BaseResult {
    @ApiModelProperty(value = "userId")
    private String userId;
    @ApiModelProperty(value = "loginName")
    private String loginName;


}
