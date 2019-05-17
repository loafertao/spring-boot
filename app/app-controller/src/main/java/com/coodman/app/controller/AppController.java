package com.coodman.app.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.coodman.app.base.controller.BaseController;
import com.coodman.app.beans.entity.AppInfo;
import com.coodman.app.beans.entity.Developer;
import com.coodman.app.beans.entity.Version;
import com.coodman.app.beans.vo.Page;
import com.coodman.app.service.AppService;

/**
 * <b>app信息控制层</b>
 * @author Coodman
 * @version 1.0 2019-05-09
 * @since 2019-05-09
 */
@Controller("appController")
@RequestMapping("/app")
public class AppController extends BaseController{
	@Resource(name = "appServiceImpl")
	private AppService appService;
	/**
	 ** 通过分页查询获得APP信息列表
	 * @param pageNum
	 * @param pageSize
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView getAppInfo(Integer pageNum,Integer pageSize) throws Exception {
		//使用当前页面pageNum和没有显示的条数pageSize封装page对象
		Page<AppInfo> page = new Page<AppInfo>(pageNum, pageSize);
		Developer dev = (Developer) session.getAttribute("dev");
		//使用业务层进行分页查询
		page = appService.findAppListByPage(page,dev);
		return new ModelAndView("dev/list","page" ,page);
	}
	
	/**
	 * 获得app版本信息列表
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/vlist",method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView getVersionInfo(Integer pageNum,Integer pageSize)throws Exception{
		Page<Version> page = new Page<Version>(pageNum, pageSize);
		page = appService.getListVersionInfo(page);
		return new ModelAndView("dev/version_list","page" ,page);
	}
	
}
