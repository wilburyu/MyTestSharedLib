package com.osterhoutgroup.sharedlibraryplugin.http;

import java.util.List;

import com.osterhoutgroup.sharedlibraryplugin.models.application.InstalledApp;

public class AppRetrievalRequest {

    private Long userId;
    private String emailAddress;
    private String productModel;
    private Long buildSdk;
    private String buildType;
    private List<InstalledApp> installedApplicationList;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public Long getBuildSdk() {
        return buildSdk;
    }

    public void setBuildSdk(Long buildSdk) {
        this.buildSdk = buildSdk;
    }

    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    public List<InstalledApp> getInstalledApplicationList() {
        return installedApplicationList;
    }

    public void setInstalledApplicationList(List<InstalledApp> installedApplicationList) {
        this.installedApplicationList = installedApplicationList;
    }

}
