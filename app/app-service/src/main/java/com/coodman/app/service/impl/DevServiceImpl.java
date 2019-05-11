package com.coodman.app.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coodman.app.beans.entity.Developer;
import com.coodman.app.dao.DevDao;
import com.coodman.app.service.DevService;
import com.coodman.app.util.DevUtil;
import com.coodman.app.util.MD5Util;
/**
 * <b>开发者平台业务层实现类</b>
 * @author Coodman
 * @version 1.0 2019-05-09
 * @since 2019-05-09
 */
@Service("devService")
@Transactional
public class DevServiceImpl implements DevService {
	@Resource(name = "devDao")
	private DevDao devDao;
	/**
	 * <b>使用开发者编号查找对应的开发者信息</b>
	 * @param devNo
	 * @return Developer
	 * @throws Exception
	 */
	public Developer getByDevNo(String devNo) throws Exception {
		//封装查询参数map集合
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("devNo", devNo);
		//建查询的信息放入list集合
		List<Developer> devList = devDao.findByDevNoList(param);
		if (devList != null && devList.size()>0) {
			return devList.get(0);
		}
 		return null;
	}
	/**
	 * 保存开发者信息
	 * @param dev
	 * @return Developer
	 * @throws Exception
	 */
	public Developer saveDevInfo(Developer dev) throws Exception {
		//使用数据持久层保存数据
		devDao.saveDevInfo(dev);
		//根据主键生成对应的devNo信息
		String devNo = DevUtil.createDevNo(dev.getDevId());
		//将devNo重新设定，进行更改
		dev.setDevNo(devNo);
		devDao.updateDev(dev);
		return dev;
	}

}
