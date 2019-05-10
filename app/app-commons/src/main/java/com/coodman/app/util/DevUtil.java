package com.coodman.app.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DevUtil {
	/**
	 * 利用当前时间生成编号
	 * @param date
	 * @return
	 * @throws Exception
	 */
	
	public static String createDevNo() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String dateStr = dateFormat.format(new Date());
		String memberNo = "App" + dateStr;
		return memberNo;
	}
	
}
