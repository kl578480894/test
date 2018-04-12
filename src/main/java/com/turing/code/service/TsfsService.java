package com.turing.code.service;

import java.util.List;

import com.turing.code.entity.CodeTousufangshi;

public interface TsfsService {

	void delete(String[] ids);

	void edit(CodeTousufangshi codeTousufangshi);

	List<CodeTousufangshi> queryAll();

	void save(CodeTousufangshi codeTousufangshi);

	CodeTousufangshi queryById(String id);

}
