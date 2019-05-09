package com.coodman.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * <b>开发者控制平台<b>
 * @author Admin
 * @since 2019-05-09
 */
import com.coodman.app.base.controller.BaseController;
@Controller("devController")
@RequestMapping("/dev")
public class DevController extends BaseController{
	
	/**
	 * <b>后台管理者登录页面<b>
	 * @return dev/dev_login
	 * @since 2019-05-09
	 */
	@RequestMapping(value = "/devLogin",method=RequestMethod.GET)
	public String getLoginForm() throws Exception{
		return "dev/dev_login";
	}

}
