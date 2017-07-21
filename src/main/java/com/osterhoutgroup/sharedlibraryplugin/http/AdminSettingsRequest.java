/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.http;

import com.osterhoutgroup.sharedlibraryplugin.http.BaseRequest;

/**
 * @author wilbur.yu
 *
 */
public class AdminSettingsRequest extends BaseRequest {
	//Don't use enum because it is going to be called from frontend.
	public static final int ACTION_NONE = 0;
	public static final int ACTION_ADD = 100;
	public static final int ACTION_REMOVE = 200;

	public Long id;

	public String name;
	public String description;

	public String continent;
	public String country;
	public String code;
	public boolean active;

	public int action;

	public Long appPerPage;
	public Double defaultFee;
	public int serverStatus;
	public String serverStatusMessage;
}
