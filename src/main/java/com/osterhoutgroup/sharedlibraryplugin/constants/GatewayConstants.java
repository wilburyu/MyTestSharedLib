/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.constants;

/**
 * @author wilbur.yu
 *
 */
public class GatewayConstants {
	public enum GATEWAY_ACTION {
		PURCHASE,
		CANCEL_SUBSCRIPTION,
		UPDATE_SUSCRIPTION,
		UPDATE_PLAN,
		RETRIEVE_PLAN,
		RETRIEVE_SUBSCRIPTION,
		CREATE_PRODUCT,
		CREATE_PLAN,
		CREATE_SUBSCRIPTION,
		CREATE_SKU_ID,
		REFUND,
	}

    public static final int GATEWAY_STRIPE = 0;
}
