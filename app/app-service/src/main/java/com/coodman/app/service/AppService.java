package com.coodman.app.service;

import com.coodman.app.beans.entity.AppInfo;
import com.coodman.app.beans.entity.Developer;
import com.coodman.app.beans.entity.Version;
import com.coodman.app.beans.vo.Page;

/**
 * <b>app信息业务层接口</b>
 * @author Coodman
 * @version 1.0 2019-05-09
 * @since 2019-05-09
 */
public interface AppService {
	/**
	 * *分页查询APP信息
	 * @param paramMap
	 * @return
	 * @throws Exception
	 */
	public Page<AppInfo> findAppListByPage(Page<AppInfo> page, Developer dev)throws Exception;
	/**
	 * *分页查询版本列表信息
	 * @param page
	 * @return
	 */
	public Page<Version> getListVersionInfo(Page<Version> page);

}
