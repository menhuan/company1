package com.iqb.onigiri.bgfront.rest.manage.email;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iqb.onigiri.bgfront.rest.base.BaseService;
import com.iqb.onigiri.bgfront.server.manage.email.bean.EmailBean;


/**
 * 邮件配置rest
 * @ClassName: EamilRest
 * @Description: 
 * @author fengruiqi
 * @date 2017年4月16日 下午1:55:30
 *
 */
@RestController
@RequestMapping("emailRest")
public class EmailRest  extends BaseService{

	/**
	 * 日志
	 */
	private Logger logger=LoggerFactory.getLogger(EmailRest.class);
	
	/**
	 * 查询邮件地址列表
	 */
	@RequestMapping(value="getEmailList",method=RequestMethod.POST)
	public Map getEmailList(){
		logger.debug("查询邮件地址列表");
		try {
			LinkedHashMap linkedHashMap=new LinkedHashMap();
			linkedHashMap.put("result",);
			return super.returnSuccessInfo(linkedHashMap);
		} catch (Exception e) {
			logger.error("查询邮件地址列表。。系统异常"+e);
			return returnFailtrueInfo(e);
		}
		
	}
	/**
	 * 根据索引值查询list中的信息
	 * @Title: getEmailList
	 * @Description: TODO
	 * @param @return    设定文件
	 * @return Map    返回类型
	 * @throws
 	 * @author fengruiqi
	 * @2017年4月16日  @下午2:06:39
	 */
	@RequestMapping(value="getEmailValue",method=RequestMethod.POST)
	public Map getEmailValue(){
		logger.debug("查询邮件地址列表");
		try {
			LinkedHashMap linkedHashMap=new LinkedHashMap();
			linkedHashMap.put("result",);
			return super.returnSuccessInfo(linkedHashMap);
		} catch (Exception e) {
			logger.error("查询邮件地址列表。。系统异常"+e);
			return returnFailtrueInfo(e);
		}
		
	}
	
	
	/**
	 * 增加邮件地址
	 * @Title: addEmailAddress
	 * @Description: TODO
	 * @param @return    设定文件
	 * @return Map    返回类型
	 * @throws
	 * @author fengruiqi
	 * @2017年4月16日  @下午2:00:34
	 */
	@RequestMapping(value="addEmailAddress",method=RequestMethod.POST)
	public Map addEmailAddress(@RequestBody EmailBean bean){
		logger.debug("查询邮件地址列表");
		try {
			LinkedHashMap linkedHashMap=new LinkedHashMap();
			linkedHashMap.put("result",);
			return super.returnSuccessInfo(linkedHashMap);
		} catch (Exception e) {
			logger.error("查询邮件地址列表。。系统异常"+e);
			return returnFailtrueInfo(e);
		}
		
	}
	
	/**
	 * 
     * @Title: addEmailAddress
     * @Description: TODO
	 * @param @param bean
	 * @param @return    设定文件
	 * @return Map    返回类型
	 * @throws
	 * @author fengruiqi
	 * @2017年4月16日  @下午2:08:36
	 */
	@RequestMapping(value="updateEmailAddress",method=RequestMethod.POST)
	public Map updateEmailAddress(@RequestBody EmailBean bean){
		logger.debug("查询邮件地址列表");
		try {
			LinkedHashMap linkedHashMap=new LinkedHashMap();
			linkedHashMap.put("result",);
			return super.returnSuccessInfo(linkedHashMap);
		} catch (Exception e) {
			logger.error("查询邮件地址列表。。系统异常"+e);
			return returnFailtrueInfo(e);
		}
		
	}
	
}
