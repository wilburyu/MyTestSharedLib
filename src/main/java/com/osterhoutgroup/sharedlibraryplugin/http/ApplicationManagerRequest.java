/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.http;

import java.util.List;

import com.osterhoutgroup.sharedlibraryplugin.http.BaseRequest;

/**
 * @author wilbur.yu
 *
 */
public class ApplicationManagerRequest extends BaseRequest {
	/**
	 * The application id that the testers are associated with.
	 */
    public long applicationId;
    /**
     * A list of tester emails either for adding or removing.
     */
    public List<String> testerEmails;
    public int supportedStaging;
    public String testerGroupName;

    public Long versionCode;
    public boolean isFeatured;
    public boolean isApproved;
    public boolean isActive;

    public String customerId;

    /**
     * 0 = production;
     * 1 = beta;
     * 2 = alpha;
     */
    public int appType;
}
