package com.turing.code.mapper;

import java.util.List;

import javax.annotation.Resources;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.turing.code.entity.CodeYongpinleixing;

public interface CodeYongpinleixingMapper {
    int deleteByPrimaryKey(String cylId);

    int insert(CodeYongpinleixing record);

    int insertSelective(CodeYongpinleixing record);

    CodeYongpinleixing selectByPrimaryKey(String cylId);

    int updateByPrimaryKeySelective(CodeYongpinleixing record);

    int updateByPrimaryKey(CodeYongpinleixing record);

	/**   
	 * @方法名: queryAll   
	 * @描述:
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午3:30:04
	 * @return	         
	 */  
    @Select("select * from code_yongpinleixing")
    @ResultMap("BaseResultMap")
	List<CodeYongpinleixing> queryAll();
}