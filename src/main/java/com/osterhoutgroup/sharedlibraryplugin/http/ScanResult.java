package com.osterhoutgroup.sharedlibraryplugin.http;

/**
 * Scan result object used to from response object in case of successful processing.
 */
@SuppressWarnings("unused")
public class ScanResult {

    /**
     * Flag indicating if scanned object contains malware code.
     */
    private boolean status;
    /**
     * Antivirus scan report.
     */
    private String report;

    public ScanResult() {

    }

    public ScanResult(boolean status, String report) {
        this.status = status;
        this.report = report;
    }

    //  region Getters and setters

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    //  endregion
}
