/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.http;

import com.google.gson.Gson;

/**
 * @author wilbur.yu
 *
 */
public class BaseRequest {
	public String adminPackage; // Caller application or ODG service package
									// name!!
	public String adminFingerprint;
	public String adminApiKey;


	public String emailAddress;
	public String accessToken;
	public String refreshToken;
	public String userPassword;
	public String clientId;
	public String clientSecret;

	public String packageName; // package name of the app that you want to
								// create an api key for. used to create new api
								// key!!!
	public String fingerPrint;
	public String apiKey;


	public long[] apiList;

	public long userId;
	public boolean isValid;

	public static BaseRequest fromJson(String s) {
		return new Gson().fromJson(s, BaseRequest.class);
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
