package com.osterhoutgroup.sharedlibraryplugin.http;

import com.google.gson.Gson;
import com.osterhoutgroup.sharedlibraryplugin.models.appitem.BaseAppItem;

/**
 * @author wilbur.yu
 *
 */

public class AppItemRequest extends BaseRequest {
    public BaseAppItem item;
    
    public static AppItemRequest fromJson(String s) {
        return new Gson().fromJson(s, AppItemRequest.class);
    }
    
	@Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
