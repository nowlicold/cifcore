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
 * 消息发送tranfer配置
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_message_send_transfer_cfg")
@ApiModel(value="SysMessageSendTransferCfgDO对象", description="消息发送tranfer配置")
public class SysMessageSendTransferCfgDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "消息名")
    private String messageName;

    @ApiModelProperty(value = "应用名")
    private String appName;

    @ApiModelProperty(value = "发送方式，默认为QUEUE")
    private String transferType;

    @ApiModelProperty(value = "如果配置了，通过脚本计算后，只有返回send为true的才会发送")
    private String acceptScript;

    @ApiModelProperty(value = "如果配置了，只有满足这个表达式的通道才会传递")
    private String acceptExpression;

    @ApiModelProperty(value = "是否有效")
    private BigDecimal enabled;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    private Date gmtModified;

    @ApiModelProperty(value = "消息服务器代码")
    private String messageServerCode;

    @ApiModelProperty(value = "主键，PK")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private BigDecimal id;


    public static final String MESSAGE_NAME = "message_name";

    public static final String APP_NAME = "app_name";

    public static final String TRANSFER_TYPE = "transfer_type";

    public static final String ACCEPT_SCRIPT = "accept_script";

    public static final String ACCEPT_EXPRESSION = "accept_expression";

    public static final String ENABLED = "enabled";

    public static final String GMT_CREATE = "gmt_create";

    public static final String GMT_MODIFIED = "gmt_modified";

    public static final String MESSAGE_SERVER_CODE = "message_server_code";

    public static final String ID = "id";

}
