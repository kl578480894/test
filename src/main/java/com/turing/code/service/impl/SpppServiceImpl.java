package com.turing.code.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turing.code.entity.CodeShangpinpinpai;
import com.turing.code.mapper.CodeShangpinpinpaiMapper;
import com.turing.code.service.SpppService;
@Service
public class SpppServiceImpl implements SpppService {
	
	@Autowired
	private CodeShangpinpinpaiMapper codeShangpinpinpaiMapper;

	@Override
	public List<CodeShangpinpinpai> queryAll() {
		// TODO Auto-generated method stub
		return codeShangpinpinpaiMapper.queryAll();
	}

	@Override
	public void save(CodeShangpinpinpai codeShangpinpinpai) {
		codeShangpinpinpaiMapper.insertSelective(codeShangpinpinpai);
	}

	@Override
	public CodeShangpinpinpai editpage(String id) {
		// TODO Auto-generated method stub
		return codeShangpinpinpaiMapper.selectByPrimaryKey(id);
	}

	@Override
	public void edit(CodeShangpinpinpai codeShangpinpinpai) {
		codeShangpinpinpaiMapper.updateByPrimaryKeySelective(codeShangpinpinpai);
	}

	@Override
	public void delete(String[] ids) {
		for (int i = 0; i < ids.length; i++) {
			codeShangpinpinpaiMapper.deleteByPrimaryKey(ids[i]);
		}
	}

}
