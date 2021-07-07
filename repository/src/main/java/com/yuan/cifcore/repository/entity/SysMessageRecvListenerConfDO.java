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
 * 消息接收监听配置
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_message_recv_listener_conf")
@ApiModel(value="SysMessageRecvListenerConfDO对象", description="消息接收监听配置")
public class SysMessageRecvListenerConfDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键，PK")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private BigDecimal id;

    @ApiModelProperty(value = "监听器名称")
    private String listenerName;

    @ApiModelProperty(value = "是否有效")
    private BigDecimal enabled;

    @ApiModelProperty(value = "匹配EL表达式，为空表示无脚本，直接匹配上，如果不为空，优先匹配")
    private String acceptExpression;

    @ApiModelProperty(value = "匹配Groovy脚本，为空表示无脚本，直接匹配上")
    private String acceptScript;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    private Date gmtModified;


    public static final String ID = "id";

    public static final String LISTENER_NAME = "listener_name";

    public static final String ENABLED = "enabled";

    public static final String ACCEPT_EXPRESSION = "accept_expression";

    public static final String ACCEPT_SCRIPT = "accept_script";

    public static final String GMT_CREATE = "gmt_create";

    public static final String GMT_MODIFIED = "gmt_modified";

}
