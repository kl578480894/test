package com.turing.code.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.turing.code.entity.CodeRuhuifangshi;
import com.turing.code.service.RhfsService;

@Controller
@Scope("prototype")
@RequestMapping("rhfs")
public class RhfsController {
	
	@Autowired
	private RhfsService rhfsService;
	
	@RequestMapping("query")
	public String queryAll(ModelMap mm){
		List<CodeRuhuifangshi> lsit = rhfsService.queryAll();
		mm.put("list", lsit);
		return "jsp/code/rhfs/query_rhfs";
	}
	@RequestMapping("addpage")
	public String addpage(){
		return "jsp/code/rhfs/add_rhfs";
	}
	
	@RequestMapping("save")
	public String save(CodeRuhuifangshi codeRuhuifangshi){
		codeRuhuifangshi.setCrfId(UUID.randomUUID().toString());
		rhfsService.save(codeRuhuifangshi);
		return "redirect:query.action";
	}
	
	@RequestMapping("editpage")
	public String editpage(ModelMap mm , String id){
		CodeRuhuifangshi codeRuhuifangshi = rhfsService.editpage(id);
		mm.put("codeRuhuifangshi", codeRuhuifangshi);
		return "jsp/code/rhfs/edit_rhfs";
	}
	@RequestMapping("edit")
	public String edit(CodeRuhuifangshi codeRuhuifangshi){
		rhfsService.edit(codeRuhuifangshi);
		return "redirect:query.action";
	}
	@RequestMapping("delete")
	public String delete(String[] ids){
		rhfsService.delete(ids);
		return "redirect:query.action";
	}
}
