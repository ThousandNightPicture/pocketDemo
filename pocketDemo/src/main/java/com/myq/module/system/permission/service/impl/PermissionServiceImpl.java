package com.myq.module.system.permission.service.impl;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myq.module.system.permission.dao.PermissionMapper;
import com.myq.module.system.permission.service.PermissionService;

@Service
public class PermissionServiceImpl implements PermissionService{

	@Autowired
	PermissionMapper permissionMapper;
	
	
	@Override
	public Set<String> findPermissionByUserId(Long userId) {
		return permissionMapper.findPermissionByUserId(userId);
	}

	
	
}
