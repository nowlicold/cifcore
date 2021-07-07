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
 * 间隔任务表
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sch_interval_task_info")
@ApiModel(value="SchIntervalTaskInfoDO对象", description="间隔任务表")
public class SchIntervalTaskInfoDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "任务名")
    private String taskName;

    @ApiModelProperty(value = "下1次时间")
    private Date gmtNext;

    @ApiModelProperty(value = "最近1次时间")
    private Date gmtLatest;

    @ApiModelProperty(value = "重试次数")
    private BigDecimal intervalCount;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    private Date gmtModified;

    @ApiModelProperty(value = "初始任务参数")
    private String initParameters;

    @ApiModelProperty(value = "任务ID")
    @TableId(value = "task_id", type = IdType.ASSIGN_ID)
    private String taskId;

    @ApiModelProperty(value = "运行任务参数")
    private String executeParameters;

    @ApiModelProperty(value = "首次执行时间")
    private Date gmtFirst;

    @ApiModelProperty(value = "业务ID")
    private String bizId;

    @ApiModelProperty(value = "执行结果")
    private String executeResult;


    public static final String TASK_NAME = "task_name";

    public static final String GMT_NEXT = "gmt_next";

    public static final String GMT_LATEST = "gmt_latest";

    public static final String INTERVAL_COUNT = "interval_count";

    public static final String STATUS = "status";

    public static final String GMT_CREATE = "gmt_create";

    public static final String GMT_MODIFIED = "gmt_modified";

    public static final String INIT_PARAMETERS = "init_parameters";

    public static final String TASK_ID = "task_id";

    public static final String EXECUTE_PARAMETERS = "execute_parameters";

    public static final String GMT_FIRST = "gmt_first";

    public static final String BIZ_ID = "biz_id";

    public static final String EXECUTE_RESULT = "execute_result";

}
