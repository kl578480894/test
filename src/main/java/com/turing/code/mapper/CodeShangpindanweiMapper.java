package com.turing.code.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.turing.code.entity.CodeShangpindanwei;

public interface CodeShangpindanweiMapper {
    int deleteByPrimaryKey(String csdId);

    int insert(CodeShangpindanwei record);

    int insertSelective(CodeShangpindanwei record);

    CodeShangpindanwei selectByPrimaryKey(String csdId);

    int updateByPrimaryKeySelective(CodeShangpindanwei record);

    int updateByPrimaryKey(CodeShangpindanwei record);

	/**   
	 * @方法名: queryAll   
	 * @描述: 查询所有的商品单位
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午8:46:58
	 * @return	         
	 */  
    @Select("select * from code_shangpindanwei")
    @ResultMap("BaseResultMap")
	List<CodeShangpindanwei> queryAll();
}