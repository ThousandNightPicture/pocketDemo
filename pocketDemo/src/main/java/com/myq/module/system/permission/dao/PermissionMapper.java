package com.myq.module.system.permission.dao;

import java.util.Set;

public interface PermissionMapper {

	Set<String> findPermissionByUserId(Long userId);
	

}
