package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import SpringAndServlets_dao.EmployeeDao;

@WebServlet("/deleteData")
public class DeleteData extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String id=arg0.getParameter("idToBeDeleted");
		int cid=Integer.parseInt(id);
		System.out.println("Controller "+cid);
		
		EmployeeDao dao=new EmployeeDao();
		dao.delete(cid);
		
		arg1.getWriter().print("Data removed sucessfully");
	}

}
