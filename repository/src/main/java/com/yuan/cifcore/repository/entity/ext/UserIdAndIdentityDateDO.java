package com.yuan.cifcore.repository.entity.ext;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @className UserIdAndIdentityDateDO
 * @autor cold
 * @DATE 2021/6/2 11:45
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("CIF_USER")
@ApiModel(value="UserIdAndIdentityDateDO对象", description="用户实名信息认证")
public class UserIdAndIdentityDateDO {
    /**
     * 用户ID
     */
    private String userId;

    /**
     * 实名认证时间时间
     */
    private Date gmtChangeIdentity;
}
