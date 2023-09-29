package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import SpringAndServlets_dao.EmployeeDao;
@WebServlet("/deleteall")
public class DeleteAll extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		resp.getWriter().print("data deleted");
		EmployeeDao dao=new EmployeeDao();
		resp.getWriter().print(dao.deleteAll());
	}
}
