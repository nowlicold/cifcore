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
 * 文本存储索引
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_text_storage_index")
@ApiModel(value="SysTextStorageIndexDO对象", description="文本存储索引")
public class SysTextStorageIndexDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键，PK")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private BigDecimal id;

    @ApiModelProperty(value = "数据名")
    private String dataName;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    private Date gmtModified;

    @ApiModelProperty(value = "属性集合")
    private String properties;

    @ApiModelProperty(value = "区域名")
    private String areaName;


    public static final String ID = "id";

    public static final String DATA_NAME = "data_name";

    public static final String GMT_CREATE = "gmt_create";

    public static final String GMT_MODIFIED = "gmt_modified";

    public static final String PROPERTIES = "properties";

    public static final String AREA_NAME = "area_name";

}
