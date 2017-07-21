/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.http;

/**
 * @author wilbur.yu
 *
 */
public class ReceiptRequest extends BaseRequest {
	/**
	 * Can be customer_id, product_id and purchase_id
	 */
    public String id;

    /**
     * Refers to duration constants in ReceiptServiceConstants
     * 0 = lifetime, 1 = 7 days, 2 = 30 days, 3 = yearly
     */
    public int duration;

    /**
     * Refers to PURCHASE_ITEM_TYPE* in PurchaseServiceConstants.
     */
    public int itemType;
}
