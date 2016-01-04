package com.zhh.ssm.converter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * @Title: 日期转换器 
 * @ClassName: DateConverter 
 * @Description: TODO 
 * @author zhh
 * @date 2015年12月30日 下午2:19:49
 */
public class DateConverter implements Converter<String,Date> {

	/* 
	* <p>Title: 实现将日期串转成日期类型(格式是yyyy-MM-dd HH:mm:ss)</p> 
	* <p>Description: </p> 
	* @param arg0
	* @return 
	* @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object) 
	*/
	@Override
	public Date convert(String source) {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			//转成直接返回
			return simpleDateFormat.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//如果参数绑定失败返回null
		return null;
	}

}
