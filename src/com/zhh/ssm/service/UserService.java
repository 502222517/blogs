/**   
 * @Title: UserService.java 
 * @Description: TODO
 * @author zhh
 * @date 2016年1月4日 下午4:29:33 
 * @version V1.0   
 */
package com.zhh.ssm.service;

import com.zhh.ssm.po.base.User;

/** 
 * @Title: 用户 管理
 * @ClassName: UserService 
 * @Description: TODO 
 * @author zhh
 * @date 2016年1月4日 下午4:29:33  
 */
public interface UserService {

	/**
	 * 
	* @Title: findUserById 
	* @Description: 根据用户id获取用户信息
	* @param @param id
	* @param @return
	* @param @throws Exception    设定文件 
	* @return User    返回类型 
	* @throws
	 */
	public User findUserById(int id) throws Exception;
	 

	/** 
	* @Title: insertUser 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param user
	* @param @throws Exception    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	public int insertUser(User user) throws Exception;
	
	
	
}
