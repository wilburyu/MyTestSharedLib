package com.osterhoutgroup.sharedlibraryplugin.http;

import com.google.gson.Gson;

/**
 * @author gary.qin
 *
 */

public class AppRetrievalResponse extends BaseResponse {

	/**
     * result returned object.
     */
    public Object apps;

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
