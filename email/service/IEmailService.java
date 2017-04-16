package com.iqb.onigiri.bgfront.server.manage.email.service;

import java.util.List;
import java.util.Map;

import com.iqb.onigiri.bgfront.server.manage.email.bean.EmailBean;

public interface IEmailService {

	
	/**
	 * 查询email地址列表
   	 * @Title: getEmailList
	 * @Description: TODO
	 * @param @return    设定文件
	 * @return List<EmailBean>    返回类型
	 * @throws
	 * @author fengruiqi
	 * @2017年4月16日  @下午2:25:24
	 */
	public List<EmailBean> getEmailList();
	
	/**
	 * 查询email地址
	 * @Title: getEmailValue
	 * @Description: TODO
	 * @param @return    设定文件
	 * @return EmailBean    返回类型
	 * @throws
	 * @author fengruiqi
	 * @2017年4月16日  @下午2:26:14
	 */
	public EmailBean  getEmailValue(Integer index);
	
	/**
	 * 增加email地址
	 * @Title: addEmailAddress
	 * @Description: TODO
	 * @param     设定文件
	 * @return void    返回类型
	 * @throws
	 * @author fengruiqi
	 * @2017年4月16日  @下午2:26:59
	 */
	public void  addEmailAddress(Map map);
	
	/**
	 * 修改email地址
	 * @Title: updateEmailAddress
	 * @Description: TODO
	 * @param     设定文件
	 * @return void    返回类型
	 * @throws
	 * @author fengruiqi
	 * @2017年4月16日  @下午2:27:26
	 */
	public void updateEmailAddress(Map map);
} 
