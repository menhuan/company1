package com.iqb.onigiri.manage.action;

import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.iqb.onigiri.manage.base.BaseAction;
import com.iqb.onigiri.manage.util.RestClientRequest;
import com.iqb.onigiri.manage.util.ResultUtil;

/**
 * 邮件action
 * @ClassName: EmailAction
 * @Description: 
 *  @author fengruiqi
 * @date 2017年4月16日 下午4:29:41
 *
 */
@Controller
@RequestMapping("email")
public class EmailAction extends BaseAction {

	private Logger logger=(Logger) LoggerFactory.getLogger(EmailAction.class);
	
	/**
	 * 查询邮件
	 * @Title: Index
	 * @Description: TODO
	 * @param @return    设定文件
	 * @return ModelAndView    返回类型
	 * @throws
	 * @author fengruiqi
	 * @2017年4月16日  @下午4:31:08
	 */
	@RequestMapping(value="index",method=RequestMethod.GET)
	public ModelAndView Index(HttpServletRequest request){
		logger.debug("查询邮件信息");
		ModelAndView  model=new ModelAndView();
		try {
			RestClientRequest rest=new RestClientRequest();
			LinkedHashMap  linkedHashMap=rest.restSubmitBean("", new HashMap());
			if(ResultUtil.isSuccess(linkedHashMap)){
				model.addObject("list", ResultUtil.getResult(linkedHashMap));
			}
			
		} catch (Exception e) {
			logger.error("查看邮件信息错误。。。。",e);
		}		
		
		model.setViewName("email/email_list");
		return model;
	}
	
	/**
	 * 新增跳转页面
	* @Title: Index
	* @Description: TODO
	* @param @param request
	* @param @return    设定文件
	* @return ModelAndView    返回类型
	* @throws
	* @author fengruiqi
	* @2017年4月16日  @下午6:14:17
	 */
	@RequestMapping(value="add",method=RequestMethod.GET)
	public ModelAndView add(HttpServletRequest request){
		logger.debug("查询邮件信息");
		ModelAndView  model=new ModelAndView();
		model.addObject("isUpdate",false);
		model.setViewName("email/email_edit");
		return model;
	}
	/**
	 * 跳转编辑页面并且把信息显示在页面上
	* @Title: Index
	* @Description: TODO
	* @param @param request
	* @param @return    设定文件
	* @return ModelAndView    返回类型
	* @throws
	* @author fengruiqi
	* @2017年4月16日  @下午6:17:31
	 */
	@RequestMapping(value="update",method=RequestMethod.GET)
	public ModelAndView update(HttpServletRequest request){
		logger.debug("修改邮件信息");
		ModelAndView  model=new ModelAndView();
		try {
			RestClientRequest rest=new RestClientRequest();
			LinkedHashMap  linkedHashMap=rest.restSubmitBean("", new HashMap());
			if(ResultUtil.isSuccess(linkedHashMap)){
				model.addObject("list", ResultUtil.getResult(linkedHashMap));
			}
			
		} catch (Exception e) {
			logger.error("修改邮件信息错误。。。。",e);
		}		
		model.setViewName("email/email_edit");
		return model;
	}
	
	/**
	 * 提交信息页面
	* @Title: update
	* @Description: TODO
	* @param @param request
	* @param @return    设定文件
	* @return ModelAndView    返回类型
	* @throws
	* @author fengruiqi
	* @2017年4月16日  @下午6:20:05
	 */
	@ResponseBody
	@RequestMapping(value="submit",method=RequestMethod.GET)
	public ModelAndView update(HttpServletRequest request){
		logger.debug("修改邮件信息");
		ModelAndView  model=new ModelAndView();
		try {
			RestClientRequest rest=new RestClientRequest();
			LinkedHashMap  linkedHashMap=rest.restSubmitBean("", new HashMap());
			if(ResultUtil.isSuccess(linkedHashMap)){
				model.addObject("list", ResultUtil.getResult(linkedHashMap));
			}
			
		} catch (Exception e) {
			logger.error("修改邮件信息错误。。。。",e);
		}		
		model.setViewName("email/email_edit");
		return model;
	}
	
}
