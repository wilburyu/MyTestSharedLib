/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.constants;

/**
 * @author wilbur.yu
 *
 */
public class ReceiptServiceConstants {
    public static int RECEIPT_RESULT_OK = 0x130;
    public static int RECEIPT_RESULT_PRODUCT_ID_NOT_FOUND = RECEIPT_RESULT_OK + 1;
    public static int RECEIPT_RESULT_CUSTOM_ID_NOT_FOUND = RECEIPT_RESULT_OK + 2;
    public static int RECEIPT_RESULT_NOT_FOUND = RECEIPT_RESULT_OK + 3;
    public static int RECEIPT_RESULT_ALREADY_CONSUMED = RECEIPT_RESULT_OK + 4;
    public static int RECEIPT_RESULT_PURCHASE_ID_NOT_FOUND = RECEIPT_RESULT_OK + 5;
    public static int RECEIPT_RESULT_DEVELOPER_ID_NOT_FOUND = RECEIPT_RESULT_OK + 6;
    public static int RECEIPT_RESULT_MISSING_DATA = RECEIPT_RESULT_OK + 7;
    public static int RECEIPT_RESULT_UNABLE_TO_READ_DATABASE = RECEIPT_RESULT_OK + 8;

    public static int DURATION_LIFETIME = 0;
    public static int DURATION_ONE_YEAR = DURATION_LIFETIME + 1;
    public static int DURATION_THIRTY_DAYS = DURATION_LIFETIME + 2;
    public static int DURATION_SEVEN_DAYS = DURATION_LIFETIME + 3;
}
