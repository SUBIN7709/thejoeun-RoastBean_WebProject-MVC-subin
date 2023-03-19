package com.rb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rb.dao.DaoNotice;

public class CommandCsNoticeInsertAdmin implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();

		String admin_id = (String) session.getAttribute("ADMIN");
		String notice_write_title = request.getParameter("notice_write_title");
		String notice_write_comment = request.getParameter("notice_write_comment");
		System.out.println("notice_write_comment");
		DaoNotice dao = new DaoNotice();
		dao.insertAction(admin_id, notice_write_title, notice_write_comment);

	}

}
