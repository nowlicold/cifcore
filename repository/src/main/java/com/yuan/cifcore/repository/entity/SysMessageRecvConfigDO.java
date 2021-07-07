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
 * 系统消息接收配置
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_message_recv_config")
@ApiModel(value="SysMessageRecvConfigDO对象", description="系统消息接收配置")
public class SysMessageRecvConfigDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键，PK")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private BigDecimal id;

    @ApiModelProperty(value = "消息名")
    private String messageName;

    @ApiModelProperty(value = "服务器代码，如果为空，则为DEFAULT")
    private String messageServerCode;

    @ApiModelProperty(value = "允许主机名，支持模糊匹配")
    private String allowHostNames;

    @ApiModelProperty(value = "允许主机分组名，支持模糊匹配")
    private String allowHostGroups;

    @ApiModelProperty(value = "接收的并发消费者数量")
    private BigDecimal receiveConcurrentConsumers;

    @ApiModelProperty(value = "最大分发重试次数，-1表示不限制")
    private BigDecimal distributeMaxRetryCount;

    @ApiModelProperty(value = "分发间隔时间，多个逗号间隔，支持s,m,h,d表达式")
    private String distributeRetryInterval;

    @ApiModelProperty(value = "分发的核心线程数")
    private BigDecimal distributeCoreThreadCount;

    @ApiModelProperty(value = "分发的最大线程数")
    private BigDecimal distributeMaxThreadCount;

    @ApiModelProperty(value = "处理的最大线程数")
    private BigDecimal handleMaxThreadCount;

    @ApiModelProperty(value = "处理的核心线程数")
    private BigDecimal handleCoreThreadCount;

    @ApiModelProperty(value = "处理间隔时间，多个逗号间隔，支持s,m,h,d表达式")
    private String handleRetryInterval;

    @ApiModelProperty(value = "最大处理重试次数，-1表示不限制")
    private BigDecimal handleMaxRetryCount;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    private Date gmtModified;


    public static final String ID = "id";

    public static final String MESSAGE_NAME = "message_name";

    public static final String MESSAGE_SERVER_CODE = "message_server_code";

    public static final String ALLOW_HOST_NAMES = "allow_host_names";

    public static final String ALLOW_HOST_GROUPS = "allow_host_groups";

    public static final String RECEIVE_CONCURRENT_CONSUMERS = "receive_concurrent_consumers";

    public static final String DISTRIBUTE_MAX_RETRY_COUNT = "distribute_max_retry_count";

    public static final String DISTRIBUTE_RETRY_INTERVAL = "distribute_retry_interval";

    public static final String DISTRIBUTE_CORE_THREAD_COUNT = "distribute_core_thread_count";

    public static final String DISTRIBUTE_MAX_THREAD_COUNT = "distribute_max_thread_count";

    public static final String HANDLE_MAX_THREAD_COUNT = "handle_max_thread_count";

    public static final String HANDLE_CORE_THREAD_COUNT = "handle_core_thread_count";

    public static final String HANDLE_RETRY_INTERVAL = "handle_retry_interval";

    public static final String HANDLE_MAX_RETRY_COUNT = "handle_max_retry_count";

    public static final String GMT_CREATE = "gmt_create";

    public static final String GMT_MODIFIED = "gmt_modified";

}
