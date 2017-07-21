package com.osterhoutgroup.sharedlibraryplugin.models.apirequest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.Gson;

@Entity
@Table(name = "api_request")
public class BaseApiRequest {
	protected long id;
	@Column(name="api_request_name")
	protected String api_request_name;
	@Column(name="api_type")
	protected int api_type;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setApi_request_name(String name) {
    	this.api_request_name = name;
    }
    
    public String getApi_request_name() {
    	return this.api_request_name;
    }
    
    public int getApi_type() {
    	return this.api_type;
    }
    
    public void setApi_type(int api_type) {
    	this.api_type = api_type;
    }
    
    public static BaseApiRequest fromJson(String s) {
        return new Gson().fromJson(s, BaseApiRequest.class);
    }
    
	@Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
