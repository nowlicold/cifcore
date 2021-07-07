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
 * 事件配置
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_event_config")
@ApiModel(value="SysEventConfigDO对象", description="事件配置")
public class SysEventConfigDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键，PK")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private BigDecimal id;

    @ApiModelProperty(value = "事件名，英文")
    private String eventName;

    @ApiModelProperty(value = "直接分发的核心线程数")
    private BigDecimal directDistribCoreThreadCt;

    @ApiModelProperty(value = "直接分发的最大线程数")
    private BigDecimal directDistribMaxThreadCt;

    @ApiModelProperty(value = "基于TASK的分发核心线程数")
    private BigDecimal taskDistribCoreThreadCount;

    @ApiModelProperty(value = "基于TASK的分发最大线程数")
    private BigDecimal taskDistribMaxThreadCount;

    @ApiModelProperty(value = "直接处理的核心线程数")
    private BigDecimal directHandleCoreThreadCt;

    @ApiModelProperty(value = "直接处理的最大线程数")
    private BigDecimal directHandleMaxThreadCt;

    @ApiModelProperty(value = "基于TASK的处理的核心线程数")
    private BigDecimal taskHandleCoreThreadCount;

    @ApiModelProperty(value = "基于TASK的处理的最大线程数")
    private BigDecimal taskHandleMaxThreadCount;

    @ApiModelProperty(value = "处理事件的机器名，多个逗号间隔，支持模糊匹配")
    private String handleableHostNames;

    @ApiModelProperty(value = "处理事件的机器名，多个逗号间隔，支持模糊匹配")
    private String handleableHostGroups;

    @ApiModelProperty(value = "分发最大重试次数")
    private BigDecimal distributeMaxRetryCount;

    @ApiModelProperty(value = "分发重试间隔")
    private String distributeRetryInterval;

    @ApiModelProperty(value = "处理最大重试次数")
    private BigDecimal handleMaxRetryCount;

    @ApiModelProperty(value = "处理重试间隔")
    private String handleRetryInterval;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    private Date gmtModified;

    private String handleableAppIGroupIds;


    public static final String ID = "id";

    public static final String EVENT_NAME = "event_name";

    public static final String DIRECT_DISTRIB_CORE_THREAD_CT = "direct_distrib_core_thread_ct";

    public static final String DIRECT_DISTRIB_MAX_THREAD_CT = "direct_distrib_max_thread_ct";

    public static final String TASK_DISTRIB_CORE_THREAD_COUNT = "task_distrib_core_thread_count";

    public static final String TASK_DISTRIB_MAX_THREAD_COUNT = "task_distrib_max_thread_count";

    public static final String DIRECT_HANDLE_CORE_THREAD_CT = "direct_handle_core_thread_ct";

    public static final String DIRECT_HANDLE_MAX_THREAD_CT = "direct_handle_max_thread_ct";

    public static final String TASK_HANDLE_CORE_THREAD_COUNT = "task_handle_core_thread_count";

    public static final String TASK_HANDLE_MAX_THREAD_COUNT = "task_handle_max_thread_count";

    public static final String HANDLEABLE_HOST_NAMES = "handleable_host_names";

    public static final String HANDLEABLE_HOST_GROUPS = "handleable_host_groups";

    public static final String DISTRIBUTE_MAX_RETRY_COUNT = "distribute_max_retry_count";

    public static final String DISTRIBUTE_RETRY_INTERVAL = "distribute_retry_interval";

    public static final String HANDLE_MAX_RETRY_COUNT = "handle_max_retry_count";

    public static final String HANDLE_RETRY_INTERVAL = "handle_retry_interval";

    public static final String GMT_CREATE = "gmt_create";

    public static final String GMT_MODIFIED = "gmt_modified";

    public static final String HANDLEABLE_APP_I_GROUP_IDS = "handleable_app_i_group_ids";

}
