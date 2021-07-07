package com.yuan.cifcore.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 会员id映射表
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cif_user_id_mapping")
@ApiModel(value="UserIdMappingDO对象", description="会员id映射表")
public class UserIdMappingDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "旧userid")
    private String userId;

    @ApiModelProperty(value = "新userid")
    private String newUserId;


    public static final String USER_ID = "user_id";

    public static final String NEW_USER_ID = "new_user_id";

}
