/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.http;

import java.util.List;

import com.osterhoutgroup.sharedlibraryplugin.models.creditcard.CreditCard;
import com.osterhoutgroup.sharedlibraryplugin.models.user.User;

/**
 * @author wilbur.yu
 *
 */
public class UserAccountResponse extends BaseResponse {
	public List<User> users;
	public List<CreditCard> creditCards;
}
