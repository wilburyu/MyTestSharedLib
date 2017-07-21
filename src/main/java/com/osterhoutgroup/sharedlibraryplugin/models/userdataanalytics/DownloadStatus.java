/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.models.userdataanalytics;

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
@Table(name = "download_status")
public class DownloadStatus extends CreateAndUpdateTimes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "serial_number")
	private String serialNumber;

	@Column(name = "mac_address")
	private String macAddress;

	@Column(name = "user_id")
	private long userId;

	@Column(name = "application_id")
	private long applicationId;

	@Column(name = "application_version_id")
	private long applicationVersionId;

	@Column(name = "ip_address")
	private String ipAddress;

	private long count;

	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/**
	 * @return the applicationVersionId
	 */
	public long getApplicationVersionId() {
		return applicationVersionId;
	}

	/**
	 * @param applicationVersionId
	 *            the applicationVersionId to set
	 */
	public void setApplicationVersionId(long applicationVersionId) {
		this.applicationVersionId = applicationVersionId;
	}

	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * @param ipAddress
	 *            the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * @return the count
	 */
	public long getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(long count) {
		this.count = count;
	}

	/**
	 * @return the applicationId
	 */
	public long getApplicationId() {
		return applicationId;
	}

	/**
	 * @param applicationId
	 *            the applicationId to set
	 */
	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * @return the macAddress
	 */
	public String getMacAddress() {
		return macAddress;
	}

	/**
	 * @param macAddress the macAddress to set
	 */
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
}
