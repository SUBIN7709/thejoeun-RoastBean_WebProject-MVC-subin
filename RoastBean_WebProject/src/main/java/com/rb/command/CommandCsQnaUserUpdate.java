package com.rb.command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rb.dao.DaoQna;

public class CommandCsQnaUserUpdate implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response){
		// TODO Auto-generated method stub

		String qna_write_seq = request.getParameter("qna_write_seq");
		String qna_write_title = request.getParameter("qna_write_title");
		String qna_write_content = request.getParameter("qna_write_content");
		
		DaoQna dao = new DaoQna();
		dao.userQuestionUpdate(qna_write_seq, qna_write_title, qna_write_content);
	}

}
