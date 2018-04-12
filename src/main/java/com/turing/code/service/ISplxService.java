/**  
 * @标题: ISplxService.java
 * @路径: com.turing.code.service
 * @描述: TODO(用一句话描述该文件做什么)
 * @作者: 郎国峰
 * @时间: 2018年3月18日 下午8:08:10
 * @version V1.0  
 */ 
package com.turing.code.service;

import java.util.List;

import com.turing.code.entity.CodeShangpinleixing;

/**  
 * 标题: ISplxService.java
 * 路径: com.turing.code.service
 * 描述: 商品类型的模型层接口
 * 作者: 郎国峰
 * 时间: 2018年3月18日 下午8:08:10
 * 版本: @version V1.0  
 */
public interface ISplxService {

	/**   
	 * @方法名: queryAll   
	 * @描述: 查询所有的商品类型
	 * @作者: 郎国峰
	 * @时间: 2018年3月18日 下午8:14:26
	 * @return	         
	 */  
	List<CodeShangpinleixing> queryAll();
	
}
