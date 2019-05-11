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
	 * <b>使用开发者编号查找对应的开发者信息</b>
	 * @param devNo
	 * @return Developer
	 * @throws Exception
	 */
	public Developer getByDevNo(String devNo) throws Exception;

	/**
	 * 保存开发者信息
	 * @param dev
	 * @return Developer
	 * @throws Exception
	 */
	public Developer saveDevInfo(Developer dev) throws Exception;
	
	
}
