package com.coodman.app.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coodman.app.beans.entity.AppInfo;
import com.coodman.app.beans.entity.Developer;
import com.coodman.app.beans.entity.Version;
import com.coodman.app.beans.vo.Page;
import com.coodman.app.dao.AppDao;
import com.coodman.app.service.AppService;

/**
 * <b>app信息业务层实现类</b>
 * @author Coodman
 * @version 1.0 2019-05-09
 * @since 2019-05-09
 */
@Service("appServiceImpl")
@Transactional
public class AppServiceImpl implements AppService{
	@Resource(name = "appDao")
	private AppDao appDao;
	/**
	 * *分页查询APP信息
	 * @param paramMap
	 * @return
	 * @throws Exception
	 */
	public Page<AppInfo> findAppListByPage(Page<AppInfo> page, Developer dev) throws Exception {
		//封装分页信息
		Map< String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("beginIndex", (page.getPageNum() - 1) * page.getPageSize());
		paramMap.put("size", page.getPageSize());
		paramMap.put("dev", dev);
		//开始分页查询
		List<AppInfo> appInfoList = appDao.findAppListByPageQuery(paramMap);
		//查询总数量
		Integer totalSize = appDao.findAppListByPageQuery(paramMap).size();
		//总页数
		Integer totalPage = (totalSize % page.getPageSize() == 0) ? totalSize / page.getPageSize() : (totalSize / page.getPageSize() + 1);
		//将结果放入分页对象
		page.setList(appInfoList);
		page.setTotalSize(totalSize);
		page.setTotalPage(totalPage);
		return page;
	
	}
	/**
	 * *分页查询版本列表信息
	 * @param page
	 * @return
	 */
	public Page<Version> getListVersionInfo(Page<Version> page) {
		//封装分页信息
				Map< String, Object> paramMap = new HashMap<String, Object>();
				paramMap.put("beginIndex", (page.getPageNum() - 1) * page.getPageSize());
				paramMap.put("size", page.getPageSize());
				//开始分页查询
				List<Version> appInfoList = appDao.findVersionByPage(paramMap);
				//查询总数量
				List<Version> versionList = appDao.findAllVersion();
				Integer totalSize = versionList.size();
				//总页数
				Integer totalPage = (totalSize % page.getPageSize() == 0) ? totalSize / page.getPageSize() : (totalSize / page.getPageSize() + 1);
				//将结果放入分页对象
				page.setList(appInfoList);
				page.setTotalSize(totalSize);
				page.setTotalPage(totalPage);
		return page;
	}

}
