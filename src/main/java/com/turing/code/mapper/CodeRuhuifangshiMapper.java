package com.turing.code.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.turing.code.entity.CodeRuhuifangshi;

public interface CodeRuhuifangshiMapper {
    int deleteByPrimaryKey(String crfId);

    int insert(CodeRuhuifangshi record);

    int insertSelective(CodeRuhuifangshi record);

    CodeRuhuifangshi selectByPrimaryKey(String crfId);

    int updateByPrimaryKeySelective(CodeRuhuifangshi record);

    int updateByPrimaryKey(CodeRuhuifangshi record);
    
    @Select("select * from code_ruhuifangshi")
    @ResultMap("BaseResultMap")
	List<CodeRuhuifangshi> queryAll();
}