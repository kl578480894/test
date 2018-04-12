package com.turing.cardmanager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.turing.cardmanager.entity.CardType;

public interface CardTypeMapper {
    int deleteByPrimaryKey(String cardId);

    int insert(CardType record);

    int insertSelective(CardType record);

    CardType selectByPrimaryKey(String cardId);

    int updateByPrimaryKeySelective(CardType record);

    int updateByPrimaryKey(CardType record);

	/**   
	 * @方法名: queryAll   
	 * @描述: 查询所有的会员卡类型
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午6:40:01
	 * @return	         
	 */  
    @Select("select * from card_type")
    @ResultMap("BaseResultMap")
	List<CardType> queryAll();
}