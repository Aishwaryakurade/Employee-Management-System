package com.nt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dao.EmployeeDao;

public class UpdateEmpPageServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	            
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		EmployeeDao dao=new EmployeeDao();
		
        Employee emp=dao.getbyId(id);
        
        req.setAttribute("emp", emp);
        
        RequestDispatcher rd=req.getRequestDispatcher("update.jsp");
        
        rd.forward(req, resp);
		
		

		
		
		
		
		
	}

}
