package com.coodman.app.service;

import com.coodman.app.beans.entity.Developer;

/**
 * <b>开发者平台业务层接口</b>
 * @author Coodman
 * @version 1.0 2019-05-09
 * @since 2019-05-09
 */

public interface DevService {

	/**
	 * 开发者进行注册保存
	 * @param dev
	 * @return boolean
	 */
	public boolean saveDevInfo(Developer dev);

	public Developer loginDev(Developer dev);
	
	
}
