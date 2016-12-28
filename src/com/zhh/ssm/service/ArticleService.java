/**   
 * @Title: ArticleService.java 
 * @Description: TODO
 * @author zhh
 * @date 2016年6月2日 下午3:37:13 
 * @version V1.0   
 */
package com.zhh.ssm.service;

import java.util.List;

import com.zhh.ssm.po.base.Article;
import com.zhh.ssm.po.base.ArticleExample;

/** 
 * @Title: 文章管理 
 * @ClassName: ArticleService 
 * @Description: TODO 
 * @author zhh
 * @date 2016年6月2日 下午3:37:13  
 */
public interface ArticleService {
	
	/**
	* @Title: findArticleById 
	* @Description: 根据id获取文章
	* @param @param id
	* @param @return
	* @param @throws Exception    设定文件 
	* @return Article    返回类型 
	* @throws
	 */
	public Article findArticleById(int id) throws Exception;
	
	/**
	 * 
	* @Title: 插入文章
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param article
	* @param @return
	* @param @throws Exception    设定文件 
	* @return int    返回类型 
	* @throws
	*/
	public int insertArticle(Article article) throws Exception;
	
	/**
	* @Title: 更新文章
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param article
	* @param @return
	* @param @throws Exception    设定文件 
	* @return int    返回类型 
	* @throws
	*/
	public int updateArticle(Article article) throws Exception;
	
	/**
	* @Title: 删除文章 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param article
	* @param @return
	* @param @throws Exception    设定文件 
	* @return int    返回类型 
	* @throws
	*/
	public int deleteArticle(int id) throws Exception;
	
	
	/**
	 * 获取文章列表
	* @Title: getList 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param article
	* @param @return
	* @param @throws Exception    设定文件 
	* @return List<ArticleExample>    返回类型 
	* @throws
	 */
	public List<ArticleExample> getList(ArticleExample article) throws Exception;
	
	

}
