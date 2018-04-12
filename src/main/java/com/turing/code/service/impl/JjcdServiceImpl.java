package com.turing.code.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turing.code.entity.CodeJinjichengdu;
import com.turing.code.mapper.CodeJinjichengduMapper;
import com.turing.code.service.JjcdService;
@Service
public class JjcdServiceImpl implements JjcdService {
	@Autowired
	private CodeJinjichengduMapper jjcdMapper;
	@Override
	public List<CodeJinjichengdu> query() {
		
		return jjcdMapper.query();
	}
	@Override
	public void save(CodeJinjichengdu jjcdE) {
		jjcdMapper.insert(jjcdE);
	}
	@Override
	public CodeJinjichengdu queryById(String id) {
		return jjcdMapper.selectByPrimaryKey(id);
	}
	@Override
	public void edit(CodeJinjichengdu jjcde) {
		jjcdMapper.updateByPrimaryKeySelective(jjcde);
	}
	@Override
	public void delete(String[] ids) {
		for (int i = 0; i < ids.length; i++) {
			
			jjcdMapper.deleteByPrimaryKey(ids[i]);
		}
	}

}
