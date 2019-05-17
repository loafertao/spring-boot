package cn.kgc.boot.beans.entity;

import java.io.Serializable;
/**
 * *用户实体类
 * @author huangtao
 *
 */
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long userId;
	private String userName;
	private String gender;
	private String cellphone;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	
	
	

}
