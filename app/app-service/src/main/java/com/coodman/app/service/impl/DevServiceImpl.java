package com.coodman.app.service.impl;

import java.util.Date;

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
	 * 开发者进行注册保存
	 * @param dev
	 * @return boolean
	 */
	public boolean saveDevInfo(Developer dev) {
		//判断编号和密码是否为空
		if (dev.getDevNo() != null && !"".equals(dev.getDevNo().trim())
				&& dev.getPassword()!= null && !"".equals(dev.getPassword().trim())) {
			//判断当前编号是否存在
			Developer developerNo = devDao.findByDevNo(dev.getDevNo());
			if (developerNo == null) {
				//developerNo为空，可以注册，完善developer对象
				dev.setDevNo(dev.getDevNo());
				dev.setDevName(dev.getDevName());
				dev.setPassword(dev.getPassword());
				dev.setCellphone(dev.getCellphone());
				dev.setEmail(dev.getEmail());
				dev.setDevInfo(dev.getDevInfo());
				dev.setCreateDate(new Date());
				dev.setUpdateDate(new Date());
				//进行保存
				boolean flag = devDao.saveDev(dev);
				return flag;
			}
		}
		return false;
	}
	/**
	 * 开发者进行登录
	 * @param dev
	 * @return Developer
	 */
	public Developer loginDev(Developer dev) {
		dev = devDao.fingDevByQuery(dev);
		return dev;
	}

}
