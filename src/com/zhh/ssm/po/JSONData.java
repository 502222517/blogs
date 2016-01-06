/**   
 * @Title: JSONData.java 
 * @Description: TODO
 * @author zhh
 * @date 2016年1月6日 下午4:55:43 
 * @version V1.0   
 */
package com.zhh.ssm.po;

/** 
 * @Title: JSONData 
 * @ClassName: JSONData 
 * @Description: TODO 
 * @author zhh
 * @date 2016年1月6日 下午4:55:43  
 */
public class JSONData {
	
	
	private int status;
	
	private String msg;
	
	private Object data;

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

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	

}
