/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.http;

import java.util.Hashtable;
import java.util.List;

import com.osterhoutgroup.sharedlibraryplugin.http.BaseResponse;
import com.osterhoutgroup.sharedlibraryplugin.models.applicationversion.BaseApplicationVersion;

/**
 * @author wilbur.yu
 *
 */
public class ApplicationManagerResponse extends BaseResponse {
    public Hashtable<String, List<String>> testerLists;
    public List<BaseApplicationVersion> applicationVersionList;
}
