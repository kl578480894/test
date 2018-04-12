package com.turing.code.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turing.code.entity.CodeRuhuifangshi;
import com.turing.code.mapper.CodeRuhuifangshiMapper;
import com.turing.code.service.RhfsService;

@Service
public class RhfsServiceImpl implements RhfsService {
	
	@Autowired
	private CodeRuhuifangshiMapper codeRuhuifangshiMapper;

	@Override
	public List<CodeRuhuifangshi> queryAll() {
		
		return codeRuhuifangshiMapper.queryAll();
	}

	@Override
	public void save(CodeRuhuifangshi codeRuhuifangshi) {
		codeRuhuifangshiMapper.insertSelective(codeRuhuifangshi);
	}

	@Override
	public CodeRuhuifangshi editpage(String id) {
		return codeRuhuifangshiMapper.selectByPrimaryKey(id);
	}

	@Override
	public void edit(CodeRuhuifangshi codeRuhuifangshi) {
		codeRuhuifangshiMapper.updateByPrimaryKeySelective(codeRuhuifangshi);
	}

	@Override
	public void delete(String[] ids) {
		for (int i = 0; i < ids.length; i++) {
			codeRuhuifangshiMapper.deleteByPrimaryKey(ids[i]);
		}
	}

}
