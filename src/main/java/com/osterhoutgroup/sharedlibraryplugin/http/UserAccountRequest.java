/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.http;

import com.osterhoutgroup.sharedlibraryplugin.models.user.User;

/**
 * @author wilbur.yu
 *
 */
public class UserAccountRequest extends BaseRequest {
    public User user;
    public String newPassword;
    public String newEmail;
    /**
     * Starting pagination number to query up users
     * starting and ending should both be zero to get all users.
     */
    public int starting;
    /**
     * ending pagination number to query up users.
     * starting and ending should both be zero to get all users.
     */
    public int ending;
    public Long roleId;
}
