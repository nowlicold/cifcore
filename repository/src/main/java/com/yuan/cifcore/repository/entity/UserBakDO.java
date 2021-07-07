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
 * 用户表
 * </p>
 *
 * @author cold
 * @since 2021-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cif_user_bak")
@ApiModel(value="UserBakDO对象", description="用户表")
public class UserBakDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户ID")
    @TableId(value = "user_id", type = IdType.ASSIGN_ID)
    private String userId;

    @ApiModelProperty(value = "登陆名")
    private String loginName;

    @ApiModelProperty(value = "登陆密码")
    private String loginPassword;

    @ApiModelProperty(value = "真实姓名")
    private String realName;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "电子邮件")
    private String email;

    @ApiModelProperty(value = "QQ")
    private String qq;

    @ApiModelProperty(value = "是否可登陆")
    private String canLogin;

    @ApiModelProperty(value = "证件类型")
    private String certType;

    @ApiModelProperty(value = "证件号码")
    private String certNo;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    private Date gmtModified;

    @ApiModelProperty(value = "电子邮件是否验证")
    private String emailValidate;

    @ApiModelProperty(value = "QQ号是否验证")
    private String qqValidate;

    @ApiModelProperty(value = "手机号")
    private String cell;

    @ApiModelProperty(value = "手机号是否验证")
    private String cellValidate;

    @ApiModelProperty(value = "账户密码")
    private String accountPassword;

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "会员类型代码")
    private String userTypeName;

    @ApiModelProperty(value = "用户所属域代码")
    private String domain;

    @ApiModelProperty(value = "用户所属子域代码")
    private String subDomain;

    @ApiModelProperty(value = "实名信息修改时间")
    private Date gmtChangeIdentity;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "生日")
    private Date birthday;

    @ApiModelProperty(value = "单登录ID")
    private String oneAuthId;


    public static final String USER_ID = "user_id";

    public static final String LOGIN_NAME = "login_name";

    public static final String LOGIN_PASSWORD = "login_password";

    public static final String REAL_NAME = "real_name";

    public static final String STATUS = "status";

    public static final String EMAIL = "email";

    public static final String QQ = "qq";

    public static final String CAN_LOGIN = "can_login";

    public static final String CERT_TYPE = "cert_type";

    public static final String CERT_NO = "cert_no";

    public static final String GMT_CREATE = "gmt_create";

    public static final String GMT_MODIFIED = "gmt_modified";

    public static final String EMAIL_VALIDATE = "email_validate";

    public static final String QQ_VALIDATE = "qq_validate";

    public static final String CELL = "cell";

    public static final String CELL_VALIDATE = "cell_validate";

    public static final String ACCOUNT_PASSWORD = "account_password";

    public static final String NICK_NAME = "nick_name";

    public static final String USER_TYPE_NAME = "user_type_name";

    public static final String DOMAIN = "domain";

    public static final String SUB_DOMAIN = "sub_domain";

    public static final String GMT_CHANGE_IDENTITY = "gmt_change_identity";

    public static final String SEX = "sex";

    public static final String BIRTHDAY = "birthday";

    public static final String ONE_AUTH_ID = "one_auth_id";

}
