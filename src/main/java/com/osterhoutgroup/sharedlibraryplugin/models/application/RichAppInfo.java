package com.osterhoutgroup.sharedlibraryplugin.models.application;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.osterhoutgroup.sharedlibraryplugin.models.buildtype.BaseBuildType;
import com.osterhoutgroup.sharedlibraryplugin.models.productmodel.BaseProductModel;
import com.osterhoutgroup.sharedlibraryplugin.models.region.BaseRegion;

public class RichAppInfo {
    /**
     * application Returned application.
     */
    private BaseApplication application;

    /**
     * build_types Returned list of BaseBuildType.
     */
    @JsonProperty("build_types")
    private List<BaseBuildType> buildTypes;

    /**
     * product_models Returned list of BaseProductModel.
     */
    @JsonProperty("product_models")
    private List<BaseProductModel> productModels;

    /**
     * regions Returned list of BaseRegion.
     */
    private List<BaseRegion> regions;

    public BaseApplication getApplication() {
        return application;
    }

    public void setApplication(BaseApplication application) {
        this.application = application;
    }

    public List<BaseBuildType> getBuildTypes() {
        return buildTypes;
    }

    public void setBuildTypes(List<BaseBuildType> buildTypes) {
        this.buildTypes = buildTypes;
    }

    public List<BaseProductModel> getProductModels() {
        return productModels;
    }

    public void setProductModels(List<BaseProductModel> productModels) {
        this.productModels = productModels;
    }

    public List<BaseRegion> getRegions() {
        return regions;
    }

    public void setRegions(List<BaseRegion> regions) {
        this.regions = regions;
    }
}
