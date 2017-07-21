package com.osterhoutgroup.sharedlibraryplugin.models.application;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InstalledApp {

    @JsonProperty("package_name")
    private String packageName;

    @JsonProperty("version_code")
    private Long versionCode;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Long getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Long versionCode) {
        this.versionCode = versionCode;
    }

}
