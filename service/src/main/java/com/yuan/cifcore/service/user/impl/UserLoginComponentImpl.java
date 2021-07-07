package com.yuan.cifcore.service.user.impl;

import com.yuan.cifcore.common.enums.CifCoreErrorEnum;
import com.yuan.cifcore.api.user.request.UserLoginByCellRequest;
import com.yuan.cifcore.api.user.result.UserLoginResult;
import com.yuan.cifcore.repository.entity.UserDO;
import com.yuan.cifcore.repository.mapper.UserMapper;
import com.yuan.cifcore.service.user.UserLoginComponent;
import com.bench.common.security.Md5Encrypt;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @className UserLoginServiceImpl
 * @autor cold
 * @DATE 2021/5/9 11:56
 **/
@Service
@Slf4j
public class UserLoginComponentImpl implements UserLoginComponent {

    @Resource
    private UserMapper userMapper;
    @Override
    public UserLoginResult loginByCell(UserLoginByCellRequest request) {
        UserLoginResult result = new UserLoginResult();
        //默认是成功的
        result.setSuccess(true);
        if(StringUtils.isEmpty(request.getCell())){
            result.setSuccess(false);
            result.setErrorCode(CifCoreErrorEnum.USER_LOGIN_NOT_FOUND.errorCode());
            return result;
        }
        if(StringUtils.isEmpty(request.getLoginPassword())){
            result.setSuccess(false);
            result.setErrorCode(CifCoreErrorEnum.USER_LOGIN_PASSWORD_ERROR.errorCode());
            return result;
        }
        UserDO userDO = null;
        // userDO = userMapper.selectByCell(request.getCell());
        if (userDO == null){
            result.setSuccess(false);
            result.setErrorCode(CifCoreErrorEnum.USER_LOGIN_NOT_FOUND.errorCode());
            return result;
        }
        if(!StringUtils.equals(Md5Encrypt.toMD5High(request.getLoginPassword()),userDO.getLoginPassword())){
            result.setSuccess(false);
            result.setErrorCode(CifCoreErrorEnum.USER_LOGIN_PASSWORD_ERROR.errorCode());
            return result;
        }
        result.setLoginName(userDO.getLoginName());
        result.setUserId(userDO.getUserId());
        result.setSuccess(true);
        return result;
    }
}
