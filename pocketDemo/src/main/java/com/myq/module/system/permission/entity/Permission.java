package com.myq.module.system.permission.entity;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

/**
 * 权限表
 * @author myq
 *
 */
public class Permission implements Serializable {
    private Long id;

    private String url;

    private String name;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    
    public String toString(){
    	return JSONObject.toJSONString(this);
    }
}