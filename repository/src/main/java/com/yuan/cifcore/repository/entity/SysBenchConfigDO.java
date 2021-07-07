package com.yuan.cifcore.repository.entity;

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
 * bench配置，平台配置参数，非应用类。
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_bench_config")
@ApiModel(value="SysBenchConfigDO对象", description="bench配置，平台配置参数，非应用类。")
public class SysBenchConfigDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "配置名")
    @TableId(value = "config_name", type = IdType.ASSIGN_ID)
    private String configName;

    @ApiModelProperty(value = "配置值")
    private String configValue;

    @ApiModelProperty(value = "最后修改时间")
    private Date gmtModified;

    @ApiModelProperty(value = "修改人")
    private String modifier;

    @ApiModelProperty(value = "备注")
    private String memo;

    @ApiModelProperty(value = "配置类型")
    private String configType;


    public static final String CONFIG_NAME = "config_name";

    public static final String CONFIG_VALUE = "config_value";

    public static final String GMT_MODIFIED = "gmt_modified";

    public static final String MODIFIER = "modifier";

    public static final String MEMO = "memo";

    public static final String CONFIG_TYPE = "config_type";

}
