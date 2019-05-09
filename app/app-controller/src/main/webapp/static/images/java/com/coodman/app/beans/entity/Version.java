package com.coodman.app.beans.entity;

import java.io.Serializable;
/*
 * app版本实体类
 */
import java.util.Date;
public class Version implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long versionId;
	private AppInfo appInfo;
	private String apkName;
	private String supportRom;
	private String softwareSize;
	private String downloadLink;
	private Dictionary examine;					// 审核状态
	private Dictionary status;					// app状态
	private Admin checker;						// 审核人
	private Date createDate;
	private Date updateDate;
	public Long getVersionId() {
		return versionId;
	}
	public void setVersionId(Long versionId) {
		this.versionId = versionId;
	}
	public AppInfo getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(AppInfo appInfo) {
		this.appInfo = appInfo;
	}
	public String getApkName() {
		return apkName;
	}
	public void setApkName(String apkName) {
		this.apkName = apkName;
	}
	public String getSupportRom() {
		return supportRom;
	}
	public void setSupportRom(String supportRom) {
		this.supportRom = supportRom;
	}
	public String getSoftwareSize() {
		return softwareSize;
	}
	public void setSoftwareSize(String softwareSize) {
		this.softwareSize = softwareSize;
	}
	public String getDownloadLink() {
		return downloadLink;
	}
	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
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
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}
