/**
 * 
 */
package com.itch.prepaid.us.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.itch.prepaid.us.exception.UserException;
import com.itch.prepaid.us.model.User;

/**
 * @author TCM
 *
 */
@Component
public class UserSvcImpl implements UserSvc 
{
	private static Map<Integer, User> userMap = new HashMap<Integer, User>();

	public boolean createUser(User user) throws UserException 
	{
		userMap.put(user.getId(), user);
		
		return true;
	}

	public User getUser(int id) throws UserException 
	{
		return userMap.get(id);
	}

}
