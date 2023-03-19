package com.rb.command;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rb.dao.DaoUserSignup;

public class CommandUserCheckNick implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)  {
		// TODO Auto-generated method stub
		
		String user_id = request.getParameter("user_id");
		String user_name = request.getParameter("user_name");
		String user_nick = request.getParameter("user_nick");
		String user_pw = request.getParameter("user_pw");
		String user_pw_check = request.getParameter("user_pw_check");
		String user_telno = request.getParameter("user_telno");
		String user_telno1 = request.getParameter("user_telno1");
		String user_telno2 = request.getParameter("user_telno2");
		String user_telno3 = request.getParameter("user_telno3");
		String user_email = request.getParameter("user_email");
		String user_addresszipcode = request.getParameter("user_addresszipcode");
		String user_address1 = request.getParameter("user_address1");
		String user_address2 = request.getParameter("user_address2");
		String user_address3 = request.getParameter("user_address3");
		String user_birthday = request.getParameter("user_birthday");
		String user_gender = request.getParameter("user_gender");
		String user_initdate = request.getParameter("user_initdate");
		String checkIdDuplication = request.getParameter("checkIdDuplication");
		
		DaoUserSignup dao = new DaoUserSignup();
		int checkNickDuplication = dao.checkNick(user_nick);
		
		request.setAttribute("user_id", user_id);
		request.setAttribute("user_name", user_name);
		request.setAttribute("user_nick", user_nick);
		request.setAttribute("user_pw", user_pw);
		request.setAttribute("user_pw_check", user_pw_check);
		request.setAttribute("user_telno", user_telno);
		request.setAttribute("user_telno1", user_telno1);
		request.setAttribute("user_telno2", user_telno2);
		request.setAttribute("user_telno3", user_telno3);
		request.setAttribute("user_email", user_email);
		request.setAttribute("user_addresszipcode", user_addresszipcode);
		request.setAttribute("user_address1", user_address1);
		request.setAttribute("user_address2", user_address2);
		request.setAttribute("user_address3", user_address3);
		request.setAttribute("user_birthday", user_birthday);
		request.setAttribute("user_gender", user_gender);
		request.setAttribute("user_initdate", user_initdate);
		request.setAttribute("checkIdDuplication", checkIdDuplication);
		request.setAttribute("checkNickDuplication", checkNickDuplication);
		
	}

}
