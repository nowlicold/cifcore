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
 * 接收到的消息处理
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_message_recv_handle")
@ApiModel(value="SysMessageRecvHandleDO对象", description="接收到的消息处理")
public class SysMessageRecvHandleDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键，PK")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    @ApiModelProperty(value = "消息ID")
    private String messageId;

    @ApiModelProperty(value = "消息名")
    private String messageName;

    @ApiModelProperty(value = "监听名称")
    private String listenerName;

    @ApiModelProperty(value = "权重")
    private BigDecimal weight;

    @ApiModelProperty(value = "尝试处理次数")
    private BigDecimal retryCount;

    @ApiModelProperty(value = "错误原因")
    private String errorDetail;

    @ApiModelProperty(value = "处理的主机名")
    private String handleHostName;

    @ApiModelProperty(value = "下次执行时间")
    private Date gmtNext;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    private Date gmtModified;

    @ApiModelProperty(value = "是否有效")
    private BigDecimal enabled;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "上次执行时间")
    private Date gmtPrevious;


    public static final String ID = "id";

    public static final String MESSAGE_ID = "message_id";

    public static final String MESSAGE_NAME = "message_name";

    public static final String LISTENER_NAME = "listener_name";

    public static final String WEIGHT = "weight";

    public static final String RETRY_COUNT = "retry_count";

    public static final String ERROR_DETAIL = "error_detail";

    public static final String HANDLE_HOST_NAME = "handle_host_name";

    public static final String GMT_NEXT = "gmt_next";

    public static final String GMT_CREATE = "gmt_create";

    public static final String GMT_MODIFIED = "gmt_modified";

    public static final String ENABLED = "enabled";

    public static final String STATUS = "status";

    public static final String GMT_PREVIOUS = "gmt_previous";

}
