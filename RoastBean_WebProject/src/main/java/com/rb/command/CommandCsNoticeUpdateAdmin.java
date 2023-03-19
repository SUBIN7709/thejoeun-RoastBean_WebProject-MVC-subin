package com.rb.command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rb.dao.DaoNotice;

public class CommandCsNoticeUpdateAdmin implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String notice_write_seq = request.getParameter("notice_write_seq");
		String notice_write_title = request.getParameter("notice_write_title");
		String notice_write_content = request.getParameter("notice_write_content");
		String btnType = request.getParameter("btnType");

		DaoNotice dao = new DaoNotice();

		if(btnType.equals("수정")) {
			dao.updateAction(notice_write_title, notice_write_content, notice_write_seq);
			System.out.println("update");
		}else {
			dao.updateActionDelete(notice_write_seq);
			System.out.println("delete");
		}
		
	}

}
