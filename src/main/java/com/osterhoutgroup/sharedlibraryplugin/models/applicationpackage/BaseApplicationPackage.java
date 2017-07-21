package com.osterhoutgroup.sharedlibraryplugin.models.applicationpackage;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "application_package")
@SuppressWarnings("serial")
public class BaseApplicationPackage implements Serializable {
	
	public static final int PRIVILEGE_ADMIN = 2;
	public static final int PRIVILEGE_ODG_SERVICE = 1;
	public static final int PRIVILEGE_USER = 0;
	
	protected long id;
	@Column(name="package_name")
	protected String packageName;
	@Column(name="sha1_signature")
	protected String sha1Signature;
	@Column(updatable = false)
	protected Date created_on;
	@Column(name="user_id")
	protected long user_id;
	protected int privilege;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setPackage_name(String name) {
    	this.packageName = name;
    }
    
    public String getPackage_name() {
    	return this.packageName;
    }
    
    public void setSha1_signature(String sig) {
    	this.sha1Signature = sig;
    }
    
    public String getSha1_signature() {
    	return this.sha1Signature;
    }
    
    public Long getUser_id() {
        return this.user_id;
    }

    public void setUser_id(Long id) {
        this.user_id = id;
    }
    
    public void setCreated_on(Date timestamp) {
        this.created_on = timestamp;
    }
    
    public int getPrivilege() {
    	return privilege;
    }
    
    public void setPrivilege(int privilege) {
    	this.privilege = privilege;
    }
}
