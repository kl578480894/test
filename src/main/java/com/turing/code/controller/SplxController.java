/**  
 * @标题: SplxController.java
 * @路径: com.turing.code.controller
 * @描述: TODO(用一句话描述该文件做什么)
 * @作者: 郎国峰
 * @时间: 2018年4月12日 下午1:28:59
 * @version V1.0  
 */ 
package com.turing.code.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.turing.code.entity.CodeShangpinleixing;
import com.turing.code.service.ISplxService;
import com.turing.framework.util.OperLogUtils;

/**  
 * 标题: SplxController.java
 * 路径: com.turing.code.controller
 * 描述: 商品类型控制器
 * 作者: 郎国峰
 * 时间: 2018年4月12日 下午1:28:59
 * 版本: @version V1.0  
 */
@Controller
@RequestMapping("splx")
@Scope("prototype")
public class SplxController {
	/**
	 * 日志工具类
	 */
	@Autowired
	private OperLogUtils logUtils;
	
	/**
	 * 商品类型模型层
	 */
	@Autowired
	private ISplxService splxService;
	
	/**
	 * @方法名: query   
	 * @描述: 查询商品类型控制器方法
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午1:31:56
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("query")
	public String query(ModelMap modelMap){
		//调
		List<CodeShangpinleixing> list = splxService.queryAll();
		//存
		modelMap.addAttribute("list", list);
		//转
		return "jsp/code/splx/query_splx";
	}
	
	/**
	 * @方法名: addpage   
	 * @描述: 商品类型添加页面控制器方法
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午2:03:04
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("addpage")
	public String addpage(){
		return "jsp/code/splx/add_splx";
	}
	
	/**
	 * @方法名: save   
	 * @描述: 商品类型添加保存方法
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午2:16:56
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("save")
	public String save(CodeShangpinleixing splx){
		//日志添加一条数据
		logUtils.write("商品类型", 1 , "添加一条数据");
		//自动生成一个ID添加到splx中
		splx.setCslId(UUID.randomUUID().toString());
		//调
		splxService.save(splx);
		//转
		return "redirect:query.action";
	}
	
	/**
	 * @方法名: editpage   
	 * @描述: 商品类型跳转修改页面
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午2:44:49
	 * @return
	 */
	@RequestMapping("editpage")
	public String editpage(ModelMap modelMap, String id){
		//调
		CodeShangpinleixing splx = splxService.editpage(id);
		System.out.println(splx);
		//存
		modelMap.addAttribute("splx", splx);
		//转
		return "jsp/code/splx/edit_splx";
	}
	
	/**
	 * @方法名: edit   
	 * @描述: 修改商品类型控制器方法
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午3:00:32
	 * @return
	 */
	@RequestMapping("edit")
	public String edit(CodeShangpinleixing splx){
		//添加日志信息
		logUtils.write("商品类型", 2, "修改一条数据");
		//调
		splxService.edit(splx);
		return "redirect:query.action";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
