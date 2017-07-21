/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.models.userdataanalytics;

import java.util.Date;

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
@Table(name = "application_counter")
public class ApplicationCounter extends CreateAndUpdateTimes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "application_id")
	private long applicationId;

	@Column(name = "view_count")
	private long viewCount;

	@Column(name = "search_count")
	private long searchCount;

	@Column(name = "user_id")
	private long userId;

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
	 * @return the viewCount
	 */
	public long getViewCount() {
		return viewCount;
	}

	/**
	 * @param viewCount
	 *            the viewCount to set
	 */
	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
	}

	/**
	 * @return the searchCount
	 */
	public long getSearchCount() {
		return searchCount;
	}

	/**
	 * @param searchCount
	 *            the searchCount to set
	 */
	public void setSearchCount(long searchCount) {
		this.searchCount = searchCount;
	}
}
