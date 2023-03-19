package com.rb.command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rb.dao.DaoEmailFindPw;


public class CommandUserCheck implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		String user_id = request.getParameter("user_id");
		String user_name = request.getParameter("user_name");
		String user_email = request.getParameter("user_email");
		
		DaoEmailFindPw dao = new DaoEmailFindPw();
		int checkUser = dao.checkUser(user_id, user_name, user_email);
		session.setAttribute("CHECKUSER", checkUser);
		System.out.println(checkUser);
		
	}

}
