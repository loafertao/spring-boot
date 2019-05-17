package cn.kgc.boot.controller;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import cn.kgc.boot.base.controller.BaseController;
import cn.kgc.boot.beans.entity.User;
import cn.kgc.boot.beans.vo.Page;
import cn.kgc.boot.service.UserService;

@Controller("userController")
@RequestMapping("/user")
public class UserController extends BaseController{
	@Resource(name = "userService")
	private UserService userService;

	/**
	 * *分页查询用户信息
	 * @return
	 */
	@RequestMapping(value = "/list" ,method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView getListUser(Integer pageNum,Integer pageSize) throws Exception{
		//封装page对象
		Page<User>  page = new Page<User>(pageNum, pageSize);
		page = userService.getUserListByPage(page);
		
		return new ModelAndView("user/user_list","page",page);
	}
	/**
	 * 加载用户添加页面
	 * @param user
	 * @throws Exception
	 */
	@RequestMapping(value = "/add",method = RequestMethod.GET)
	public String addUserList() {
		return "user/user_add";
	}
	/**
	 * 添加用户信息
	 * @param user
	 * @throws Exception
	 */
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String addUser(User user) throws Exception{
		if (user.getUserName()!= null&&!"".equals(user.getUserName().trim())
				&&user.getGender()!= null&&!"".equals(user.getGender().trim()) ) {
			//开始添加用户
			boolean flag = userService.addUsers(user);
			if (flag) {
				return "redirect:list";
			}else {
				return "redirect:add";
			}
		}
		return "redirect:add";
	}
	
	/**
	 **通过用户所携带的主键查询所对应的用户信息
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/update",method = RequestMethod.GET)
	public ModelAndView updateUserId(User user) throws Exception{
		user = userService.getUserById(user.getUserId());
		return new ModelAndView("user/user_update","user",user);
	}
	
	/**
	 **修改用户信息
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String updateUser(User user) throws Exception {
			//开始修改
			boolean flag = userService.updateUser(user);
			if (flag) {
				return "redirect:list";
			}else {
				return "redirect:update";
			}
	}
	/**
	 * 通过用户所携带的主键删除用户信息
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/delete",method = RequestMethod.GET)
	public String deleteUser(Long userId)throws Exception{
		userService.deleteUser(userId);
		 return "redirect:list";
	}
}
