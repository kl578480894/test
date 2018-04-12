/**  
 * @标题: TypeServiceImpl.java
 * @路径: com.turing.cardmanager.service.impl
 * @描述: TODO(用一句话描述该文件做什么)
 * @作者: 郎国峰
 * @时间: 2018年4月12日 下午6:30:49
 * @version V1.0  
 */ 
package com.turing.cardmanager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turing.cardmanager.entity.CardType;
import com.turing.cardmanager.mapper.CardTypeMapper;
import com.turing.cardmanager.service.ITypeService;

/**  
 * 标题: TypeServiceImpl.java
 * 路径: com.turing.cardmanager.service.impl
 * 描述: 会员卡类型设置模型层实现
 * 作者: 郎国峰
 * 时间: 2018年4月12日 下午6:30:49
 * 版本: @version V1.0  
 */
@Service
public class TypeServiceImpl implements ITypeService{
	/**
	 * 会员卡卡类型mapper
	 */
	@Autowired
	private CardTypeMapper cardTypeMapper;

	/* (non-Javadoc)
	 * @see com.turing.cardmanager.service.ITypeService#queryAll()
	 */
	@Override
	public List<CardType> queryAll() {
		// TODO Auto-generated method stub
		return cardTypeMapper.queryAll();
	}

	/* (non-Javadoc)
	 * @see com.turing.cardmanager.service.ITypeService#queryOneById(java.lang.String)
	 */
	@Override
	public CardType queryOneById(String id) {
		// TODO Auto-generated method stub
		return cardTypeMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.turing.cardmanager.service.ITypeService#edit(com.turing.cardmanager.entity.CardType)
	 */
	@Override
	public void edit(CardType cardType) {
		// TODO Auto-generated method stub
		cardTypeMapper.updateByPrimaryKey(cardType);
	}

	/* (non-Javadoc)
	 * @see com.turing.cardmanager.service.ITypeService#save(com.turing.cardmanager.entity.CardType)
	 */
	@Override
	public void save(CardType cardType) {
		// TODO Auto-generated method stub
		cardTypeMapper.insert(cardType);
	}

	/* (non-Javadoc)
	 * @see com.turing.cardmanager.service.ITypeService#delete(java.lang.String[])
	 */
	@Override
	public void delete(String[] ids) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ids.length; i++) {
			cardTypeMapper.deleteByPrimaryKey(ids[i]);
		}
		
	}

}
