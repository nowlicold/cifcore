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
 * 应用级Task配置
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cfg_app_task_execue_config")
@ApiModel(value="CfgAppTaskExecueConfigDO对象", description="应用级Task配置")
public class CfgAppTaskExecueConfigDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键，PK")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private BigDecimal id;

    @ApiModelProperty(value = "任务名")
    private String taskName;

    @ApiModelProperty(value = "允执行的机器组名，多个逗号间隔。支持*匹配")
    private String allowExecuteHostGroups;

    @ApiModelProperty(value = "运行执行的机器名，多个逗号间隔。支持*匹配")
    private String allowExecuteHostNames;

    @ApiModelProperty(value = "是否有效")
    private BigDecimal enabled;

    @ApiModelProperty(value = "修改时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "创建时间")
    private Date gmtModified;


    public static final String ID = "id";

    public static final String TASK_NAME = "task_name";

    public static final String ALLOW_EXECUTE_HOST_GROUPS = "allow_execute_host_groups";

    public static final String ALLOW_EXECUTE_HOST_NAMES = "allow_execute_host_names";

    public static final String ENABLED = "enabled";

    public static final String GMT_CREATE = "gmt_create";

    public static final String GMT_MODIFIED = "gmt_modified";

}
