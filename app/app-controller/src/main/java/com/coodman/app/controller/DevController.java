package com.coodman.app.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * <b>开发者控制平台<b>
 * @author Admin
 * @since 2019-05-09
 */
import com.coodman.app.base.controller.BaseController;
import com.coodman.app.beans.entity.Developer;
import com.coodman.app.service.DevService;
@Controller("devController")
@RequestMapping("/dev")
public class DevController extends BaseController{
	@Resource(name = "devService")
	private DevService devService;
	/**
	 * <b>App开发者注册页面<b>
	 * @return
	 */
	@RequestMapping(value = "/register",method = RequestMethod.GET)
	public String registerForm() {
		return "dev/dev_register";
	}
	/**
	 * 开发者进行注册
	 * @param dev
	 * @return
	 */
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public String devRegister(Developer dev) {
		boolean flag = devService.saveDevInfo(dev);
		if (flag) {
			return "redirect:devLogin";
		}else {
			return "redirect:register";
		}
		
	}
	
	
	/**
	 * <b>APP开发者登录页面<b>
	 * @return dev/dev_login
	 * @since 2019-05-09
	 */
	@RequestMapping(value = "/devLogin",method=RequestMethod.GET)
	public String getLoginForm(){
		return "dev/dev_login";
	}
	/**
	 * 开发者进行登录
	 * @param dev
	 * @return 
	 */
	@RequestMapping(value = "/devLogin" ,method = RequestMethod.POST)
	public String loginDev(Developer dev) {
		//判断此时的编号和密码是否为空
		if (dev.getDevNo() != null && !"".equals(dev.getDevNo().trim()) && 
				dev.getPassword() !=  null && !"".equals(dev.getPassword().trim())) {
			//进行登录
			dev = devService.loginDev(dev);
			if (dev != null) {
				//登录成功，绑定session对象
				session.setAttribute("dev", dev);
				//重定向到列表页面
				return "redirect:list";
				
			}
		}
		return "redirect:devLogin";
	}
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public String devList() {
		return "dev/dev_list";
	}


}
