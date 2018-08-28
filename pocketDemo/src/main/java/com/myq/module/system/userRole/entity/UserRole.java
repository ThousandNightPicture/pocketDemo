package com.myq.module.system.userRole.entity;

import java.io.Serializable;


public class UserRole implements Serializable {
	
	/**{@link User.id}*/
    private Long uid;

    /**{@link Role.id}*/
    private Long rid;

    private static final long serialVersionUID = 1L;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }
}