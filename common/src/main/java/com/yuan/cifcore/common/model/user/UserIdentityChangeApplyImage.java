/**
 * 
 */
package com.yuan.cifcore.common.model.user;

import com.bench.common.model.BaseModel;
import com.yuan.cifcore.common.model.enums.UserIdentityChangeApplyImageTypeEnum;

import java.util.Date;

/**
 * 会员实名信息修改申请图片实体类
 * 
 * @author chengzi
 *
 * @version $Id: UserIdentityChangeApplyImage.java, v 0.1 2019年10月21日 下午7:59:51 chengzi Exp $
 */
public class UserIdentityChangeApplyImage extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2086558894507236755L;

	/**
	 * id
	 */
	private int id;

	/**
	 * 申请单id
	 */
	private int applyId;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 类型
	 */
	private UserIdentityChangeApplyImageTypeEnum type;

	/**
	 * 内容
	 */
	private byte[] content;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the applyId
	 */
	public int getApplyId() {
		return applyId;
	}

	/**
	 * @param applyId
	 *            the applyId to set
	 */
	public void setApplyId(int applyId) {
		this.applyId = applyId;
	}

	/**
	 * @return the gmtCreate
	 */
	public Date getGmtCreate() {
		return gmtCreate;
	}

	/**
	 * @param gmtCreate
	 *            the gmtCreate to set
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	/**
	 * @return the gmtModified
	 */
	public Date getGmtModified() {
		return gmtModified;
	}

	/**
	 * @param gmtModified
	 *            the gmtModified to set
	 */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	/**
	 * @return the type
	 */
	public UserIdentityChangeApplyImageTypeEnum getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(UserIdentityChangeApplyImageTypeEnum type) {
		this.type = type;
	}

	/**
	 * @return the content
	 */
	public byte[] getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(byte[] content) {
		this.content = content;
	}

}
