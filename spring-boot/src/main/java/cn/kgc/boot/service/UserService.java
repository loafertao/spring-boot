package cn.kgc.boot.service;

import cn.kgc.boot.beans.entity.User;
import cn.kgc.boot.beans.vo.Page;

public interface UserService {
/**
 * *分页查询业务层接口
 * @param page
 * @return
 */
	public Page<User> getUserListByPage(Page<User> page)throws Exception;
	/**
	 * 添加用户信息
	 * @param user
	 * @return 
	 * @throws Exception
	 */
	public boolean addUsers(User user) throws Exception;
	/**
	 **通过用户所携带的主键进行修改用户信息
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User getUserById(Long userId) throws Exception;
	/**
	 * 通过用户所携带的主键删除用户信息
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public void deleteUser(Long userId) throws Exception;
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	public boolean updateUser(User user)throws Exception;
	
}
