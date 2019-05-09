package com.coodman.app.dao;

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

	public Developer findByDevNo(String devNo) ;

	public boolean saveDev(Developer dev);

	public Developer fingDevByQuery(Developer dev);


}
