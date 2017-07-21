package com.osterhoutgroup.sharedlibraryplugin.http;

import com.google.gson.Gson;
import com.osterhoutgroup.sharedlibraryplugin.models.application.RichAppInfo;

/**
 * @author gary.qin
 *
 */

public class ApplicationResponse extends BaseResponse {

	/**
     * app_info Returned rich application information.
     */
    public RichAppInfo appInfo;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
