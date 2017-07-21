/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.http;

import com.google.gson.Gson;

/**
 * @author wilbur.yu
 *
 */
public class BaseResponse {

	public int code;
    public String errorMessage;
    public boolean isValid;
	public String apiKey;

	public String accessToken;
	public String refreshToken;
	public String emailAddress;

	public void doInit(int result, String errorMessage, String apiKey) {
		this.code = result;
        this.errorMessage = errorMessage;
		this.apiKey = apiKey;
	}

    public static BaseResponse fromJson(String s) {
        return new Gson().fromJson(s, BaseResponse.class);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public String jsonToString() {
        return new Gson().toJson(this);
    }
}
