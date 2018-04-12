package com.turing.code.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.turing.code.entity.CodeRuhuifangshi;
import com.turing.code.entity.CodeShangpinpinpai;
import com.turing.code.service.SpppService;

@Controller
@Scope("prototype")
@RequestMapping("sppp")
public class SpppController {
	@Autowired
	private SpppService spppService;
	
	@RequestMapping("query")
	public String queryAll(ModelMap mm){
		List<CodeShangpinpinpai> lsit = spppService.queryAll();
		mm.put("list", lsit);
		return "jsp/code/sppp/query_sppp";
	}
	@RequestMapping("addpage")
	public String addpage(){
		return "jsp/code/sppp/add_sppp";
	}
	
	@RequestMapping("save")
	public String save(CodeShangpinpinpai codeShangpinpinpai){
		codeShangpinpinpai.setCspId(UUID.randomUUID().toString());
		spppService.save(codeShangpinpinpai);
		return "redirect:query.action";
	}
	
	@RequestMapping("editpage")
	public String editpage(ModelMap mm , String id){
		CodeShangpinpinpai codeShangpinpinpai = spppService.editpage(id);
		mm.put("codeShangpinpinpai", codeShangpinpinpai);
		return "jsp/code/sppp/edit_sppp";
	}
	@RequestMapping("edit")
	public String edit(CodeShangpinpinpai codeShangpinpinpai){
		spppService.edit(codeShangpinpinpai);
		return "redirect:query.action";
	}
	@RequestMapping("delete")
	public String delete(String[] ids){
		spppService.delete(ids);
		return "redirect:query.action";
	}

}
