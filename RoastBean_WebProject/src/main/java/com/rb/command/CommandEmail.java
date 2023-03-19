package com.rb.command;

import java.io.IOException;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rb.dao.DaoEmail;

public class CommandEmail implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String uemail = request.getParameter("user_email");
		
		DaoEmail dao = new DaoEmail();
		String certifyNum = dao.send(uemail);
		
		try {
			response.getWriter().write(certifyNum);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}