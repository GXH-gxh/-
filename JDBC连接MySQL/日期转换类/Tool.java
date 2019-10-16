package com.uilts;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author 23785
 *2018年12月25日
 */
public class Tool {
	/**
	 * 用于把字符串转换成日期类型
	 * @param datestr 要转换的字符串
	 * @param fom	转换成什么格式
	 * @return	时间类型
	 */
	public static Date convertDateToStr(String datestr,String fom) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(fom);
			return sdf.parse(datestr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
