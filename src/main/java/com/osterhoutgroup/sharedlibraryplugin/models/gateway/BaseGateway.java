package com.osterhoutgroup.sharedlibraryplugin.models.gateway;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author wilbur.yu
 *
 */
@Entity
@Table(name = "gateway")
public class BaseGateway {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Column(name = "gateway_code")
	private int gatewayCode;

	private String company;

	@Column(name = "api_key")
	private String apiKey;

	@Column(name = "creation_date", updatable = false)
	private Date creationDate;

	@Column(name = "odg_service_name")
	private String odgServiceName;

	@Column(name = "is_active")
	private boolean isActive;

	@Column(name = "odg_service_api_version")
	private String odgServiceApiVersion;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGateway_code() {
		return this.gatewayCode;
	}

	public void setGateway_code(int code) {
		this.gatewayCode = code;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getOdg_service_name() {
		return this.odgServiceName;
	}

	public void setOdg_service_name(String name) {
		this.odgServiceName = name;
	}

	public String getOdg_service_api_version() {
		return this.odgServiceApiVersion;
	}

	public void setOdg_service_api_version(String version) {
		this.odgServiceApiVersion = version;
	}

	public Date getCreation_date() {
		return this.creationDate;
	}

	public void setCreation_date(Date date) {
		this.creationDate = date;
	}

	public boolean getIs_active() {
		return this.isActive;
	}

	public void setIs_active(boolean flag) {
		this.isActive = flag;
	}
}
