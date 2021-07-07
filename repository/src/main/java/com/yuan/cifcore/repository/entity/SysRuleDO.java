package com.yuan.cifcore.repository.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 规则表
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_rule")
@ApiModel(value="SysRuleDO对象", description="规则表")
public class SysRuleDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键，PK")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private BigDecimal id;

    @ApiModelProperty(value = "规则代码")
    private String code;

    @ApiModelProperty(value = "规则名")
    private String name;

    @ApiModelProperty(value = "规则状态")
    private String status;

    @ApiModelProperty(value = "规则用户分类")
    private String userSort;

    @ApiModelProperty(value = "规则类型")
    private String type;

    @ApiModelProperty(value = "最后修改时间")
    private Date gmtModified;

    @ApiModelProperty(value = "修改人")
    private String modifier;

    private String content;


    public static final String ID = "id";

    public static final String CODE = "code";

    public static final String NAME = "name";

    public static final String STATUS = "status";

    public static final String USER_SORT = "user_sort";

    public static final String TYPE = "type";

    public static final String GMT_MODIFIED = "gmt_modified";

    public static final String MODIFIER = "modifier";

    public static final String CONTENT = "content";

}
