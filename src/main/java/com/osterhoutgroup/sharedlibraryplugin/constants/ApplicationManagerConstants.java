/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.constants;

/**
 * @author wilbur.yu
 *
 */
public class ApplicationManagerConstants {
    public static final int TESTER_RESULT_OK = 0x130;
    public static final int TESTER_RESULT_TESTER_NOT_FOUND = TESTER_RESULT_OK + 1;
    public static final int TESTER_RESULT_EMAIL_LIST_NOT_FOUND = TESTER_RESULT_OK + 2;
    public static final int TESTER_RESULT_UNABLE_TO_STORE_RECORD = TESTER_RESULT_OK + 3;
    public static final int TESTER_RESULT_LIST_NAME_MISSING = TESTER_RESULT_OK + 4;
    public static final int TESTER_RESULT_NOT_AUTHORIZED = TESTER_RESULT_OK + 5;
    public static final int TESTER_RESULT_UNABLE_TO_READ_DATABASE = TESTER_RESULT_OK + 6;
    public static final int TESTER_RESULT_ALREADY_EXIST = TESTER_RESULT_OK + 7;

    public static final int APPLICATION_VERSION_RESULT_OK = 0x150;
    public static final int APPLICATION_VERSION_RESULT_APPLICATION_NOT_FOUND = APPLICATION_VERSION_RESULT_OK + 1;
    public static final int APPLICATION_VERSION_RESULT_VERSION_MISSING = APPLICATION_VERSION_RESULT_OK + 2;
    public static final int APPLICATION_VERSION_RESULT_NOT_AUTHORIZED = APPLICATION_VERSION_RESULT_OK + 3;
    public static final int APPLICATION_VERSION_RESULT_UNABLE_TO_MIGRATE = APPLICATION_VERSION_RESULT_OK + 4;
    public static final int APPLICATION_VERSION_RESULT_UNABLE_TO_READ_DATABASE = APPLICATION_VERSION_RESULT_OK + 5;

    public static final int APPROVAL_RESULT_OK = 0x170;
    public static final int APPROVAL_RESULT_UNABLE_TO_UPDATE = APPROVAL_RESULT_OK + 1;
    public static final int APPROVAL_RESULT_APPLICATION_NOT_FOUND = APPROVAL_RESULT_OK + 2;
    public static final int APPROVAL_RESULT_NOT_AUTHORIZED = APPROVAL_RESULT_OK + 3;
    public static final int APPROVAL_RESULT_UNABLE_TO_READ_DATABASE = APPROVAL_RESULT_OK + 4;

    public static final int ACTIVATE_RESULT_OK = 0x190;
    public static final int ACTIVATE_RESULT_UNABLE_TO_UPDATE = APPROVAL_RESULT_OK + 1;
    public static final int ACTIVATE_RESULT_APPLICATION_NOT_FOUND = APPROVAL_RESULT_OK + 2;
    public static final int ACTIVATE_RESULT_NOT_AUTHORIZED = APPROVAL_RESULT_OK + 3;
    public static final int ACTIVATE_RESULT_UNABLE_TO_READ_DATABASE = APPROVAL_RESULT_OK + 4;

    public static final int FEATURED_RESULT_OK = 0x210;
    public static final int FEATURED_RESULT_UNABLE_TO_UPDATE = APPROVAL_RESULT_OK + 1;
    public static final int FEATURED_RESULT_APPLICATION_NOT_FOUND = APPROVAL_RESULT_OK + 2;
    public static final int FEATURED_RESULT_NOT_AUTHORIZED = APPROVAL_RESULT_OK + 3;
    public static final int FEATURED_RESULT_UNABLE_TO_READ_DATABASE = APPROVAL_RESULT_OK + 4;

    public static final int WISHLIST_RESULT_OK = 0x230;
    public static final int WISHLIST_RESULT_UNABLE_TO_ADD = WISHLIST_RESULT_OK + 1;
    public static final int WISHLIST_RESULT_NOT_AUTHORIZED = WISHLIST_RESULT_OK + 2;
    public static final int WISHLIST_RESULT_UNABLE_TO_REMOVE = WISHLIST_RESULT_OK + 3;
    public static final int WISHLIST_RESULT_ALREADY_EXIST = WISHLIST_RESULT_OK + 4;
    public static final int WISHLIST_RESULT_MISSING_DATA = WISHLIST_RESULT_OK + 5;
    public static final int WISHLIST_RESULT_UNABLE_TO_READ_DATABASE = WISHLIST_RESULT_OK + 6;

    public static final int APPINTERFACE_RESULT_OK = 0x250;
    public static final int APPINTERFACE_RESULT_UNABLE_READ_DATABASE = APPINTERFACE_RESULT_OK + 1;

    public static final int APP_TYPE_PRODUCTION = 0;
    public static final int APP_TYPE_BETA = 1;
    public static final int APP_TYPE_ALPHA = 2;
}
