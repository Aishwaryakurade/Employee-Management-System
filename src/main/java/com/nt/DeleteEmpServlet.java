package com.nt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dao.EmployeeDao;

public class DeleteEmpServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println("my this emloyee is deleted with id" + id);

		EmployeeDao dao = new EmployeeDao();
		int result = dao.deleteById(id);
		
		if(result > 0) {
			req.setAttribute("msg", "Deletetion Success");
		}else {
			req.setAttribute("msg", "Deletetion Failed");

		}

		RequestDispatcher rd = req.getRequestDispatcher("displayAll");
		rd.forward(req, resp);

	}

}
