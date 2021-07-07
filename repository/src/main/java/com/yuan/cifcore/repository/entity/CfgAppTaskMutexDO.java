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
 * 应用级任务互斥表
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cfg_app_task_mutex")
@ApiModel(value="CfgAppTaskMutexDO对象", description="应用级任务互斥表")
public class CfgAppTaskMutexDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "任务名")
    @TableId(value = "task_name", type = IdType.ASSIGN_ID)
    private String taskName;

    @ApiModelProperty(value = "上次执行机器名")
    private String lastExecuteHost;

    @ApiModelProperty(value = "上次执行时间")
    private Date gmtLastExecute;

    @ApiModelProperty(value = "创建时间")
    private Date gmtModified;

    @ApiModelProperty(value = "修改时间")
    private Date gmtCreate;


    public static final String TASK_NAME = "task_name";

    public static final String LAST_EXECUTE_HOST = "last_execute_host";

    public static final String GMT_LAST_EXECUTE = "gmt_last_execute";

    public static final String GMT_MODIFIED = "gmt_modified";

    public static final String GMT_CREATE = "gmt_create";

}
