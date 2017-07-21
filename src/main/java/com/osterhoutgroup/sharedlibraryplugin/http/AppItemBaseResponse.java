package com.osterhoutgroup.sharedlibraryplugin.http;

import java.util.List;

import com.google.gson.Gson;
import com.osterhoutgroup.sharedlibraryplugin.models.appitem.BaseAppItem;

/**
 * @author wilbur.yu
 *
 */

public class AppItemBaseResponse extends BaseResponse {
    
    public List<BaseAppItem> list;
    
    public void doInit(int code, String errorMessage) {
        this.code = code;
        this.errorMessage = errorMessage;
    }
    
    public static AppItemBaseResponse fromJson(String s) {
        return new Gson().fromJson(s, AppItemBaseResponse.class);
    }
    
	@Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
