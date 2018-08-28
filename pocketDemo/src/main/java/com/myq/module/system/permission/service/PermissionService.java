package com.myq.module.system.permission.service;

import java.util.Set;

public interface PermissionService {

	Set<String> findPermissionByUserId(Long userId);

}
