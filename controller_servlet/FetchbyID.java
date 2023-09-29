package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import SpringAndServlets_dao.EmployeeDao;
@WebServlet("/fetchbyId")
public class FetchbyID extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=req.getParameter("id");
		int cid=Integer.parseInt(id);
		EmployeeDao e=new EmployeeDao();
		Object obj=e.fetch(cid);
		res.getWriter().print(obj);
	}

}
