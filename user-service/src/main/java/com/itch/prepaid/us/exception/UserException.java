/**
 * 
 */
package com.itch.prepaid.us.exception;

/**
 * @author TCM
 *
 */
public class UserException extends Exception 
{
	private static final long serialVersionUID = 1L;

	public UserException(String message, Throwable throwable)
	{
		super(message, throwable);
	}
}
