/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.http;

import java.util.List;

import com.google.gson.Gson;
import com.osterhoutgroup.sharedlibraryplugin.models.apirequest.BaseApiRequest;
import com.osterhoutgroup.sharedlibraryplugin.models.apirequestlicensekey.BaseApiRequestLicenseKey;

/**
 * @author wilbur.yu
 *
 */
public class ApiKeyResponse extends BaseResponse {
    public List<BaseApiRequestLicenseKey> apiLicenseList;
    public List<BaseApiRequest> apiList;
    
    public void doInit(int code, String errorMessage, String apiKey) {
        this.code = code;
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
}
