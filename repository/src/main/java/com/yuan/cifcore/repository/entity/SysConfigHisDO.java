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
 * 系统配置历史表
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_config_his")
@ApiModel(value="SysConfigHisDO对象", description="系统配置历史表")
public class SysConfigHisDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键，PK")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private BigDecimal id;

    @ApiModelProperty(value = "配置名")
    private String configName;

    @ApiModelProperty(value = "配置值")
    private String configValue;

    @ApiModelProperty(value = "最后修改时间")
    private Date gmtModified;

    @ApiModelProperty(value = "修改人")
    private String modifier;

    @ApiModelProperty(value = "类型")
    private String type;

    @ApiModelProperty(value = "备注")
    private String memo;

    @ApiModelProperty(value = "配置区域")
    private String configArea;

    @ApiModelProperty(value = "大字段值")
    private String configValueBig;

    @ApiModelProperty(value = "引用其他的CONFIG的name")
    private String configNameReference;

    @ApiModelProperty(value = "引用其他的CONFIG的area")
    private String configAreaReference;


    public static final String ID = "id";

    public static final String CONFIG_NAME = "config_name";

    public static final String CONFIG_VALUE = "config_value";

    public static final String GMT_MODIFIED = "gmt_modified";

    public static final String MODIFIER = "modifier";

    public static final String TYPE = "type";

    public static final String MEMO = "memo";

    public static final String CONFIG_AREA = "config_area";

    public static final String CONFIG_VALUE_BIG = "config_value_big";

    public static final String CONFIG_NAME_REFERENCE = "config_name_reference";

    public static final String CONFIG_AREA_REFERENCE = "config_area_reference";

}
