/**  
 * @标题: YplxController.java
 * @路径: com.turing.code.controller
 * @描述: TODO(用一句话描述该文件做什么)
 * @作者: 郎国峰
 * @时间: 2018年4月12日 下午3:10:47
 * @version V1.0  
 */ 
package com.turing.code.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.turing.code.entity.CodeYongpinleixing;
import com.turing.code.service.IYplxService;
import com.turing.framework.util.OperLogUtils;

/**  
 * 标题: YplxController.java
 * 路径: com.turing.code.controller
 * 描述: TODO
 * 作者: 郎国峰
 * 时间: 2018年4月12日 下午3:10:47
 * 版本: @version V1.0  
 */
@Controller
@RequestMapping("yplx")
public class YplxController {
	/**
	 * 日志工具
	 */
	@Autowired
	private OperLogUtils logUtils;
	/**
	 * 用品类型模型层
	 */
	@Autowired
	private IYplxService yplxService;

	/**
	 * @方法名: queryAll   
	 * @描述: 用品类型查询数据控制器方法
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午3:15:44
	 * @return
	 */
	@RequestMapping("query")
	public String queryAll(ModelMap modelMap ){
		//调
		List<CodeYongpinleixing> list = yplxService.queryAll();
		//存
		modelMap.addAttribute("list", list);
		//转
		return "jsp/code/yplx/query_yplx";
	}
	
	/**
	 * @方法名: addpage   
	 * @描述: 用品类型跳转添加页面控制器方法
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午4:11:56
	 * @return
	 */
	@RequestMapping("addpage")
	public String addpage(){
		return "jsp/code/yplx/add_yplx";
	}
	/**
	 * @方法名: save   
	 * @描述: 用品类型添加保存控制器方法	
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午4:17:09
	 * @return
	 */
	@RequestMapping("save")
	public String save(CodeYongpinleixing yplx){
		//添加日志信息
		logUtils.write("信誉等级", 1, "添加一个数据");
		yplx.setCylId(UUID.randomUUID().toString());
		yplxService.save(yplx);
		//转
		return "redirect:query.action";
	}
	
	/**
	 * @方法名: editpage   
	 * @描述: 用品类型跳转修改页方法
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午4:28:44
	 * @return
	 */
	@RequestMapping("editpage")
	public String editpage(ModelMap ModelMap , String id){
		//添加日志
		logUtils.write("用品类型", 2, "修改一条数据");
		//调
		CodeYongpinleixing yplx = yplxService.queryOneById(id);
		//存
		ModelMap.put("yplx", yplx);
		//转
		return "jsp/code/yplx/edit_yplx";
	}
	/**
	 * @方法名: edit   
	 * @描述: 用品类型修改保存方法
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午4:45:27
	 * @param yplx
	 * @return
	 */
	@RequestMapping("edit")
	public String edit(CodeYongpinleixing yplx){
		//调
		yplxService.edit(yplx);
		//转
		return "redirect:query.action";
	}
	/**
	 * @方法名: delete   
	 * @描述: 用品类型删除的方法
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午4:51:35
	 * @return
	 */
	@RequestMapping("delete")
	public String delete(String[] ids){
		//添加日志
		logUtils.write("用品类型", 3, "删除一些数据");
		//调
		yplxService.deleteById(ids);
		//转
		return "redirect:query.action";
	}
	
	
	
	
	
	
	
	
	
}
