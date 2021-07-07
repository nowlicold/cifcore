package com.yuan.cifcore.common.model.auth;

import java.util.Date;

import com.bench.app.cif.base.core.model.enums.CertTypeEnum;
import com.bench.app.cif.base.core.model.helper.CifHelper;
import com.bench.app.cif.base.core.model.security.enums.OneAuthNameTypeEnum;
import com.bench.common.dal.annotations.DBColumn;
import com.bench.common.model.BaseModel;
import com.bench.security.Operator;

/**
 * 单认证，一次认证关联多个用户的登录
 * 
 * @author chenbug
 *
 * @version $Id: OneAuth.java, v 0.1 2017年2月3日 下午3:28:31 chenbug Exp $
 */
public class OneAuth extends BaseModel implements Operator {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6815915874814860776L;

	/**
	 * 主键，PK
	 */
	private String oneAuthId;

	/**
	 * 认证名
	 */
	private String authName;

	/**
	 * 认证名类型
	 */
	private OneAuthNameTypeEnum authNameType;

	/**
	 * 创建人
	 */
	private String creater;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 修改人
	 */
	private String modifier;

	/**
	 * 手机号
	 */
	private String cell;

	/**
	 * 手机号是否验证
	 */
	private boolean cellValidate;

	/**
	 * 注册来源会员ID
	 */
	private String registerFromUserId;

	/**
	 * 注册来源会员类型
	 */
	private String registerFromTypeCode;

	/**
	 * 用户所属域代码
	 */
	private String domain;

	/**
	 * 用户所属子域代码
	 */
	private String subDomain;

	/**
	 * 注册IP
	 */
	private String registerIp;

	/**
	 * 默认的用户
	 */
	private String defaultUserId;

	/**
	 * 登录密码
	 */
	private String loginPassword;

	/**
	 * 是否可登录
	 */
	private boolean canLogin;

	/**
	 * 账户密码
	 */
	private String accountPassword;

	/**
	 * This property corresponds to db column <tt>REAL_NAME</tt>.<br>
	 * 真实姓名
	 */
	@DBColumn(name = "REAL_NAME", dataType = "VARCHAR2", dataDefault = "", dataLength = 32, dataPrecision = 0, dataScale = 0, nullable = true, comments = "真实姓名")
	private String realName;

	/**
	 * This property corresponds to db column <tt>EMAIL</tt>.<br>
	 * 电子邮件
	 */
	@DBColumn(name = "EMAIL", dataType = "VARCHAR2", dataDefault = "", dataLength = 128, dataPrecision = 0, dataScale = 0, nullable = true, comments = "电子邮件")
	private String email;

	/**
	 * QQ
	 */
	private String qq;

	/**
	 * 证件类型
	 */
	private CertTypeEnum certType;

	/**
	 * 证件号码
	 */
	private String certNo;

	/**
	 * 电子邮件是否验证
	 */
	private boolean emailValidate;

	/**
	 * QQ号是否验证
	 */
	private boolean qqValidate;

	/**
	 * 实名信息修改时间
	 */
	private Date gmtChangeIdentity;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 生日
	 */
	private Date birthday;

	public String getOneAuthId() {
		return oneAuthId;
	}

	public void setOneAuthId(String oneAuthId) {
		this.oneAuthId = oneAuthId;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public OneAuthNameTypeEnum getAuthNameType() {
		return authNameType;
	}

	public void setAuthNameType(OneAuthNameTypeEnum authNameType) {
		this.authNameType = authNameType;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public boolean isCellValidate() {
		return cellValidate;
	}

	public void setCellValidate(boolean cellValidate) {
		this.cellValidate = cellValidate;
	}

	public String getRegisterFromUserId() {
		return registerFromUserId;
	}

	public void setRegisterFromUserId(String registerFromUserId) {
		this.registerFromUserId = registerFromUserId;
	}

	public String getRegisterFromTypeCode() {
		return registerFromTypeCode;
	}

	public void setRegisterFromTypeCode(String registerFromTypeCode) {
		this.registerFromTypeCode = registerFromTypeCode;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getSubDomain() {
		return subDomain;
	}

	public void setSubDomain(String subDomain) {
		this.subDomain = subDomain;
	}

	public String getRegisterIp() {
		return registerIp;
	}

	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

	public String getDefaultUserId() {
		return defaultUserId;
	}

	public void setDefaultUserId(String defaultUserId) {
		this.defaultUserId = defaultUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public boolean isCanLogin() {
		return canLogin;
	}

	public void setCanLogin(boolean canLogin) {
		this.canLogin = canLogin;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	/**
	 * 是否空登录密码
	 * 
	 * @return
	 */
	public boolean ifEmptyLoginPassword() {
		return CifHelper.isEmptyPassword(this.loginPassword);
	}

	/**
	 * 是否空账户密码
	 * 
	 * @return
	 */
	public boolean ifEmptyAccountPassword() {
		return CifHelper.isEmptyPassword(this.accountPassword);
	}

	public String acquireUserId() {
		// TODO Auto-generated method stub
		return this.oneAuthId;
	}

	public String acquireUserName() {
		// TODO Auto-generated method stub
		return this.authName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public CertTypeEnum getCertType() {
		return certType;
	}

	public void setCertType(CertTypeEnum certType) {
		this.certType = certType;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public boolean isEmailValidate() {
		return emailValidate;
	}

	public void setEmailValidate(boolean emailValidate) {
		this.emailValidate = emailValidate;
	}

	public boolean isQqValidate() {
		return qqValidate;
	}

	public void setQqValidate(boolean qqValidate) {
		this.qqValidate = qqValidate;
	}

	public Date getGmtChangeIdentity() {
		return gmtChangeIdentity;
	}

	public void setGmtChangeIdentity(Date gmtChangeIdentity) {
		this.gmtChangeIdentity = gmtChangeIdentity;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
