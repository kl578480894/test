/**  
 * @标题: SplxServiceImpl.java
 * @路径: com.turing.code.service.impl
 * @描述: TODO(用一句话描述该文件做什么)
 * @作者: 郎国峰
 * @时间: 2018年3月18日 下午8:11:54
 * @version V1.0  
 */ 
package com.turing.code.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turing.code.entity.CodeShangpinleixing;
import com.turing.code.mapper.CodeShangpinleixingMapper;
import com.turing.code.service.ISplxService;

/**  
 * 标题: SplxServiceImpl.java
 * 路径: com.turing.code.service.impl
 * 描述: 商品类型模型层实现类
 * 作者: 郎国峰
 * 时间: 2018年3月18日 下午8:11:54
 * 版本: @version V1.0  
 */
@Service
public class SplxServiceImpl implements ISplxService{
	//商品类型mapper
	@Autowired
	private CodeShangpinleixingMapper codeShangpinleixingMapper;
	
	/* (non-Javadoc)
	 * @see com.turing.code.service.ISplxService#queryAll()
	 */
	@Override
	public List<CodeShangpinleixing> queryAll() {
		// TODO Auto-generated method stub
		return codeShangpinleixingMapper.queryAll();
	}

}
