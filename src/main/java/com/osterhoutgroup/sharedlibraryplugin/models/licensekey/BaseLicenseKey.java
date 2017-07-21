package com.osterhoutgroup.sharedlibraryplugin.models.licensekey;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "licence_key")
public class BaseLicenseKey {
	protected long id;
	@Column(name="application_package_id")
	protected long applicationPackageId;
	@Column(name="licence_key")
	protected String licenseKey;
	@Column(name="is_valid")
	protected boolean isValid;
	@Column(updatable = false)
	protected Date updated_on;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setIs_valid(boolean valid) {
    	this.isValid = valid;
    }
    
    public boolean getIs_valid() {
    	return this.isValid;
    }
    
    public void setLicence_key(String key) {
    	this.licenseKey = key;
    }
    
    public String getLicence_key() {
    	return this.licenseKey;
    }
    
    public void setApplication_package_id(long id) {
    	this.applicationPackageId = id;
    }
    
    public long getApplication_package_id() {
    	return this.applicationPackageId;
    }
    
    public void setCreated_on(Date timestamp) {
        this.updated_on = timestamp;
    }
}
