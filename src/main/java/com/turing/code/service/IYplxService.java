/**  
 * @标题: IYplxService.java
 * @路径: com.turing.code.service
 * @描述: TODO(用一句话描述该文件做什么)
 * @作者: 郎国峰
 * @时间: 2018年4月12日 下午3:23:08
 * @version V1.0  
 */ 
package com.turing.code.service;

import java.util.List;

import com.turing.code.entity.CodeYongpinleixing;

/**  
 * 标题: IYplxService.java
 * 路径: com.turing.code.service
 * 描述: 用品类型模型层接口
 * 作者: 郎国峰
 * 时间: 2018年4月12日 下午3:23:08
 * 版本: @version V1.0  
 */
public interface IYplxService {

	/**   
	 * @方法名: queryAll   
	 * @描述:
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午3:28:54
	 * @return	         
	 */  
	List<CodeYongpinleixing> queryAll();

	/**   
	 * @方法名: save   
	 * @描述: 添加保存一条用品类型数据
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午4:23:50
	 * @param yplx	         
	 */  
	void save(CodeYongpinleixing yplx);

	/**   
	 * @方法名: queryOneById   
	 * @描述: 根据id查询一条用品类型数据
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午4:34:02
	 * @param id
	 * @return	         
	 */  
	CodeYongpinleixing queryOneById(String id);

	/**   
	 * @方法名: edit   
	 * @描述: 用品类型修改保存方法
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午4:47:14
	 * @param yplx	         
	 */  
	void edit(CodeYongpinleixing yplx);

	/**   
	 * @方法名: deleteById   
	 * @描述: 根据用品类型的id 进行数据删除
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午4:54:24
	 * @param ids	         
	 */  
	void deleteById(String[] ids);

}
