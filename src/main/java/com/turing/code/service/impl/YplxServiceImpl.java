/**  
 * @标题: YplxServiceImpl.java
 * @路径: com.turing.code.service.impl
 * @描述: TODO(用一句话描述该文件做什么)
 * @作者: 郎国峰
 * @时间: 2018年4月12日 下午3:24:36
 * @version V1.0  
 */ 
package com.turing.code.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turing.code.entity.CodeYongpinleixing;
import com.turing.code.mapper.CodeYongpinleixingMapper;
import com.turing.code.service.IYplxService;

/**  
 * 标题: YplxServiceImpl.java
 * 路径: com.turing.code.service.impl
 * 描述: TODO
 * 作者: 郎国峰
 * 时间: 2018年4月12日 下午3:24:36
 * 版本: @version V1.0  
 */
@Service
public class YplxServiceImpl implements IYplxService{
	@Autowired
	private CodeYongpinleixingMapper yplxMapper;
	
	/* (non-Javadoc)
	 * @see com.turing.code.service.IYplxService#queryAll()
	 */
	@Override
	public List<CodeYongpinleixing> queryAll() {
		// TODO Auto-generated method stub
		return yplxMapper.queryAll();
	}

	/* (non-Javadoc)
	 * @see com.turing.code.service.IYplxService#save(com.turing.code.entity.CodeYongpinleixing)
	 */
	@Override
	public void save(CodeYongpinleixing yplx) {
		// TODO Auto-generated method stub
		yplxMapper.insert(yplx);
	}

	/* (non-Javadoc)
	 * @see com.turing.code.service.IYplxService#queryOneById(java.lang.String)
	 */
	@Override
	public CodeYongpinleixing queryOneById(String id) {
		// TODO Auto-generated method stub
		return yplxMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.turing.code.service.IYplxService#edit(com.turing.code.entity.CodeYongpinleixing)
	 */
	@Override
	public void edit(CodeYongpinleixing yplx) {
		// TODO Auto-generated method stub
		yplxMapper.updateByPrimaryKey(yplx);
	}

	/* (non-Javadoc)
	 * @see com.turing.code.service.IYplxService#deleteById(java.lang.String[])
	 */
	@Override
	public void deleteById(String[] ids) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ids.length; i++) {
			yplxMapper.deleteByPrimaryKey(ids[i]);
		}
	}

}
