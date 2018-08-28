package com.myq.module.system.rolePermission.entity;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

/**
 * 角色和权限中间表
 * @author myq
 *
 */
public class RolePermission implements Serializable {
	
	/**{@link Role.id}*/
    private Long rid;

    /**{@link PermissionService.id}*/
    private Long pid;

    private static final long serialVersionUID = 1L;

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }
    
    public String toString(){
    	return JSONObject.toJSONString(this);
    }
}