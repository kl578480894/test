/**  
 * @标题: TypeController.java
 * @路径: com.turing.cardmanager.controller
 * @描述: TODO(用一句话描述该文件做什么)
 * @作者: 郎国峰
 * @时间: 2018年4月12日 下午6:19:53
 * @version V1.0  
 */ 
package com.turing.cardmanager.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.turing.cardmanager.entity.CardType;
import com.turing.cardmanager.service.ITypeService;
import com.turing.framework.util.OperLogUtils;

/**  
 * 标题: TypeController.java
 * 路径: com.turing.cardmanager.controller
 * 描述: 会员卡类型设置控制器
 * 作者: 郎国峰
 * 时间: 2018年4月12日 下午6:19:53
 * 版本: @version V1.0  
 */
@Controller
@RequestMapping("type")
@Scope("prototype")
public class TypeController {
	
	@Autowired
	private OperLogUtils logUtils;
	/**
	 * 会员卡类型设置模型
	 */
	@Autowired
	private ITypeService typeService;
	
	/**
	 * @方法名: query   
	 * @描述: 会员卡类型设置查询控制器
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午6:24:19
	 * @return
	 */
	@RequestMapping("query")
	public String queryAll(ModelMap modelMap ){
		//调
		List<CardType> list = typeService.queryAll();
		//存
		modelMap.put("list", list);
		//转
		return "jsp/cardmanager/type/query_type";
	}
	
	/**
	 * @方法名: page   
	 * @描述: 会员卡类型的添加修改跳转页面
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午8:06:00
	 * @param modelMap
	 * @param id
	 * @return
	 */
	@RequestMapping("page")
	public String page(ModelMap modelMap,String id){
		String pageName = "增加会员卡类型"; //当前页面名称
		//判断是否传入id,如果传入id就是修改,否则是添加
		if(id!=null&&id!=""){//修改
			//调
			CardType cardType = typeService.queryOneById(id);
			//存
			pageName = "修改会员卡类型";
			modelMap.put("pageName", pageName);
			modelMap.put("cardType", cardType);
		}
		//存
		modelMap.put("pageName", pageName);
		return "jsp/cardmanager/type/page_type";
	}
	
	/**
	 * @方法名: save   
	 * @描述: 会员卡类型的添加和修改方法
	 * @作者: 郎国峰
	 * @时间: 2018年4月12日 下午8:20:13
	 * @param cardType
	 * @return
	 */
	@RequestMapping("save")
	public String save(CardType cardType){
		//判断是否传入id,如果传入id就是修改,否则是添加
		if(cardType.getCardId()!=null&&cardType.getCardId()!=""){//修改
			logUtils.write("会员卡类型", 2, "修改一条数据");
			//调
			typeService.edit(cardType);
		}else{//添加
			logUtils.write("会员卡类型", 1, "添加一条数据");
			//生成id
			cardType.setCardId(UUID.randomUUID().toString());
			//定义是否是疗程卡
			cardType.setCardLck("N");
			//标注卡是否可用
			cardType.setCardState("A");
			typeService.save(cardType);
		}
		return "redirect:query.action";
	}
	
	@RequestMapping("delete")
	public String delete(String[] ids){
		//添加一条日志
		logUtils.write("会员卡类型", 3, "删除一些数据");
		//调
		typeService.delete(ids);
		//转
		return "redirect:query.action";
	}
	
	
	
	
}
