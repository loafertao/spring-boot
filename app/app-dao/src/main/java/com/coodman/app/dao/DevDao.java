package com.coodman.app.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.coodman.app.beans.entity.Developer;

/**
 * <b>开发者平台持久层接口</b>
 * @author Coodman
 * @version 1.0 2019-05-09
 * @since 2019-05-09
 */
@Repository("devDao")
public interface DevDao {
	/**
	 * <b>使用开发者编号查找对应的开发者信息</b>
	 * @param devNo
	 * @return Developer
	 * @throws Exception
	 */
	public List<Developer> findByDevNoList(Map<String, Object> param) throws Exception;
	/**
	 * 保存开发者信息
	 * @param dev
	 * @return Developer
	 * @throws Exception
	 */
	public void saveDevInfo(Developer dev);

	public void updateDev(Developer dev);


}
