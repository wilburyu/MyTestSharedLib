package com.osterhoutgroup.sharedlibraryplugin.http;

import java.util.Map;

import org.springframework.http.HttpMethod;

import com.google.gson.Gson;

/**
 * @author wilbur.yu
 *
 */

public class GatewayRequest extends BaseRequest {
	/**
	 * In Plan, name of the plan, to be displayed on invoices and in the web
	 * interface.
	 * 
	 * In product, product name.
	 */
	public String name;

	/**
	 * User defined product description.
	 */
	public String description;

	/**
	 * Generated product, sku, plan or subscription id
	 */
	public String id;

	/**
	 * Price in cents.
	 * 
	 * In subscription, a positive integer in cents (or 0 for a free plan)
	 * representing how much to charge (on a recurring basis).
	 */
	public double amount;

	/**
	 * currency symbol
	 * 
	 * Ex: usd
	 */
	public String currency;

	/**
	 * Subscription interval: day, month, year.
	 */
	public String interval;

	/**
     * gateway card number
     */
    public String cardNumber;

    /**
     * gateway card expiration month
     */
    public String cardExpMonth;

    /**
     * gateway card expiration year
     */
    public String cardExpYear;

    /**
     * gateway card security code
     */
    public String securityCode;

    /**
     * gateway is primary card
     */
    public boolean primary;

    /**
     * gateway generated card token
     */
    public String cardToken;

	/**
	 * gateway generated customer id
	 */
    public String customerId;

	/**
	 * Service assigned http method
	 */
    public HttpMethod httpMethod;

	/**
	 * Arguments required by gateway's put methods.
	 */
	public Map<String, Object> uriArguments;  //For Put methods!

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
