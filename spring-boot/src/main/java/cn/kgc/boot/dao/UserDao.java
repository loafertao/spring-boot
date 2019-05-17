package cn.kgc.boot.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.kgc.boot.beans.entity.User;
@Repository("userDao")
public interface UserDao {

	/**
	 * 分页查询持久层接口
	 * @param paramMap
	 * @return
	 */
	public	List<User> findListUserByPageQuery(Map<String, Object> paramMap) throws Exception;
 	/**
	 * 添加用户信息
	 * @param user
	 * @throws Exception
	 */
	public boolean addUsers(User user) throws Exception;
	
	/**
	 **通过用户所携带的主键查询用户信息
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User getUserById(Map<String, Object> map) throws Exception;
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
	public boolean updateUser(User user) throws Exception;
	/**
	 * 查询所有用户信息
	 * @return
	 */
	public List<User> findListUser();

}
