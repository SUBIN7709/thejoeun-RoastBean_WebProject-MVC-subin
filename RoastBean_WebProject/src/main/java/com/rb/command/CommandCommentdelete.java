package com.rb.command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rb.dao.DaoComment;

public class CommandCommentdelete implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)  {
		System.out.println("delete command enter");
		String community_comment_cono = request.getParameter("community_comment_cono");		
		System.out.println(community_comment_cono);
		DaoComment dao = DaoComment.getInstance();
		dao.coDelete(community_comment_cono);


	}

}
