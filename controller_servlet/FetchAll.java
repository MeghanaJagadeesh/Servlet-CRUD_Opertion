package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import SpringAndServlets_dao.EmployeeDao;
import SpringAndServlets_dto.EmployeeData;

@WebServlet("/fetchAll")
public class FetchAll extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("data fetched");
		resp.getWriter().print("data ferched\n");

		EmployeeDao dao = new EmployeeDao();
		List<EmployeeData> fetch = dao.fetchAll();
		resp.getWriter().print(fetch);
	}
}
