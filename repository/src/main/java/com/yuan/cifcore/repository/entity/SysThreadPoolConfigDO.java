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
 * 线程池配置
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_thread_pool_config")
@ApiModel(value="SysThreadPoolConfigDO对象", description="线程池配置")
public class SysThreadPoolConfigDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键，PK")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private BigDecimal id;

    @ApiModelProperty(value = "线程池名称，英文")
    private String threadPoolName;

    @ApiModelProperty(value = "核心线程数")
    private BigDecimal corePoolSize;

    @ApiModelProperty(value = "最大线程数")
    private BigDecimal maxPoolSize;

    @ApiModelProperty(value = "线程最大空闲时间")
    private BigDecimal keepAliveSeconds;

    @ApiModelProperty(value = "队列大小")
    private BigDecimal queueCapacity;

    @ApiModelProperty(value = "是否允许核心线程空闲退出，默认值为false")
    private BigDecimal allowCoreThreadTimeOut;

    @ApiModelProperty(value = "线程池线程不足时的策略")
    private String rejectPolicy;

    @ApiModelProperty(value = "线程池线程不足时的处理器，class:xxx表示是xxx类处理，bean:xxx表示是一个springbean来处理")
    private String rejectedExecutionHandler;

    @ApiModelProperty(value = "允许执行的机器名，多个逗号间隔，支持*匹配")
    private String allowCreateHostNames;

    @ApiModelProperty(value = "允许执行的分组名，多个逗号间隔，支持*匹配")
    private String allowCreateHostGroups;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    private Date gmtModified;

    @ApiModelProperty(value = "是否有效")
    private BigDecimal enabled;


    public static final String ID = "id";

    public static final String THREAD_POOL_NAME = "thread_pool_name";

    public static final String CORE_POOL_SIZE = "core_pool_size";

    public static final String MAX_POOL_SIZE = "max_pool_size";

    public static final String KEEP_ALIVE_SECONDS = "keep_alive_seconds";

    public static final String QUEUE_CAPACITY = "queue_capacity";

    public static final String ALLOW_CORE_THREAD_TIME_OUT = "allow_core_thread_time_out";

    public static final String REJECT_POLICY = "reject_policy";

    public static final String REJECTED_EXECUTION_HANDLER = "rejected_execution_handler";

    public static final String ALLOW_CREATE_HOST_NAMES = "allow_create_host_names";

    public static final String ALLOW_CREATE_HOST_GROUPS = "allow_create_host_groups";

    public static final String GMT_CREATE = "gmt_create";

    public static final String GMT_MODIFIED = "gmt_modified";

    public static final String ENABLED = "enabled";

}
