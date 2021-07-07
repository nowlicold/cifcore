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
 * 监控采集的task配置
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_monitor_collect_config")
@ApiModel(value="SysMonitorCollectConfigDO对象", description="监控采集的task配置")
public class SysMonitorCollectConfigDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键，PK")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private BigDecimal id;

    @ApiModelProperty(value = "采集代码，字母英文数字组成")
    private String collectCode;

    @ApiModelProperty(value = "采集名称")
    private String collectName;

    @ApiModelProperty(value = "发送的队列名")
    private String sendQueueName;

    @ApiModelProperty(value = "存储子路径，相对根路径而言，如果为空，则是APP_ID")
    private String storeSubPath;

    @ApiModelProperty(value = "定时表达式")
    private String cronExpression;

    @ApiModelProperty(value = "采集类型")
    private String collectType;

    @ApiModelProperty(value = "采集目标，根据采集器类型决定，如sql，shell脚本等")
    private String collectTarget;

    @ApiModelProperty(value = "是否单机采集")
    private BigDecimal singleCollect;

    @ApiModelProperty(value = "解析脚本")
    private String parseScript;

    @ApiModelProperty(value = "属性集合")
    private String properties;

    @ApiModelProperty(value = "是否有效")
    private BigDecimal enabled;

    @ApiModelProperty(value = "备注")
    private String memo;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    private Date gmtModified;

    @ApiModelProperty(value = "允许采集执行的机器名，支持*号匹配，多个逗号间隔")
    private String allowCollectMachineNames;

    @ApiModelProperty(value = "允许发送执行的机器名，支持*号匹配，多个逗号间隔")
    private String allowSendMachineNames;

    @ApiModelProperty(value = "存储几分钟内的数据，超过这些分钟的数据将被删除")
    private BigDecimal storeInMinutes;

    @ApiModelProperty(value = "发送几分钟内的数据，超过这些分钟的数据将被忽略")
    private BigDecimal sendInMinutes;


    public static final String ID = "id";

    public static final String COLLECT_CODE = "collect_code";

    public static final String COLLECT_NAME = "collect_name";

    public static final String SEND_QUEUE_NAME = "send_queue_name";

    public static final String STORE_SUB_PATH = "store_sub_path";

    public static final String CRON_EXPRESSION = "cron_expression";

    public static final String COLLECT_TYPE = "collect_type";

    public static final String COLLECT_TARGET = "collect_target";

    public static final String SINGLE_COLLECT = "single_collect";

    public static final String PARSE_SCRIPT = "parse_script";

    public static final String PROPERTIES = "properties";

    public static final String ENABLED = "enabled";

    public static final String MEMO = "memo";

    public static final String GMT_CREATE = "gmt_create";

    public static final String GMT_MODIFIED = "gmt_modified";

    public static final String ALLOW_COLLECT_MACHINE_NAMES = "allow_collect_machine_names";

    public static final String ALLOW_SEND_MACHINE_NAMES = "allow_send_machine_names";

    public static final String STORE_IN_MINUTES = "store_in_minutes";

    public static final String SEND_IN_MINUTES = "send_in_minutes";

}
