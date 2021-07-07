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
 * 单认证，独立于用户之外的，一个单认证可以关联多个用户，单认证后需要选择用户才可登录
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cif_canceled_one_auth")
@ApiModel(value="CanceledOneAuthDO对象", description="单认证，独立于用户之外的，一个单认证可以关联多个用户，单认证后需要选择用户才可登录")
public class CanceledOneAuthDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键，PK")
    @TableId(value = "one_auth_id", type = IdType.ASSIGN_ID)
    private String oneAuthId;

    @ApiModelProperty(value = "认证名")
    private String authName;

    @ApiModelProperty(value = "认证名类型")
    private String authNameType;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    private Date gmtModified;

    @ApiModelProperty(value = "手机号")
    private String cell;

    @ApiModelProperty(value = "手机号是否验证")
    private BigDecimal cellValidate;

    @ApiModelProperty(value = "用户所属域代码")
    private String domain;

    @ApiModelProperty(value = "用户所属子域代码")
    private String subDomain;

    @ApiModelProperty(value = "默认的用户")
    private String defaultUserId;

    @ApiModelProperty(value = "登录密码")
    private String loginPassword;

    @ApiModelProperty(value = "是否可登录")
    private BigDecimal canLogin;

    @ApiModelProperty(value = "账户密码")
    private String accountPassword;

    @ApiModelProperty(value = "真实姓名")
    private String realName;

    @ApiModelProperty(value = "电子邮件")
    private String email;

    @ApiModelProperty(value = "QQ")
    private String qq;

    @ApiModelProperty(value = "证件类型")
    private String certType;

    @ApiModelProperty(value = "证件号码")
    private String certNo;

    @ApiModelProperty(value = "电子邮件是否验证")
    private BigDecimal emailValidate;

    @ApiModelProperty(value = "QQ号是否验证")
    private BigDecimal qqValidate;

    @ApiModelProperty(value = "实名信息修改时间")
    private Date gmtChangeIdentity;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "生日")
    private Date birthday;


    public static final String ONE_AUTH_ID = "one_auth_id";

    public static final String AUTH_NAME = "auth_name";

    public static final String AUTH_NAME_TYPE = "auth_name_type";

    public static final String GMT_CREATE = "gmt_create";

    public static final String GMT_MODIFIED = "gmt_modified";

    public static final String CELL = "cell";

    public static final String CELL_VALIDATE = "cell_validate";

    public static final String DOMAIN = "domain";

    public static final String SUB_DOMAIN = "sub_domain";

    public static final String DEFAULT_USER_ID = "default_user_id";

    public static final String LOGIN_PASSWORD = "login_password";

    public static final String CAN_LOGIN = "can_login";

    public static final String ACCOUNT_PASSWORD = "account_password";

    public static final String REAL_NAME = "real_name";

    public static final String EMAIL = "email";

    public static final String QQ = "qq";

    public static final String CERT_TYPE = "cert_type";

    public static final String CERT_NO = "cert_no";

    public static final String EMAIL_VALIDATE = "email_validate";

    public static final String QQ_VALIDATE = "qq_validate";

    public static final String GMT_CHANGE_IDENTITY = "gmt_change_identity";

    public static final String SEX = "sex";

    public static final String BIRTHDAY = "birthday";

}
