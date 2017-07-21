package com.osterhoutgroup.sharedlibraryplugin.http;

/**
 * Object used to form response object in cases of unsuccessful processing.
 */
@SuppressWarnings("unused")
public class ScanErrorResponse {

    /**
     * Error message
     */
    private String message;
    /**
     * The exception that occurred.
     */
    private Throwable exception;

    public ScanErrorResponse() {

    }

    public ScanErrorResponse(String message) {
        this.message = message;
    }

    public ScanErrorResponse(Throwable exception) {
        this.message = exception.getMessage();
        this.exception = exception;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getException() {
        return exception;
    }
}
