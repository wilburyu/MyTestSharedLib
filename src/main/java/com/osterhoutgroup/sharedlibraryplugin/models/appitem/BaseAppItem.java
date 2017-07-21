package com.osterhoutgroup.sharedlibraryplugin.models.appitem;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.Gson;

/**
 * @author wilbur.yu
 * 
 *         currency code is referred from
 *         http://www.nationsonline.org/oneworld/currencies.htm
 *
 */
@Entity
@Table(name = "app_items")
public class BaseAppItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;

	private Double price;

	@Column(name = "currency_code")
	private String currencyCode;

	private String description;
	@Column(name = "application_id")
	private Long applicationId;

	@Column(name = "product_id")
	private String productId;

	@Column(name = "sku_id")
	private String skuId;

	private boolean active;

	@Column(name = "created_on")
	private Date createdOn;

	@Column(name = "plan_id")
	private String planId;

	@Column(name = "plan_detail")
	private String planDetail;

	@Column(name = "plan_interval")
	private String planInterval;

	@Column(name = "gateway_code")
	private int gatewayCode;

	@Column(name = "user_id")
	private long userId;

	/**
	 * 0 = app purchase; 1 = in-app; 2 = subscription
	 */
	@Column(name = "item_type")
	private int itemType;

	public BaseAppItem() {

	}

	public BaseAppItem(String name, Double price, String description, long applicationId, String productId, String skuId, boolean active,
			int itemType, String planId, long userId) {
		this.name = name;
		this.price = price;
		this.description = description;
		this.applicationId = applicationId;
		this.productId = productId;
		this.skuId = skuId;
		this.active = active;
		this.planInterval = "month";
		this.currencyCode = "usd";
		this.itemType = itemType;
		this.planId = planId;
		this.userId = userId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setCurrencyCode(String code) {
		this.currencyCode = code;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setDescription(String desp) {
		this.description = desp;
	}

	public String getDescription() {
		return this.description;
	}

	public void setApplicationId(Long id) {
		this.applicationId = id;
	}

	public Long getApplicationId() {
		return this.applicationId;
	}

	public void setProductId(String id) {
		this.productId = id;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setSkuId(String id) {
		this.skuId = id;
	}

	public String getSkuId() {
		return this.skuId;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean getActive() {
		return this.active;
	}

	public String getPlanId() {
		return this.planId;
	}

	public void setPlanId(String id) {
		this.planId = id;
	}

	public String getPlanDetail() {
		return this.planDetail;
	}

	public void setPlanDetail(String detail) {
		this.planDetail = detail;
	}

	public int getItemType() {
		return this.itemType;
	}

	public void setItemType(int type) {
		this.itemType = type;
	}

	public String getPlanInterval() {
		return this.planInterval;
	}

	public void setPlanInterval(String interval) {
		this.planInterval = interval;
	}

	public void setGatewayCode(int code) {
		this.gatewayCode = code;
	}

	public int getGatewayCode() {
		return this.gatewayCode;
	}

	public void setCreatedOn(Date timestamp) {
		this.createdOn = timestamp;
	}

	/**
	 * @return the developerId
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * @param developerId the developerId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	public static BaseAppItem fromJson(String s) {
		return new Gson().fromJson(s, BaseAppItem.class);
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

	public boolean checkIntegrity() {
		boolean isGood = true;
		if (name == null || name.equals("")) {
			isGood = false;
		}
		return isGood;
	}
}
