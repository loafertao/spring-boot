package com.coodman.app.util;

public class DevUtil {
	/**
	 * <b>根据开发者主键生成对应的开发者编号</b>
	 * @param devId
	 * @return String
	 */
	public static String createDevNo(Long devId) {
		StringBuffer sb = new StringBuffer("APP");
		//判断此时的devNo是否够6位
		String no = String.valueOf(devId);
		while (no.length() != 6) {
			no = "0" + no; 
		}
		//生成最终的devNo信息
		return sb.append(no).toString();
	}
	
}
