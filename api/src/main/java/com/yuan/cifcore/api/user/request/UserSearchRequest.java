package com.yuan.cifcore.api.user.request;

import com.bench.common.model.PageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @className UserSearchRequest
 * @autor cold
 * @DATE 2021/5/23 19:56
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class UserSearchRequest extends PageRequest {
    @ApiModelProperty("登录名")
    private String loginName;
    @ApiModelProperty("手机号")
    private String cell;
    @ApiModelProperty("用户编号")
    private String userId;

}
