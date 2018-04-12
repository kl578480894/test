package com.turing.code.service;

import java.util.List;

import com.turing.code.entity.CodeJinjichengdu;

public interface JjcdService {
	/**
	 * 查询紧急程度所有数据
	 * @return
	 */
	List<CodeJinjichengdu> query();
	/**
	 * 添加一个数据
	 * @param jjcdE
	 */
	void save(CodeJinjichengdu jjcdE);
	
	
	CodeJinjichengdu queryById(String id);
	
	void edit(CodeJinjichengdu jjcde);
	
	void delete(String[] ids);

}
