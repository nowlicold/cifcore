/**
 * 
 */
package com.yuan.cifcore.common.model;

import com.bench.common.model.BaseModel;
import com.yuan.cifcore.common.model.enums.CertTypeEnum;
import com.yuan.cifcore.common.model.enums.UserSexEnum;
import com.yuan.cifcore.common.model.enums.UserStatusEnum;
import com.yuan.cifcore.common.model.helper.CifHelper;

import java.util.Date;

/**
 * 会员信息
 * 
 * @author chenbug 2009-10-15 下午12:10:55
 * 
 */
public class User extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3389503182911624614L;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 登陆名
	 */
	private String loginName;

	/**
	 * 登陆密码
	 */
	private String loginPassword;

	/**
	 * 真实姓名
	 */
	private String realName;

	/**
	 * 状态
	 */
	private UserStatusEnum status;

	/**
	 * 电子邮件
	 */
	private String email;

	/**
	 * QQ
	 */
	private String qq;

	/**
	 * 是否可登陆
	 */
	private boolean canLogin;

	/**
	 * 证件类型
	 */
	private CertTypeEnum certType;

	/**
	 * 证件号码
	 */
	private String certNo;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 电子邮件是否验证
	 */
	private boolean emailValidate;

	/**
	 * QQ号是否验证
	 */
	private boolean qqValidate;

	/**
	 * 手机号
	 */
	private String cell;

	/**
	 * 手机号是否验证
	 */
	private boolean cellValidate;

	/**
	 * 账户密码
	 */
	private String accountPassword;

	/**
	 * 昵称
	 */
	private String nickName;

	/**
	 * 会员类型代码
	 */
	private String userTypeName;

	/**
	 * 用户所属域代码
	 */
	private String domain;

	/**
	 * 用户所属子域代码
	 */
	private String subDomain;

	/**
	 * 实名信息修改时间
	 */
	private Date gmtChangeIdentity;

	/**
	 * 性别
	 */
	private UserSexEnum sex;

	/**
	 * 生日
	 */
	private Date birthday;

	/**
	 * 单登录ID
	 */
	private String oneAuthId;

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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public UserStatusEnum getStatus() {
		return status;
	}

	public void setStatus(UserStatusEnum status) {
		this.status = status;
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

	public boolean isCanLogin() {
		return canLogin;
	}

	public void setCanLogin(boolean canLogin) {
		this.canLogin = canLogin;
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

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getUserTypeName() {
		return userTypeName;
	}

	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
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

	public Date getGmtChangeIdentity() {
		return gmtChangeIdentity;
	}

	public void setGmtChangeIdentity(Date gmtChangeIdentity) {
		this.gmtChangeIdentity = gmtChangeIdentity;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getOneAuthId() {
		return oneAuthId;
	}

	public void setOneAuthId(String oneAuthId) {
		this.oneAuthId = oneAuthId;
	}

	public String acquireUserId() {
		// TODO Auto-generated method stub
		return this.userId;
	}

	public String acquireUserName() {
		// TODO Auto-generated method stub
		return this.loginName;
	}

	/**
	 * @return Returns the sex.
	 */
	public UserSexEnum getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            The sex to set.
	 */
	public void setSex(UserSexEnum sex) {
		this.sex = sex;
	}

}
