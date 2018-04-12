package com.turing.code.service;

import java.util.List;

import com.turing.code.entity.CodeShangpinpinpai;

public interface SpppService {

	List<CodeShangpinpinpai> queryAll();

	void save(CodeShangpinpinpai codeShangpinpinpai);

	CodeShangpinpinpai editpage(String id);

	void edit(CodeShangpinpinpai codeShangpinpinpai);

	void delete(String[] ids);

}
