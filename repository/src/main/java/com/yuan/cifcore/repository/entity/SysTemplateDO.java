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
 * 模板表
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_template")
@ApiModel(value="SysTemplateDO对象", description="模板表")
public class SysTemplateDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "模板代码")
    @TableId(value = "template_code", type = IdType.ASSIGN_ID)
    private String templateCode;

    @ApiModelProperty(value = "模板名称")
    private String templateName;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    private Date gmtModified;

    @ApiModelProperty(value = "模板内容")
    private String content;

    @ApiModelProperty(value = "模板类型")
    private String templateType;

    @ApiModelProperty(value = "备注说明")
    private String memo;

    @ApiModelProperty(value = "其他代码，多个逗号间隔")
    private String otherTemplateCodes;

    @ApiModelProperty(value = "是否有效")
    private String enabled;


    public static final String TEMPLATE_CODE = "template_code";

    public static final String TEMPLATE_NAME = "template_name";

    public static final String GMT_CREATE = "gmt_create";

    public static final String GMT_MODIFIED = "gmt_modified";

    public static final String CONTENT = "content";

    public static final String TEMPLATE_TYPE = "template_type";

    public static final String MEMO = "memo";

    public static final String OTHER_TEMPLATE_CODES = "other_template_codes";

    public static final String ENABLED = "enabled";

}
