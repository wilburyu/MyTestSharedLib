/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.http;

import com.osterhoutgroup.sharedlibraryplugin.http.BaseResponse;
import com.osterhoutgroup.sharedlibraryplugin.models.category.BaseCategory;
import com.osterhoutgroup.sharedlibraryplugin.models.productmodel.BaseProductModel;
import com.osterhoutgroup.sharedlibraryplugin.models.region.BaseRegion;

/**
 * @author wilbur.yu
 *
 */
public class AdminSettingsResponse extends BaseResponse {
	public BaseCategory category;
	public BaseProductModel productModel;
	public BaseRegion region;
}
