/**   
 * @Title: BaseSpringTest.java 
 * @Description: TODO
 * @author zhh
 * @date 2016年1月5日 上午11:03:29 
 * @version V1.0   
 */
package com.zhh.ssm.service.impl;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/** 
 * @Title: BaseSpringTest 
 * @ClassName: BaseSpringTest 
 * @Description: TODO 
 * @author zhh
 * @date 2016年1月5日 上午11:03:29  
 */


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations ={  
    "classpath:spring/applicationContext-*.xml",  
    "classpath:spring/springmvc.xml"  
})  

//添加注释@Transactional 回滚对数据库操作    
@TransactionConfiguration(transactionManager="transactionManager")
public class BaseSpringTest {
	
	
	
	

}
