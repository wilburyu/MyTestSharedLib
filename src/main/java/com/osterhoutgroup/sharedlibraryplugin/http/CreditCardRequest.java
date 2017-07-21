package com.osterhoutgroup.sharedlibraryplugin.http;

import com.google.gson.Gson;

/**
 * @author gary.qin
 *
 */

public class CreditCardRequest extends BaseRequest {
	/**
     * In Token or Card, card holder name.
     */
	public String name;

	/**
     * Generated token id
     */
    public String tokenId;

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
     * gateway generated card token
     */
    public String cardToken;

    /**
     * gateway generated customer id
     */
    public String customerId;

    /**
     * gateway is card active
     */
    public boolean active;

    /**
     * gateway is card primary
     */
    public boolean primary;

    @Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
