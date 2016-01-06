/**   
 * @Title: UserService.java 
 * @Description: TODO
 * @author zhh
 * @date 2016年1月4日 下午4:36:17 
 * @version V1.0   
 */
package com.zhh.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhh.ssm.mapper.base.UserMapper;
import com.zhh.ssm.po.base.User;
import com.zhh.ssm.service.UserService;

/** 
 * @Title: UserService 
 * @ClassName: UserService 
 * @Description: TODO 
 * @author zhh
 * @date 2016年1月4日 下午4:36:17  
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	

	/* (非 Javadoc) 
	* <p>Title: findUserById</p> 
	* <p>Description: </p> 
	* @param id
	* @return
	* @throws Exception 
	* @see com.zhh.ssm.service.UserService#findUserById(int) 
	*/
	@Override
	public User findUserById(int id) throws Exception {
		
		return userMapper.selectByPrimaryKey(id);
	}

	/* (非 Javadoc) 
	* <p>Title: insertUser</p> 
	* <p>Description: </p> 
	* @param user
	* @throws Exception 
	* @see com.zhh.ssm.service.UserService#insertUser(com.zhh.ssm.po.base.UserExample) 
	*/
	@Override
	public int insertUser(User user) throws Exception {
		 
		 int count= userMapper.insert(user);
		 return count;
	}

}
