package cn.kgc.boot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.kgc.boot.beans.entity.User;
import cn.kgc.boot.beans.vo.Page;
import cn.kgc.boot.dao.UserDao;
import cn.kgc.boot.service.UserService;
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	@Resource(name = "userDao")
	private UserDao userDao;
	/**
	 * 查询所有用户信息
	 * @return
	 */
	public List<User> findAllUsers() {
			return userDao.findListUser();
		}


	/**
	 * *分页查询业务层实现类
	 * @param page
	 * @return
	 */
	public Page<User> getUserListByPage(Page<User> page) throws Exception{
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("begin", (page.getPageNum()-1)*page.getPageSize());
		paramMap.put("size", page.getPageSize());
		//开始进行分页查询
		List<User> userList = userDao.findListUserByPageQuery(paramMap);
		//总数量
		Integer totalSize = userDao.findListUser().size();
		//总页数
		Integer totalPage =(totalSize % page.getPageSize() == 0)?totalSize / page.getPageSize() : (totalSize / page.getPageSize() + 1);
		page.setList(userList);
		page.setTotalSize(totalSize);
		page.setTotalPage(totalPage);
		return page;
	}

	/**
	 * 添加用户信息
	 * @param user
	 * @throws Exception
	 */
	public boolean addUsers(User user) throws Exception {
		return userDao.addUsers(user);
		
	}

	/**
	 **通过用户所携带的主键查询用户信息
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User getUserById(Long userId) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		User user = userDao.getUserById(map);
		return user;
	}

	/**
	 * 通过用户所携带的主键删除用户信息
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public void deleteUser(Long userId) throws Exception {
		userDao.deleteUser(userId);
		
	}
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	public boolean updateUser(User user) throws Exception {
		return userDao.updateUser(user);
	}

}
