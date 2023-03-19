package com.rb.command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rb.dao.DaoReview;

public class CommandReviewDelete implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)  {
		// TODO Auto-generated method stub
		
		int review_seq = Integer.parseInt(request.getParameter("review_seq"));
		
		DaoReview dao = new DaoReview();
		dao.reviewDelete(review_seq);

	}

}
