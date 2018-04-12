package com.turing.code.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.turing.code.entity.CodeShangpinpinpai;

public interface CodeShangpinpinpaiMapper {
    int deleteByPrimaryKey(String cspId);

    int insert(CodeShangpinpinpai record);

    int insertSelective(CodeShangpinpinpai record);

    CodeShangpinpinpai selectByPrimaryKey(String cspId);

    int updateByPrimaryKeySelective(CodeShangpinpinpai record);

    int updateByPrimaryKey(CodeShangpinpinpai record);
    
    @Select("select * from code_shangpinpinpai")
    @ResultMap("BaseResultMap")
	List<CodeShangpinpinpai> queryAll();
}