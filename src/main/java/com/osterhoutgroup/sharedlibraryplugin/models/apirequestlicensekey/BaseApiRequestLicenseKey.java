package com.osterhoutgroup.sharedlibraryplugin.models.apirequestlicensekey;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "api_request_licence_key")
public class BaseApiRequestLicenseKey {
	protected long id;
	@Column(name="api_request_id")
	protected long api_request_id;
	@Column(name="licence_key_id")
	protected long license_key_id;
    @Column(updatable = false)
    protected Date created_on;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setApi_request_id(long id) {
    	this.api_request_id = id;
    }
    
    public Long getApi_request_id() {
    	return this.api_request_id;
    }
    
    public void setLicence_key_id(long id) {
    	license_key_id = id;
    }
    
    public Long getLicence_key_id() {
    	return this.license_key_id;
    }
    
    public void setCreated_on(Date timestamp) {
        this.created_on = timestamp;
    }
}
