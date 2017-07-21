/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.constants;

/**
 * @author wilbur.yu
 *
 */
public class AppItemServiceConstants {
	public static final int APP_ITEM_RESULT_OK = 0x30;
    public static final int APP_ITEM_RESULT_EXISTED_NAME = APP_ITEM_RESULT_OK + 1;
    public static final int APP_ITEM_RESULT_EXISTED_SKU_ID = APP_ITEM_RESULT_OK + 2;
    public static final int APP_ITEM_RESULT_MISSING_DATA = APP_ITEM_RESULT_OK + 3;
    public static final int APP_ITEM_RESULT_BAD_REQUEST = APP_ITEM_RESULT_OK + 4;
    public static final int APP_ITEM_RESULT_NOT_FOUND = APP_ITEM_RESULT_OK + 5;
    public static final int APP_ITEM_RESULT_ACCESS_DENIED = APP_ITEM_RESULT_OK + 6;
    public static final int APP_ITEM_RESULT_NOT_ALLOWED_FREE_TO_PAID = APP_ITEM_RESULT_OK + 7;
    public static final int APP_ITEM_RESULT_NOT_AUTHORIZED = APP_ITEM_RESULT_OK + 8;
    public static final int APP_ITEM_RESULT_GATEWAY_NETWORK_ERROR = APP_ITEM_RESULT_OK + 9;
    public static final int APP_ITEM_RESULT_GATEWAY_UNABLE_CREATE = APP_ITEM_RESULT_OK + 10;
    public static final int APP_ITEM_RESULT_UNABLE_TO_CONNECT_DATABASE = APP_ITEM_RESULT_OK + 11;

    public static final int CREATION_PRODUCT = 0x50;
    public static final int CREATION_PLAN = CREATION_PRODUCT + 1;
    public static final int CREATION_SUBSCRIPTION = CREATION_PRODUCT + 2;
}
