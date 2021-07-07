package com.yuan.cifcore.common.enums;

import com.bench.common.enums.error.ErrorEnum;

/**
 *
 */
public enum CifCoreErrorEnum implements ErrorEnum {
    UNKNOWN("未知错误",1),

    USER_LOGIN_NOT_FOUND("用戶名未找到",2),

    USER_LOGIN_PASSWORD_ERROR("用户密码错误",3)
    ;
    private String message;

    private Number value;
    CifCoreErrorEnum(String message,Number value){
        this.message =message;
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
