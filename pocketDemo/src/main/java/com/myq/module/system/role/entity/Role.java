package com.myq.module.system.role.entity;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.myq.module.system.permission.entity.Permission;

/**
 * 角色表
 * @author myq
 *
 */
public class Role implements Serializable {
    private Long id;

    private String name;

    private String type;

    private static final long serialVersionUID = 1L;
    
    //***做 role --> permission 一对多处理
    private List<Permission> permissions = new LinkedList<Permission>();
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
    
    public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public String toString(){
    	return JSONObject.toJSONString(this);
    }
}