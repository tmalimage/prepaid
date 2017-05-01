/**
 * 
 */
package com.itch.prepaid.us.service;

import org.springframework.stereotype.Service;

import com.itch.prepaid.us.exception.UserException;
import com.itch.prepaid.us.model.User;

/**
 * @author TCM
 *
 */
@Service
public interface UserSvc 
{
	public abstract boolean createUser(User user) throws UserException;
	
	public abstract User getUser(int id) throws UserException;
}
