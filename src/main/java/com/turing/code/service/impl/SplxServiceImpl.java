/**  
 * @标题: SplxServiceImpl.java
 * @路径: com.turing.code.service.impl
 * @描述: TODO(用一句话描述该文件做什么)
 * @作者: 郎国峰
 * @时间: 2018年4月12日 下午1:37:49
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
 * 时间: 2018年4月12日 下午1:37:49
 * 版本: @version V1.0  
 */
@Service
public class SplxServiceImpl implements ISplxService{
	/**
	 * 商品类型mapper
	 */
	@Autowired
	private CodeShangpinleixingMapper splxMapper;

	/* (non-Javadoc)
	 * @see com.turing.code.service.ISplxService#queryAll()
	 */
	@Override
	public List<CodeShangpinleixing> queryAll() {
		// TODO Auto-generated method stub
		return splxMapper.queryAll();
	}

	/* (non-Javadoc)
	 * @see com.turing.code.service.ISplxService#save(com.turing.code.entity.CodeShangpinleixing)
	 */
	@Override
	public void save(CodeShangpinleixing splx) {
		// TODO Auto-generated method stub
		splxMapper.insert(splx);
	}

	/* (non-Javadoc)
	 * @see com.turing.code.service.ISplxService#editpage(java.lang.String)
	 */
	@Override
	public CodeShangpinleixing editpage(String id) {
		// TODO Auto-generated method stub
		return splxMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.turing.code.service.ISplxService#edit(com.turing.code.entity.CodeShangpinleixing)
	 */
	@Override
	public void edit(CodeShangpinleixing splx) {
		// TODO Auto-generated method stub
		splxMapper.updateByPrimaryKey(splx);
	}

	/* (non-Javadoc)
	 * @see com.turing.code.service.ISplxService#deleteById(java.lang.String[])
	 */
	@Override
	public void deleteById(String[] ids) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ids.length; i++) {
			splxMapper.deleteByPrimaryKey(ids[i]);
		}
		
	}
	
}
