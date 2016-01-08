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
		this.status=0;
	}
	
	private int status;
	
	private String msg;
	
	private Map<String, Object> data;
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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
