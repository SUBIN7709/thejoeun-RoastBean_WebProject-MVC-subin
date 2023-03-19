package com.rb.command;


import java.util.ArrayList;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rb.dao.DaoNotice;
import com.rb.dto.DtoNotice;

public class CommandCsNoticeListUser implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)  {
		// TODO Auto-generated method stub
		
		DaoNotice dao = new DaoNotice();
		ArrayList<DtoNotice> dtos = dao.noticeList();
		request.setAttribute("userNoticeList", dtos);

	}

}
