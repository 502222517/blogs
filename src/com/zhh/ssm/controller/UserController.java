/**   
 * @Title: UserController.java 
 * @Description: TODO
 * @author zhh
 * @date 2016年1月6日 下午4:43:17 
 * @version V1.0   
 */
package com.zhh.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhh.ssm.po.JSONData;
import com.zhh.ssm.po.base.User;
import com.zhh.ssm.service.impl.UserServiceImpl;

/** 
 * @Title: UserController 
 * @ClassName: UserController 
 * @Description: TODO 
 * @author zhh
 * @date 2016年1月6日 下午4:43:17  
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private  UserServiceImpl userServiceImpl;
	
	/**
	 * 
	* @Title: 获取用户信息
	* @Description: user/1
	* @param @param id  用户id
	* @param @return
	* @param @throws Exception    设定文件 
	* @return User    返回类型 
	* @throws
	 */
	@RequestMapping(value="/{id}",method={RequestMethod.GET})
	public @ResponseBody JSONData  getUser(@PathVariable("id") Integer id) throws Exception{
		JSONData jsonData=new JSONData();
		
		try {
			User user= userServiceImpl.findUserById(id);
			jsonData.setData(user);
			jsonData.setStatus(0);
			
		} catch (Exception e) {
			jsonData.setStatus(-1);
			jsonData.setMsg(e.getMessage());
		}
		 
		return jsonData;
	}
	
	/**
	 * 
	* @Title: register 
	* @Description: 注册用户
	* @param @return
	* @param @throws Exception    设定文件 
	* @return JSONData    返回类型 
	* @throws
	 */
	@RequestMapping(value="/register",method={RequestMethod.POST})
	public @ResponseBody JSONData  register(User user){
		
		JSONData jsonData=new JSONData();
		try {
			int count= userServiceImpl.insertUser(user);
			jsonData.setStatus(count);
			
		} catch (Exception e) {
			jsonData.setStatus(-1);
			jsonData.setMsg(e.getMessage());
		}
		return jsonData;
	}
	/**
	 * 
	* @Title: login 
	* @Description: 登录
	* @param @param username
	* @param @param password
	* @param @return    设定文件 
	* @return JSONData    返回类型 
	* @throws
	 */
	@RequestMapping(value="/login",method={RequestMethod.POST})
	public @ResponseBody JSONData login(String username,String password){
		JSONData jsonData=new JSONData();
		
		try {
			User user= userServiceImpl.findUserById(1);
			jsonData.setStatus(0);
			jsonData.setData(user);
			
		} catch (Exception e) {
			jsonData.setStatus(-1);
			jsonData.setMsg(e.getMessage());
		}
		
		return jsonData;
	}
	
	/**
	 * 
	* @Title: logout 
	* @Description: 退出
	* @param @return    设定文件 
	* @return JSONData    返回类型 
	* @throws
	 */
	@RequestMapping(value="/logout",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody JSONData logout(){
		
		return null;
	}
	
	
	
	
	
	

}
