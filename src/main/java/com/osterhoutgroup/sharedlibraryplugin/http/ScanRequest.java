package com.osterhoutgroup.sharedlibraryplugin.http;

/**
 * Scanner request object.
 */
@SuppressWarnings("unused")
public class ScanRequest {

    /**
     * Name of the object which is to be scanned.
     */
    private String name;
    /**
     * Path to the object which is to be scanned.
     * This path needs to be available to ClamAV daemon.
     * If that's not possible use multipart upload request.
     */
    private String path;

    public ScanRequest() {

    }

    public ScanRequest(String name, String path) {
        this.name = name;
        this.path = path;
    }

    //  region Getters and Setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    //  endregion
}
