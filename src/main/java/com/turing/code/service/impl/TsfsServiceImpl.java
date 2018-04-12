package com.turing.code.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turing.code.entity.CodeTousufangshi;
import com.turing.code.mapper.CodeTousufangshiMapper;
import com.turing.code.service.TsfsService;
@Service
public class TsfsServiceImpl implements TsfsService {
	@Autowired
	private CodeTousufangshiMapper codeTousufangshiMapper;
	
	@Override
	public void delete(String[] ids) {
		for (int i = 0; i < ids.length; i++) {
			codeTousufangshiMapper.deleteByPrimaryKey(ids[i]);
		}
	}

	@Override
	public void edit(CodeTousufangshi codeTousufangshi) {
		codeTousufangshiMapper.updateByPrimaryKeySelective(codeTousufangshi);
	}

	@Override
	public List<CodeTousufangshi> queryAll() {
		return codeTousufangshiMapper.queryAll();
	}

	@Override
	public void save(CodeTousufangshi codeTousufangshi) {
		codeTousufangshiMapper.insertSelective(codeTousufangshi);
	}

	@Override
	public CodeTousufangshi queryById(String id) {
		return codeTousufangshiMapper.selectByPrimaryKey(id);
	}

}
