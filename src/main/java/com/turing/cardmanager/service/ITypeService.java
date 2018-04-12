/**  
 * @标题: ITypeService.java
 * @路径: com.turing.cardmanager.service
 * @描述: TODO(用一句话描述该文件做什么)
 * @作者: 郎国峰
 * @时间: 2018年4月12日 下午6:30:29
 * @version V1.0  
 */ 
package com.turing.cardmanager.service;

import java.util.List;

import com.turing.cardmanager.entity.CardType;

/**  
 * 标题: ITypeService.java
 * 路径: com.turing.cardmanager.service
 * 描述: 会员卡类型设置模型层接口
 * 作者: 郎国峰
 * 时间: 2018年4月12日 下午6:30:29
 * 版本: @version V1.0  
 */
public interface ITypeService {

	/**   
	 * @方法名: queryAll   
	 * @描述: 查询所有的会员卡类型
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午6:37:37
	 * @return	         
	 */  
	List<CardType> queryAll();

	/**   
	 * @方法名: queryOneById   
	 * @描述: 根据id查询一条会员卡类型信息
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午7:39:36
	 * @param id
	 * @return	         
	 */  
	CardType queryOneById(String id);

	/**   
	 * @方法名: edit   
	 * @描述: 根据id修改一条会员卡类型
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午8:10:04
	 * @param cardType	         
	 */  
	void edit(CardType cardType);

	/**   
	 * @方法名: save   
	 * @描述: 添加一条会员卡类型数据
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午8:12:06
	 * @param cardType	         
	 */  
	void save(CardType cardType);

	/**   
	 * @方法名: delete   
	 * @描述: 根据id删除一些数据
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午8:32:43
	 * @param ids	         
	 */  
	void delete(String[] ids);

}
