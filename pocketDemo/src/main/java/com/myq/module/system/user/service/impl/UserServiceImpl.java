package com.myq.module.system.user.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myq.module.system.user.dao.UserMapper;
import com.myq.module.system.user.entity.User;
import com.myq.module.system.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	
	@Override
	public User login(String username, String password){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("username", username);
		map.put("password", password);
		return userMapper.login(map);
	}


	@Override
	public int updateSelective(User user){
		return userMapper.updateSelective(user);
	}
	
	
	

}
