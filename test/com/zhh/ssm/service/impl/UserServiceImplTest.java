/**   
 * @Title: UserServiceImplTest.java 
 * @Description: TODO
 * @author zhh
 * @date 2016年1月4日 下午4:48:20 
 * @version V1.0   
 */
package com.zhh.ssm.service.impl;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhh.ssm.po.base.User;
import com.zhh.ssm.service.UserService;

/** 
 * @Title: UserServiceImplTest 
 * @ClassName: UserServiceImplTest 
 * @Description: TODO 
 * @author zhh
 * @date 2016年1月4日 下午4:48:20  
 */

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations ={  
    "classpath:spring/applicationContext-dao.xml",
    "classpath:spring/applicationContext-service.xml",
    "classpath:spring/springmvc.xml"  
})
public class UserServiceImplTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private UserService userService;
	
	/** 
	* @Title: setUp 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @throws java.lang.Exception    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	@Before
	public void setUp() throws Exception {
		
		
	}

	/**
	 * Test method for {@link com.zhh.ssm.service.impl.UserServiceImpl#findUserById(int)}.
	 */
	@Test
	public void testFindUserById() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.zhh.ssm.service.impl.UserServiceImpl#insertUser(com.zhh.ssm.po.base.User)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsertUser() throws Exception {
		
	  User user=new User();	
	  
	  user.setUsername("502222517");
	  user.setPassword("52013145");
	  user.setNickname("测试用户");
	  user.setSex(1);
	  user.setTel("15270800382");
	  user.setEmail("502222517@qq.com");
	  
	  user.setCreatetime(new Date());
	  
	  int count=userService.insertUser(user);
	  
	  System.out.println("testInsertUser ==> "+count);
		 
	}

}
