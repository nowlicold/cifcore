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
 * bench系统配置历史表，非应用类配置
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_bench_config_his")
@ApiModel(value="SysBenchConfigHisDO对象", description="bench系统配置历史表，非应用类配置")
public class SysBenchConfigHisDO implements Serializable {

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

    @ApiModelProperty(value = "备注")
    private String memo;


    public static final String ID = "id";

    public static final String CONFIG_NAME = "config_name";

    public static final String CONFIG_VALUE = "config_value";

    public static final String GMT_MODIFIED = "gmt_modified";

    public static final String MODIFIER = "modifier";

    public static final String MEMO = "memo";

}
