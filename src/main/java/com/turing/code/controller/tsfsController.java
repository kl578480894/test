package com.turing.code.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.turing.code.entity.CodeTousufangshi;
import com.turing.code.service.TsfsService;

@Controller
@RequestMapping("tsfs")
@Scope("prototype")
public class tsfsController {
	
	@Autowired
	private TsfsService tsfsService;
	
	@RequestMapping("query")
	public String query(ModelMap mm ){
		List<CodeTousufangshi> list = tsfsService.queryAll();
		mm.put("list", list);
		return "jsp/code/tsfs/query_tsfs";
	}
	
	@RequestMapping("addpage")
	public String addpage(){
		
		return "jsp/code/tsfs/add_tsfs";
	}
	
	@RequestMapping("save")
	public String save(CodeTousufangshi codeTousufangshi){
		codeTousufangshi.setCtfId(UUID.randomUUID().toString());
		tsfsService.save(codeTousufangshi);
		return "redirect:query.action";
	}
	
	@RequestMapping("editpage")
	public String editpage(ModelMap mm , String id){
		CodeTousufangshi codeTousufangshi = tsfsService.queryById(id);
		mm.put("codeTousufangshi", codeTousufangshi);
		return "jsp/code/tsfs/edit_tsfs";
	}
	
	@RequestMapping("edit")
	public String edit(CodeTousufangshi codeTousufangshi ){
		tsfsService.edit(codeTousufangshi);
		return "redirect:query.action";
	}
	
	@RequestMapping("delete")
	public String delete(String[] ids){
		tsfsService.delete(ids);
		return "redirect:query.action" ;
	}

}
