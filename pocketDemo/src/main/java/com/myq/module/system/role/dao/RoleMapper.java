package com.myq.module.system.role.dao;

import java.util.Set;

public interface RoleMapper {

	Set<String> findRoleByUserId(Long userId);

}
