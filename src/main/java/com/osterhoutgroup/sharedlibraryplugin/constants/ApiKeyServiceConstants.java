/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.constants;

/**
 * @author wilbur.yu
 *
 */
public class ApiKeyServiceConstants {
	public static final int APIKEY_OK = 0x10;
	public static final int APIKEY_ALREADY_EXISTED = APIKEY_OK + 1;
	public static final int APIKEY_MISSING_DATA = APIKEY_OK + 2;
	public static final int APIKEY_ACCESS_DENIED = APIKEY_OK + 3;
	public static final int APIKEY_NOT_FOUND_IN_API_LIST = APIKEY_OK + 4;
	public static final int APIKEY_NOT_FOUND = APIKEY_OK + 5;
	public static final int APIKEY_BAD_REQUEST = APIKEY_OK + 6;
	public static final int APIKEY_NOT_AUTHORIZED = APIKEY_OK + 7;
}
