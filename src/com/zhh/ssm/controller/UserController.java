/**   
 * @Title: UserController.java 
 * @Description: TODO
 * @author zhh
 * @date 2016年1月6日 下午4:43:17 
 * @version V1.0   
 */
package com.zhh.ssm.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhh.ssm.po.JSONObject;
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
	@ResponseBody
	public JSONObject  getUser(HttpServletRequest request, HttpServletResponse response
			,@PathVariable("id") Integer id) throws Exception{
		
		JSONObject json= new JSONObject();
		
		try {
			User user= userServiceImpl.findUserById(id);
			json.put("user",user);
			json.setStatus(0);
			
		} catch (Exception e) {
			json.setStatus(-1);
			json.setMsg(e.getMessage());
		}
		 
		return json;
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
	@ResponseBody
	public  JSONObject  register(User user){
		
		JSONObject jsonData=new JSONObject();
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
	public @ResponseBody JSONObject login(HttpSession session,String username,String password){
		JSONObject json=new JSONObject();
		
		try {
			User user= userServiceImpl.findUserById(1);
			json.setStatus(0);
			json.put("user",user);
			
			session.setAttribute("user",user);
			
		} catch (Exception e) {
			json.setStatus(-1);
			json.setMsg(e.getMessage());
		}
		
		return json;
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
	@ResponseBody
	public  JSONObject logout(HttpServletRequest request, HttpServletResponse response,HttpSession session){
		JSONObject json=new JSONObject();
		
		session.removeAttribute("user");
		
		
		
		
		return json;
	}
	
	
	
	
	
	

}
