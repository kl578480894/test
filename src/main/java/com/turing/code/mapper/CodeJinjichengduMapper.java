package com.turing.code.mapper;

import java.util.List;

import com.turing.code.entity.CodeJinjichengdu;

public interface CodeJinjichengduMapper {

	List<CodeJinjichengdu> query();

	void insert(CodeJinjichengdu jjcdE);

	CodeJinjichengdu selectByPrimaryKey(String id);

	void updateByPrimaryKeySelective(CodeJinjichengdu jjcde);

	void deleteByPrimaryKey(String string);

}
