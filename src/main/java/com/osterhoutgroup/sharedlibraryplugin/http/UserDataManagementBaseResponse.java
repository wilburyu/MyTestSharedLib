/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.http;

import java.util.List;

import com.osterhoutgroup.sharedlibraryplugin.http.BaseResponse;
import com.osterhoutgroup.sharedlibraryplugin.models.userdataanalytics.TopDownloadedApp;
import com.osterhoutgroup.sharedlibraryplugin.models.userdataanalytics.UserTopViewedCategory;

/**
 * @author wilbur.yu
 *
 */
public class UserDataManagementBaseResponse extends BaseResponse {
	public List<TopDownloadedApp> topDownloadedAppList;
	public UserTopViewedCategory topUserViwedCatgory;
}
