/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.models.wishlist;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.osterhoutgroup.sharedlibraryplugin.models.CreateAndUpdateTimes;

/**
 * @author wilbur.yu
 *
 */
@Entity
@Table(name = "wishlist")
public class BaseWishList extends CreateAndUpdateTimes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_id")
    @JsonProperty("user_id")
    private Long userId;

	@Column(name = "customer_id")
    @JsonProperty("customer_id")
    private String customerId;

    @Column(name = "application_id")
    @JsonProperty("application_id")
    private Long applicationId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }
}
