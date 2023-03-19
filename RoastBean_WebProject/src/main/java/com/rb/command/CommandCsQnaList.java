package com.rb.command;


import java.util.ArrayList;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rb.dao.DaoQna;
import com.rb.dto.DtoQna;

public class CommandCsQnaList implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response){
		// TODO Auto-generated method stub
		
		DaoQna dao = new DaoQna();
		ArrayList<DtoQna> dtos = dao.qnaListAdmin();
		request.setAttribute("adminQnaList", dtos);
	}

}
