package com.myq.module.system.user.service;

import com.myq.module.system.user.entity.User;

public interface UserService {

	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @return
	 * @throws Exception
	 */
	User login(String username, String password);

	
	int updateSelective(User user);
	
	
	
	
	
}
