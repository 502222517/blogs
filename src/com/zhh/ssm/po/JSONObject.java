/**   
 * @Title: JSONObject.java 
 * @Description: TODO
 * @author zhh
 * @date 2016年1月8日 上午11:11:40 
 * @version V1.0   
 */
package com.zhh.ssm.po;

import java.util.HashMap;
import java.util.Map;

/** 
 * @Title: JSONObject 
 * @ClassName: JSONObject 
 * @Description: TODO 
 * @author zhh
 * @date 2016年1月8日 上午11:11:40  
 */
public class JSONObject {
	
	public JSONObject(){
		this.data= new HashMap<String, Object>();
		this.setCode(0);
	}
	
	private int code;
	
	private String msg;
	
	private Map<String, Object> data;
	
	/** 
	* @return code 
	*/
	public int getCode() {
		return code;
	}

	/** 
	* @param code 要设置的 code 
	*/
	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Map<String, Object> getData(){
		return data;
	}
	
	public void put(String key, Object value){
		data.put(key, value);
	}
	
	public void remove(String key){
		data.remove(key);
	}
	
	public void clear(){
		data.clear();
	}

	
}
