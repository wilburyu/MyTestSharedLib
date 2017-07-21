//package com.osterhoutgroup.sharedlibraryplugin.http;
//
//import com.osterhoutgroup.sharedlibraryplugin.enumerations.BuildType;
//import com.osterhoutgroup.sharedlibraryplugin.enumerations.IssueType;
//
//public class IssueRequest extends BaseRequest {
//
//    /**
//     * Indicates issue type ANR or crash.
//     */
//    private IssueType type;
//    /**
//     * Error log captured from device.
//     */
//    private String message;
//    /**
//     * Application version number.
//     */
//    private String version;
//    /**
//     * Application package name that crashed or got into non-responsive state.
//     */
//    private String packageName;
//    /**
//     * Caller’s package name.
//     */
//    private String callingPackage;
//    /**
//     * Unique developer API key generated for callingPackage.
//     */
//    private String apiKey;
//    /**
//     * Device product model.
//     */
//    private String productModel;
//    /**
//     * ReticleOS build type (user or user-debug).
//     */
//    private BuildType buildType;
//    /**
//     * ReticleOS build version.
//     */
//    private String incremental;
//
//    //  region Getters and setters
//
//    public IssueType getType() {
//        return type;
//    }
//
//    public void setType(IssueType type) {
//        this.type = type;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public String getVersion() {
//        return version;
//    }
//
//    public void setVersion(String version) {
//        this.version = version;
//    }
//
//    public String getPackageName() {
//        return packageName;
//    }
//
//    public void setPackageName(String packageName) {
//        this.packageName = packageName;
//    }
//
//    public String getCallingPackage() {
//        return callingPackage;
//    }
//
//    public void setCallingPackage(String callingPackage) {
//        this.callingPackage = callingPackage;
//    }
//
//    public String getApiKey() {
//        return apiKey;
//    }
//
//    public void setApiKey(String apiKey) {
//        this.apiKey = apiKey;
//    }
//
//    public String getProductModel() {
//        return productModel;
//    }
//
//    public void setProductModel(String productModel) {
//        this.productModel = productModel;
//    }
//
//    public BuildType getBuildType() {
//        return buildType;
//    }
//
//    public void setBuildType(BuildType buildType) {
//        this.buildType = buildType;
//    }
//
//    public String getIncremental() {
//        return incremental;
//    }
//
//    public void setIncremental(String incremental) {
//        this.incremental = incremental;
//    }
//
//    //  endregion
//}
