package com.myq.module.system.user.dao;

import java.util.Map;

import com.myq.module.system.user.entity.User;

public interface UserMapper {
	
	
	User login(Map<String, Object> map);
	
	int updateSelective(User user);
	
	
	

}
