/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.models.appsettings;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.osterhoutgroup.sharedlibraryplugin.models.CreateAndUpdateTimes;

/**
 * @author wilbur.yu
 *
 */
@Entity
@Table(name = "settings")
public class BaseAppSettings extends CreateAndUpdateTimes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "num_of_apps_per_page")
	private Long num_of_apps_per_page;

	@Column(name = "server_status")
	private int server_status;

	@Column(name = "server_status_message")
	private String server_status_message;

	@Column(name = "default_fee")
	private Double default_fee;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setNumOfAppsPerPage(Long num) {
		this.num_of_apps_per_page = num;
	}

	public Long getNumOfAppsPerPage() {
		return this.num_of_apps_per_page;
	}

	public void setServerStatus(int status) {
		this.server_status = status;
	}

	public int getServerStatus() {
		return this.server_status;
	}

	public void setServerStatusMessage(String message) {
		this.server_status_message = message;
	}

	public String getServerStatusMessage() {
		return this.server_status_message;
	}

	public void setDefaultFee(Double fee) {
		this.default_fee = fee;
	}

	public Double getDefaultFee() {
		return this.default_fee;
	}
}
