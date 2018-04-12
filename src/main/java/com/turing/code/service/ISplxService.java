/**  
 * @标题: ISplxService.java
 * @路径: com.turing.code.service
 * @描述: TODO(用一句话描述该文件做什么)
 * @作者: 郎国峰
 * @时间: 2018年4月12日 下午1:37:16
 * @version V1.0  
 */ 
package com.turing.code.service;

import java.util.List;

import com.turing.code.entity.CodeShangpinleixing;

/**  
 * 标题: ISplxService.java
 * 路径: com.turing.code.service
 * 描述: 商品类型模型层接口
 * 作者: 郎国峰
 * 时间: 2018年4月12日 下午1:37:16
 * 版本: @version V1.0  
 */
public interface ISplxService {

	/**   
	 * @方法名: queryAll   
	 * @描述: 查询所有的商品类型
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午1:42:42
	 * @return	         
	 */  
	List<CodeShangpinleixing> queryAll();

	/**   
	 * @方法名: save   
	 * @描述: 添加一条商品类型数据
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午2:38:16
	 * @param splx	         
	 */  
	void save(CodeShangpinleixing splx);

	/**   
	 * @方法名: editpage   
	 * @描述: 根据id查询一条商品类型数据
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午2:49:11
	 * @param id
	 * @return	         
	 */  
	CodeShangpinleixing editpage(String id);

	/**   
	 * @方法名: edit   
	 * @描述: 修改一条商品类型数据
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午3:03:27
	 * @param splx	         
	 */  
	void edit(CodeShangpinleixing splx);

}
