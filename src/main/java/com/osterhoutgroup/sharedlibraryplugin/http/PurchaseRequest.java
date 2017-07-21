package com.osterhoutgroup.sharedlibraryplugin.http;

import com.google.gson.Gson;

/**
 * Call from another service or frontend
 *
 * @author wilbur.yu
 * 
 */
public class PurchaseRequest extends BaseRequest {

	public String type; // Value must be “inapp” for an in-app product or "subs"
						// for subscriptions.

	public String productId;

	public int newStatus;

	public Double price;

	public String currency;

	public int pricePlan;

	public String cardToken;

	public long developerId;
	public String customerId;

	public int itemType;
	public int subscriptionType;

	public Double defaultFee;
	public Double customDeveloperFee;

	public String purchaseId; // Could be skuId, planId, subscriptionId;
	
	public String name;
	public String trialPeriodDays; //for updating plan!!

	public static PurchaseRequest fromJson(String s) {
		return new Gson().fromJson(s, PurchaseRequest.class);
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
