package com.coodman.app.beans.entity;

import java.io.Serializable;
import java.util.Date;

public class AppInfo implements Serializable {

	/**
	 * APP信息实体类
	 */
	private static final long serialVersionUID = 1L;
	
	private Long appId;						// 主键
	private String appName;					// app名称
	private Dev dev;						// 开发者
	private Category category;				// 所属类别
	private String logo;					// logo地址
	private String appInfo;					// 简介
	private Dictionary platform;			// 所属平台
	private Dictionary examine;				// 审核状态
	private Dictionary status;				// app状态
	private Admin checker;					// 审核人
	private Date createDate;				// 创建时间
	public Long getAppId() {
		return appId;
	}
	public void setAppId(Long appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public Dev getDev() {
		return dev;
	}
	public void setDev(Dev dev) {
		this.dev = dev;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}
	public Dictionary getPlatform() {
		return platform;
	}
	public void setPlatform(Dictionary platform) {
		this.platform = platform;
	}
	public Dictionary getExamine() {
		return examine;
	}
	public void setExamine(Dictionary examine) {
		this.examine = examine;
	}
	public Dictionary getStatus() {
		return status;
	}
	public void setStatus(Dictionary status) {
		this.status = status;
	}
	public Admin getChecker() {
		return checker;
	}
	public void setChecker(Admin checker) {
		this.checker = checker;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
