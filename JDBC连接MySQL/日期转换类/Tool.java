package com.uilts;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author 23785
 *2018��12��25��
 */
public class Tool {
	/**
	 * ���ڰ��ַ���ת������������
	 * @param datestr Ҫת�����ַ���
	 * @param fom	ת����ʲô��ʽ
	 * @return	ʱ������
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
