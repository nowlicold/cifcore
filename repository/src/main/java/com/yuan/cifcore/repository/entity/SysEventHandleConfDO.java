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
 * 时间处理配置
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_event_handle_conf")
@ApiModel(value="SysEventHandleConfDO对象", description="时间处理配置")
public class SysEventHandleConfDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键，PK")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private BigDecimal id;

    @ApiModelProperty(value = "事件监听处理器，多个逗号间隔")
    private String eventListenerNames;

    @ApiModelProperty(value = "处理消息的机器名，多个逗号间隔")
    private String allowHandleHostNames;

    @ApiModelProperty(value = "是否有效")
    private BigDecimal enabled;

    @ApiModelProperty(value = "修改时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "创建时间")
    private Date gmtModified;


    public static final String ID = "id";

    public static final String EVENT_LISTENER_NAMES = "event_listener_names";

    public static final String ALLOW_HANDLE_HOST_NAMES = "allow_handle_host_names";

    public static final String ENABLED = "enabled";

    public static final String GMT_CREATE = "gmt_create";

    public static final String GMT_MODIFIED = "gmt_modified";

}
