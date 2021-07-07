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
 * 序列表
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_sequence")
@ApiModel(value="SysSequenceDO对象", description="序列表")
public class SysSequenceDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "序列名，主键，PK")
    @TableId(value = "sequence_name", type = IdType.ASSIGN_ID)
    private String sequenceName;

    @ApiModelProperty(value = "当前值，注意，当前值是可用的值")
    private BigDecimal currentValue;

    @ApiModelProperty(value = "增长值")
    private BigDecimal incrementValue;

    @ApiModelProperty(value = "缓存值，即每次缓存多少个")
    private BigDecimal cacheValue;

    @ApiModelProperty(value = "保留值，即小于多少个时，需要申请")
    private BigDecimal reserveValue;

    @ApiModelProperty(value = "修改时间")
    private Date gmtModified;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;


    public static final String SEQUENCE_NAME = "sequence_name";

    public static final String CURRENT_VALUE = "current_value";

    public static final String INCREMENT_VALUE = "increment_value";

    public static final String CACHE_VALUE = "cache_value";

    public static final String RESERVE_VALUE = "reserve_value";

    public static final String GMT_MODIFIED = "gmt_modified";

    public static final String GMT_CREATE = "gmt_create";

}
