/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.http;

import com.google.gson.Gson;

/**
 * @author wilbur.yu
 *
 */
public class ApiKeyRequest extends BaseRequest {
	public static ApiKeyRequest fromJson(String s) {
        return new Gson().fromJson(s, ApiKeyRequest.class);
    }
    
	@Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
