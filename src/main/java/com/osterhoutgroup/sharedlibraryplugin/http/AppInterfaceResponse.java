/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.http;

import java.util.List;

import com.osterhoutgroup.sharedlibraryplugin.http.BaseResponse;
import com.osterhoutgroup.sharedlibraryplugin.models.buildtype.BaseBuildType;
import com.osterhoutgroup.sharedlibraryplugin.models.category.BaseCategory;
import com.osterhoutgroup.sharedlibraryplugin.models.productmodel.BaseProductModel;
import com.osterhoutgroup.sharedlibraryplugin.models.region.BaseRegion;

/**
 * @author wilbur.yu
 *
 */
public class AppInterfaceResponse extends BaseResponse {
    public List<BaseCategory> categoryList;
    public List<BaseProductModel> productModelList;
    public List<BaseRegion> regionList;
    public List<BaseBuildType> buildTypeList;
}
