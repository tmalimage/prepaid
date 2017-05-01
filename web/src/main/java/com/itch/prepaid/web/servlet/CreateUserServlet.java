package com.itch.prepaid.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.itch.prepaid.us.exception.UserException;
import com.itch.prepaid.us.model.User;
import com.itch.prepaid.us.service.UserSvc;

/**
 * Servlet implementation class CreateUserServlet
 */
public class CreateUserServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		
		if("df".equals(null))
		{
			System.out.println("Hello");
		}
		
		WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		UserSvc userSvc = (UserSvc) applicationContext.getBean("userSvc");
		try 
		{
			userSvc.createUser(user);
			
		} 
		catch (UserException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PrintWriter printWriter = response.getWriter();
		printWriter.write("User is created.");
	}

}
