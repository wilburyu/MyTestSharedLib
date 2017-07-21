/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.http;

import java.util.List;

import com.google.gson.Gson;
import com.osterhoutgroup.sharedlibraryplugin.models.receipt.BaseReceipt;

/**
 * @author wilbur.yu
 *
 */
public class RefundResponse extends BaseResponse {
	public List<BaseReceipt> receipts;
	
	@Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
