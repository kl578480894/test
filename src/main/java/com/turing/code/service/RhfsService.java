package com.turing.code.service;

import java.util.List;

import com.turing.code.entity.CodeRuhuifangshi;

public interface RhfsService {

	List<CodeRuhuifangshi> queryAll();

	void save(CodeRuhuifangshi codeRuhuifangshi);

	CodeRuhuifangshi editpage(String id);

	void edit(CodeRuhuifangshi codeRuhuifangshi);

	void delete(String[] ids);

}
