package com.coodman.app.dao;

import java.util.List;
import java.util.Map;

import com.coodman.app.beans.entity.AppInfo;
import com.coodman.app.beans.entity.Version;

/**
 * <b>app信息持久层接口</b>
 * @author Coodman
 * @version 1.0 2019-05-09
 * @since 2019-05-09
 */
public interface AppDao {

	public List<AppInfo> findAppListByPageQuery(Map<String, Object> paramMap);

	public List<Version> findVersionByPage(Map<String, Object> paramMap);

	public List<Version> findAllVersion();

}
