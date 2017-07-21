package com.osterhoutgroup.sharedlibraryplugin.http;

import com.google.gson.Gson;

/**
 * @author gary.qin
 *
 */

public class ScanResponse extends BaseResponse {

	/**
     * app_info Returned rich application information.
     */
    public ScanResult scanResult;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
