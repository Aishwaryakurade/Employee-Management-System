package com.nt;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dao.EmployeeDao;



public class DisplayAllServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		    EmployeeDao dao=new EmployeeDao();
		    List<Employee> list=dao.getAllEmployee();
		
			
			req.setAttribute("list", list);
			RequestDispatcher rs2=req.getRequestDispatcher("displayAll.jsp");
			rs2.forward(req, resp);
			
		
	}

}
