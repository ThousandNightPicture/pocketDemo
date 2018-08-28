package com.myq.module.system.role.service;

import java.util.Set;

public interface RoleService {

	Set<String> findRoleByUserId(Long userId);
	
	

}
