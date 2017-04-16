package com.iqb.onigiri.bgfront.server.manage.email.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor;
import com.iqb.onigiri.bgfront.redis.db.RedisOnigiriBusparaDao;
import com.iqb.onigiri.bgfront.server.manage.email.bean.EmailBean;
import com.iqb.onigiri.bgfront.server.manage.email.service.IEmailService;

@Service
public class EmailService implements IEmailService {
	
	@Autowired
	private RedisOnigiriBusparaDao    redisOnigiriBusparaDao ;
	
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
	@Override
	public List<EmailBean> getEmailList() {
		String key="";
		List<String> list=redisOnigiriBusparaDao.getRangeList(key);
		List<EmailBean> beanList=new ArrayList<EmailBean>();
		   int index=0;
		   for(String email:list){
			   		  EmailBean bean=JSON.parseObject(email, EmailBean.class);
			   		  bean.setIndex(index);
			   		  beanList.add(bean) ;
					  index++;
		   }
		return beanList;
	}

	
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
	@Override
	public EmailBean getEmailValue(Integer index) {
		String key="";
		String value=redisOnigiriBusparaDao.getRange(key, index);
		EmailBean bean=JSON.parseObject(value, EmailBean.class);
		return bean;
	}
	
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
	@Override
	public void addEmailAddress(Map map) {
		String key="";
		String value=JSON.toJSONString(map);
		redisOnigiriBusparaDao.leftPush(key, value);
		
	}
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
	@Override
	public void updateEmailAddress(Map map) {
		String key="";
		Integer index=(Integer)map.get("index");
		map.remove("index");
		String value=JSON.toJSONString(map);
		redisOnigiriBusparaDao.setListValue(key, index, value);
		
	}

}
