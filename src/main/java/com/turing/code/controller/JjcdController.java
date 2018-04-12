package com.turing.code.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.turing.code.entity.CodeJinjichengdu;
import com.turing.code.service.JjcdService;


@Controller
@RequestMapping("jinjichengdu")
@Scope("prototype")
public class JjcdController {
	
	@Autowired
	private JjcdService jjcdService;
	
	@RequestMapping("query")
	public String query(ModelMap mm) {
		List<CodeJinjichengdu> list = jjcdService.query();
		mm.put("list", list);
		return "jsp/code/jijichengdu/query_jjcd";
	}
	@RequestMapping("addpage")
	public String addpage(){
		
		return "jsp/code/jijichengdu/add_jjcd";
	}
	
	@RequestMapping("save")
	public String save(CodeJinjichengdu jjcdE){
		jjcdE.setCjcId(UUID.randomUUID().toString());
		jjcdService.save(jjcdE);
		return "redirect:query.action";
	}
	
	@RequestMapping("editpage")
	public String editpage(ModelMap mm,String id){
		CodeJinjichengdu jjcde = jjcdService.queryById(id);
		mm.put("jjcde", jjcde);
		return "jsp/code/jijichengdu/edit_jjcd";
	}
	
	@RequestMapping("edit")
	public String edit(CodeJinjichengdu jjcde){
		jjcdService.edit(jjcde);
		return "redirect:query.action";
	}
	
	@RequestMapping("delete")
	public String delete(String[] ids){
		jjcdService.delete(ids);
		return "redirect:query.action";
	}
	
}
