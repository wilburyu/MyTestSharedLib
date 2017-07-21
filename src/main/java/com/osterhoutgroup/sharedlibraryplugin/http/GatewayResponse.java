package com.osterhoutgroup.sharedlibraryplugin.http;

import com.google.gson.Gson;

/**
 * @author wilbur.yu
 *
 */

public class GatewayResponse extends BaseResponse {
	/**
     * public static final int SUBSCRIPTION_STATUS_NONE = 0x0;
     * public static final int SUBSCRIPTION_STATUS_TRIALING = SUBSCRIPTION_STATUS_NONE + 1;
     * public static final int SUBSCRIPTION_STATUS_ACTIVE = SUBSCRIPTION_STATUS_NONE + 2;
     * public static final int SUBSCRIPTION_STATUS_PAST_DUE = SUBSCRIPTION_STATUS_NONE + 3;
     * public static final int SUBSCRIPTION_STATUS_CANCELED = SUBSCRIPTION_STATUS_NONE + 4;
     * public static final int SUBSCRIPTION_STATUS_UNPAID = SUBSCRIPTION_STATUS_NONE + 5;
	 */
	public int status;

	/**
	 * gateway's representative code: 0 = stripe.
	 */
    public int gatewayCode;

	/**
     * original object from gateway.
     */
    public Object detail;

	/**
	 * Gatway generated sku id, plan id or subscription id;
	 */
	public String id;

	/**
     * Gatway generated card finger print.
     */
    public String cardFingerprint;

    /**
     * Gatway generated card type.
     */
    public String cardType;

    /**
     * Gatway the last 4 digits of generated card.
     */
    public String cardLast4;

    /**
     * Subscription interval: day, month, year.
     */
	public String interval;

	/**
     * Start of the current period that the subscription has been invoiced for.
     */
    public Long currentPeriodStart;

	/**
     * Subscription end of the current period that the subscription has been
     * invoiced for. At the end of this period, a new invoice will be created.
     */
    public Long currentPeriodEnd;

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
