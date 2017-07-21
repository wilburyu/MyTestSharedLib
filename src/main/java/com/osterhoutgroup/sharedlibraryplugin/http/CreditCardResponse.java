package com.osterhoutgroup.sharedlibraryplugin.http;

import com.google.gson.Gson;

/**
 * @author gary.qin
 *
 */

public class CreditCardResponse extends BaseResponse {

	/**
     * result returned object.
     */
    public Object creditCards;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
