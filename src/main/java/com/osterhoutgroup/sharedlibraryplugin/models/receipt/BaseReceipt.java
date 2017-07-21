package com.osterhoutgroup.sharedlibraryplugin.models.receipt;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "receipt")
public class BaseReceipt {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "customer_id")
	private String customerId;

	@Column(name = "price_plan")
	private int pricePlan;

	@Column(name = "purchase_id")
	private String purchaseId;

	@Column(name = "product_id")
	private String productId;

	@Column(name = "charge_id")
	private String chargeId;

	@Column(name = "purchase_time")
	private Date purchase_time;

	private Double price;

	private String currency;

	@Column(name = "default_fee")
	private Double defaultFee;

	@Column(name = "custom_developer_fee")
	private Double customDeveloperFee;

	@Column(name = "developer_id")
	private long developerId;

	@Column(name = "is_consumed")
	private boolean isConsumed;

	private int gateway;

	@Column(name = "gateway_receipt")
	private String gatewayReceipt;

	@Column(name = "subscription_interval")
	private int subscriptionInterval;

	@Column(name = "item_type")
	private int itemType;

	@Column(name = "subscription_status")
	private int subscriptionStatus;

	@Column(name = "end_time")
	private Date endTime;

	@Column(name = "start_time")
	private Date startTime;

	@Column(name = "is_refunded", nullable = false, columnDefinition = "TINYINT(1)")
	private boolean isRefunded;

	@Column(name = "refunded_receipt")
	private String refundedReceipt;

	@Column(name = "user_id")
	private long userId;

	@Column(name = "is_developer_accepted")
	private boolean isDeveloperAccepted;

	@Column(name = "is_refund_requested")
	private boolean isRefundRequested;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomer_id() {
		return customerId;
	}

	public void setCustomer_id(String id) {
		this.customerId = id;
	}

	public int getPrice_plan() {
		return this.pricePlan;
	}

	public void setPrice_plan(int plan) {
		this.pricePlan = plan;
	}

	public String getPurchase_id() {
		return this.purchaseId;
	}

	public void setPurchase_id(String id) {
		this.purchaseId = id;
	}

	public String getProduct_id() {
		return productId;
	}

	public void setProduct_id(String id) {
		this.productId = id;
	}
	
	public Date getPurchase_time() {
		return this.purchase_time;
	}
	
	public void setPurchase_time(Date time) {
		this.purchase_time = time;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getDefault_fee() {
		return this.defaultFee;
	}

	public void setDefault_fee(Double fee) {
		this.defaultFee = fee;
	}

	public Double getCustom_developer_fee() {
		return this.customDeveloperFee;
	}

	public void setCustom_developer_fee(Double fee) {
		this.customDeveloperFee = fee;
	}

	public boolean getIs_consumed() {
		return isConsumed;
	}

	public void setIs_consumed(boolean flag) {
		this.isConsumed = flag;
	}

	public int getGateway() {
		return this.gateway;
	}

	public void setGateway(int gateway) {
		this.gateway = gateway;
	}

	public String getGateway_receipt() {
		return this.gatewayReceipt;
	}

	public void setGateway_receipt(String receipt) {
		this.gatewayReceipt = receipt;
	}

	public int getItem_type() {
		return itemType;
	}

	public void setItem_type(int type) {
		this.itemType = type;
	}

	public int getSubscriptionInterval() {
		return subscriptionInterval;
	}

	public int getSubscription_status() {
		return subscriptionStatus;
	}

	public void setSubscription_status(int status) {
		this.subscriptionStatus = status;
	}

	public void setSubscription_interval(int interval) {
		this.subscriptionInterval = interval;
	}

	public void setStart_time(Date time) {
		this.startTime = time;
	}

	public Date getStart_time() {
		return this.startTime;
	}

	public void setEnd_time(Date time) {
		this.endTime = time;
	}

	public Date getEnd_time() {
		return this.endTime;
	}

	public boolean getIs_refunded() {
		return this.isRefunded;
	}

	public void setIs_refunded(boolean flag) {
		this.isRefunded = flag;
	}

	public String getRefunded_receipt() {
		return this.refundedReceipt;
	}

	public void setRefunded_receipt(String receipt) {
		this.refundedReceipt = receipt;
	}

	public void init(String customerId, int pricePlan, String chargeId, String productId, String purchaseId, Double price, String currency,
			Double defaultFee, Double customDeveloperFee, long developerId, boolean isConsumed, int gateway,
			String gatewayReceipt, int subscriptionInterval, int itemType, int subscriptionStatus) {
		this.customerId = customerId;
		this.pricePlan = pricePlan;
		this.purchaseId = purchaseId;
		this.productId = productId;
		this.chargeId = chargeId;
		this.price = price;
		this.currency = currency;
		this.defaultFee = defaultFee;
		this.customDeveloperFee = customDeveloperFee;
		this.developerId = developerId;
		this.isConsumed = isConsumed;
		this.gateway = gateway;
		this.gatewayReceipt = gatewayReceipt;
		this.subscriptionInterval = subscriptionInterval;
		this.itemType = itemType;
		this.subscriptionStatus = subscriptionStatus;
	}

	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/**
	 * @return the chargeId
	 */
	public String getChargeId() {
		return chargeId;
	}

	/**
	 * @param chargeId the chargeId to set
	 */
	public void setChargeId(String chargeId) {
		this.chargeId = chargeId;
	}

	/**
	 * @return the developerId
	 */
	public long getDeveloperId() {
		return developerId;
	}

	/**
	 * @param developerId the developerId to set
	 */
	public void setDeveloperId(long developerId) {
		this.developerId = developerId;
	}

	/**
	 * @return the isDevelopedAccepted
	 */
	public boolean isDeveloperAccepted() {
		return isDeveloperAccepted;
	}

	/**
	 * @param isDevelopedAccepted the isDevelopedAccepted to set
	 */
	public void setDeveloperAccepted(boolean isDeveloperAccepted) {
		this.isDeveloperAccepted = isDeveloperAccepted;
	}

	/**
	 * @return the isRefundRequested
	 */
	public boolean isRefundRequested() {
		return isRefundRequested;
	}

	/**
	 * @param isRefundRequested the isRefundRequested to set
	 */
	public void setRefundRequested(boolean isRefundRequested) {
		this.isRefundRequested = isRefundRequested;
	}
}
