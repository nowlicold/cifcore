package com.yuan.cifcore.api.user;

import com.bench.common.enums.EnumBase;

/**
 * 登录方式
 */
public enum LoginTypeEnum implements EnumBase {
    CELL("手机号登录",1)
    ;

    private String message;

    private Number value;
    LoginTypeEnum(String message,Number value){
        this.message = message;
        this.value = value;
    }
    @Override
    public String message() {
        return message;
    }

    @Override
    public Number value() {
        return value;
    }
}
