/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.models.userdataanalytics;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.google.gson.Gson;
import com.osterhoutgroup.sharedlibraryplugin.models.CreateAndUpdateTimes;

/**
 * @author wilbur.yu
 *
 */
@Entity
@Table(name = "user_top_viewed_category")
public class UserTopViewedCategory extends CreateAndUpdateTimes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "user_id")
	private long userId;

	private int ranking;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "category_counter_fk")
	private CategoryCounter categoryCounterFk;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

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
	 * @return the categoryCounterFk
	 */
	public CategoryCounter getCategoryCounterFk() {
		return categoryCounterFk;
	}

	/**
	 * @param categoryCounterFk
	 *            the categoryCounterFk to set
	 */
	public void setCategoryCounterFk(CategoryCounter categoryCounterFk) {
		this.categoryCounterFk = categoryCounterFk;
	}

	/**
	 * @return the ranking
	 */
	public int getRanking() {
		return ranking;
	}

	/**
	 * @param ranking
	 *            the ranking to set
	 */
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
