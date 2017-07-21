/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.constants;

/**
 * @author wilbur.yu
 *
 */
public class PurchaseServiceConstants {
    public static final int SUBSCRIPTION_RESULT_VALID = 0x70;
    public static final int SUBSCRIPTION_RESULT_EXPIRED = SUBSCRIPTION_RESULT_VALID + 1;
    public static final int SUBSCRIPTION_RESULT_INVALID = SUBSCRIPTION_RESULT_VALID + 2;
    public static final int SUBSCRIPTION_RESULT_NOT_AUTHORIZED = SUBSCRIPTION_RESULT_VALID + 3;
    public static final int SUBSCRIPTION_RESULT_NOT_FOUND = SUBSCRIPTION_RESULT_VALID + 4;
    public static final int SUBSCRIPTION_RESULT_OLD_GATEWAY_INACTIVE = SUBSCRIPTION_RESULT_VALID + 5;
    public static final int SUBSCRIPTION_RESULT_ACCESS_DENIED = SUBSCRIPTION_RESULT_VALID + 7;
    public static final int SUBSCRIPTION_RESULT_GATEWAY_CONNECTION_ERROR = SUBSCRIPTION_RESULT_VALID + 8;
    public static final int SUBSCRIPTION_RESULT_OK = SUBSCRIPTION_RESULT_VALID + 9;
    public static final int SUBSCRIPTION_RESULT_UNABLE_TO_CONNECT_TO_DATABASE = SUBSCRIPTION_RESULT_VALID + 10;

    public static final int PURCHASE_RESULT_OK = 0x90;
    public static final int PURCHASE_RESULT_GATEWAY_CONNECTION_FAILURE = PURCHASE_RESULT_OK + 1;
    public static final int PURCHASE_RESULT_CREDIT_CARD_EXPIRED = PURCHASE_RESULT_OK + 2;
    public static final int PURCHASE_RESULT_CREDIT_CARD_INVALID = PURCHASE_RESULT_OK + 3;
    public static final int PURCHASE_RESULT_GATEWAY_UNKNOWN_ERROR = PURCHASE_RESULT_OK + 4;
    public static final int PURCHASE_RESULT_NOT_AUTHORIZED = PURCHASE_RESULT_OK + 5;
    public static final int PURCHASE_RESULT_ALREADY_EXISTED = PURCHASE_RESULT_OK + 6;
    public static final int PURCHASE_RESULT_INVLAID = PURCHASE_RESULT_OK + 7;
    public static final int PURCHASE_RESULT_OLD_GATEWAY_INACTIVE = PURCHASE_RESULT_OK + 8;
    public static final int PURCHASE_RESULT_GATEWAY_CONNECTION_ERROR = PURCHASE_RESULT_OK + 9;
    public static final int PURCHASE_RESULT_MISSING_DATA = PURCHASE_RESULT_OK + 10;
    public static final int PURCHASE_RESULT_UNABLE_TO_CONNECT_TO_DATABASE = PURCHASE_RESULT_OK + 11;

    public static final int REFUND_RESULT_OK = 0x110;
    public static final int REFUND_RESULT_NOT_AUTHORIZED = REFUND_RESULT_OK + 1;
    public static final int REFUND_RESULT_OLD_GATEWAY_INACTIVE = REFUND_RESULT_OK + 2;
    public static final int REFUND_RESULT_EXPIRED = REFUND_RESULT_OK + 3;
    public static final int REFUND_RESULT_GATEWAY_CONNECTION_ERROR = REFUND_RESULT_OK + 4;
    public static final int REFUND_RESULT_NOT_FOUND = REFUND_RESULT_OK + 5;
    public static final int REFUND_RESULT_GATEWAY_UNKNOWN_ERROR = REFUND_RESULT_OK + 6;
    public static final int REFUND_RESULT_ALREADY_REFUNDED = REFUND_RESULT_OK + 7;
    public static final int REFUND_RESULT_NOT_YET = REFUND_RESULT_OK + 8;
    public static final int REFUND_RESULT_UNABLE_TO_CONNECT_TO_DATABASE = REFUND_RESULT_OK + 9;

    public static final int PURCHASE_ITEM_TYPE_APP = 0;
    public static final int PURCHASE_ITEM_TYPE_INAPP = PURCHASE_ITEM_TYPE_APP + 1;
    public static final int PURCHASE_ITEM_TYPE_SUB = PURCHASE_ITEM_TYPE_APP + 2;
    /**
     * Used to retrieve all retrieves item types!!!!!!
     */
    public static final int PURCHASE_ITEM_TYPE_ALL = -1;

    public static final int SUBSCRIPTION_INTERVAL_NONE = 0;
    public static final int SUBSCRIPTION_INTERVAL_MONTHLY = 1;
    public static final int SUBSCRIPTION_INTERVAL_HALF_YEAR = 2;
    public static final int SUBSCRIPTION_INTERVAL_YEARLY = 3;

    public static final int SUBSCRIPTION_STATUS_NONE = 0x0;
    public static final int SUBSCRIPTION_STATUS_TRIALING = SUBSCRIPTION_STATUS_NONE + 1;
    public static final int SUBSCRIPTION_STATUS_ACTIVE = SUBSCRIPTION_STATUS_NONE + 2;
    public static final int SUBSCRIPTION_STATUS_PAST_DUE = SUBSCRIPTION_STATUS_NONE + 3;
    public static final int SUBSCRIPTION_STATUS_CANCELED = SUBSCRIPTION_STATUS_NONE + 4;
    public static final int SUBSCRIPTION_STATUS_UNPAID = SUBSCRIPTION_STATUS_NONE + 5;
//    public static final int SUBSCRIPTION_STATUS_OK = SUBSCRIPTION_STATUS_NONE + 6;
//    public static final int SUBSCRIPTION_STATUS_DENIED_ACCESS = SUBSCRIPTION_STATUS_NONE + 7;
}
