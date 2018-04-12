package com.turing.code.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.turing.code.entity.CodeShangpinleixing;

public interface CodeShangpinleixingMapper {
    int deleteByPrimaryKey(String cslId);

    int insert(CodeShangpinleixing record);

    int insertSelective(CodeShangpinleixing record);

    CodeShangpinleixing selectByPrimaryKey(String cslId);

    int updateByPrimaryKeySelective(CodeShangpinleixing record);

    int updateByPrimaryKey(CodeShangpinleixing record);

	/**   
	 * @方法名: queryAll   
	 * @描述: 查询所有商品类型
	 * @作者: 郎国峰
	 * @时间: 2018年3月18日 下午8:16:58
	 * @return	         
	 */  
    @Select("select csl_id, csl_name from code_shangpinleixing")
    @ResultMap("BaseResultMap")
	List<CodeShangpinleixing> queryAll();

}