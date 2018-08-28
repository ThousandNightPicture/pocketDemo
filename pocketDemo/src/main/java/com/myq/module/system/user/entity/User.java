package com.myq.module.system.user.entity;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.JSONObject;

public class User implements Serializable{
	
	//0:禁止登录
	public static final Long _0 = new Long(0);
	//1:有效
	public static final Long _1 = new Long(1);
	
	private Long id;
	
	/**用户名--登录名*/
	private String username;
	
	/**密码*/
	private String password;
	
	/**昵称*/
	private String nickname;
	
	/**手机号--登录名*/
	private String phone;
	
	/**邮箱--登录名*/
	private String email;
	
	/**状态：0禁止登录；1有效*/
	private Integer status;
	
	/**创建时间*/
	private Date createTime;
	
	/**最后登录时间*/
	private Date lastLoginTime;
	
	/**备注*/
	private String remark;

	public User() {
		super();
	}
	
	public User(User user) {
		this.id = user.getId();
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.nickname = user.getNickname();
		this.phone = user.getPhone();
		this.email = user.getEmail();
		this.status = user.getStatus();
		this.createTime = user.getCreateTime();
		this.lastLoginTime = user.getLastLoginTime();
		this.remark = user.getRemark();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}
	
	
	
	
	
}
