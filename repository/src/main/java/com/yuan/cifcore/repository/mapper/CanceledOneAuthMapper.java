package com.yuan.cifcore.repository.mapper;

import com.yuan.cifcore.repository.entity.CanceledOneAuthDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 单认证，独立于用户之外的，一个单认证可以关联多个用户，单认证后需要选择用户才可登录 Mapper 接口
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
public interface CanceledOneAuthMapper extends BaseMapper<CanceledOneAuthDO> {

}
