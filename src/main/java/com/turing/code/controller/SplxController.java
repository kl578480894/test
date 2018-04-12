/**  
 * @标题: SplxController.java
 * @路径: com.turing.code.controller
 * @描述: TODO(用一句话描述该文件做什么)
 * @作者: 郎国峰
 * @时间: 2018年3月18日 下午7:50:36
 * @version V1.0  
 */ 
package com.turing.code.controller;

import java.util.List;

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
 * 时间: 2018年3月18日 下午7:50:36
 * 版本: @version V1.0  
 */
@Controller
@RequestMapping("splx")
@Scope("prototype")
public class SplxController {
	//商品类型的模型层
	@Autowired
	private ISplxService splxService;
	//日志工具类
	@Autowired
	private OperLogUtils logUtils;
	
	@RequestMapping("query")
	public String query(ModelMap modelMap){
		//调模型层查询所欲的商品类型,得到一个list集合
		List<CodeShangpinleixing> splxList = splxService.queryAll();
		//存
		modelMap.addAttribute("splxList", splxList);
		//转
		return "jsp/code/splx/query_splx";
	}
	
}
