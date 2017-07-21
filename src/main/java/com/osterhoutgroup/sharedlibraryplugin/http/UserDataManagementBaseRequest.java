/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.http;

import com.osterhoutgroup.sharedlibraryplugin.http.BaseRequest;

/**
 * @author wilbur.yu
 *
 */
public class UserDataManagementBaseRequest extends BaseRequest {
	public enum UserDataActionType {
		APP_COUNT, CATEGORY_COUNT, DOWNLOAD_STATUS
	}

	public long userId;
	public long applicationId;
	public long applicationVersionId;
	public long categoryId;
	public long viewCount;
	public long searchCount;
	public String serialNum;
	public String macAddress;
	public String ipAddress;
	public long count;

	public boolean CheckDownloadStatusIntegrity() {
		if (serialNum == null || applicationId <= 0 || applicationVersionId <= 0 || userId <= 0 || count <= 0) {
			return false;
		}
		return true;
	}

	public boolean checkCategoryCounterIntegrity() {
		if (viewCount < 0 || searchCount < 0 || categoryId <= 0 || (viewCount == 0 && searchCount == 0)) {
			return false;
		}
		return true;
	}

	public boolean checkApplicationCounterIntegrity() {
		if (viewCount < 0 || searchCount < 0 || userId <= 0 || applicationId <= 0
				|| (viewCount == 0 && searchCount == 0)) {
			return false;
		}
		return true;
	}
}
