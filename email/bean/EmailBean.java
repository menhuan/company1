package com.iqb.onigiri.bgfront.server.manage.email.bean;


/**
 * email维护  Bean
 * @ClassName: EmailBean
 * @Description: 
 * @author fengruiqi
 * @date 2017年4月16日 下午2:03:10
 *
 */
public class EmailBean {

	/**
	 * email地址
	 */
	private String email;
	
	/**
	 * email授权密码或者登陆密码
	 */
	private String password;
	
	/**
	 * 是否有效  true 有效 false无效
	 */
	private String check;
	
	/**
	 * redis索引
	 */
	private Integer index;

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}
	
	
}
