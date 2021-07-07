package com.yuan.cifcore.api.user.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @className User
 * @autor cold
 * @DATE 2021/5/23 19:38
 **/
@Data
public class User implements Serializable {

    @ApiModelProperty(value = "编号")
    private Integer id;

    @ApiModelProperty(value = "用户编号")
    private String userId;

    @ApiModelProperty(value = "登录名")
    private String loginName;

    @ApiModelProperty(value = "登录密码")
    private String loginPassword;

    @ApiModelProperty(value = "手机号")
    private String cell;
}
