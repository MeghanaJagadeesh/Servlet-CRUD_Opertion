package controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import SpringAndServlets_dao.EmployeeDao;
import SpringAndServlets_dto.EmployeeData;
@WebServlet("/form")
public class Form implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String id=arg0.getParameter("id");
		String name=arg0.getParameter("name");
		String email=arg0.getParameter("email");
		String password=arg0.getParameter("pwd");
		String dob=arg0.getParameter("dob");
		String gender=arg0.getParameter("gender");
		String checkbox=arg0.getParameter("termcon");
		String country=arg0.getParameter("country");
		
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(email);
//		System.out.println(password);
//		System.out.println(dob);
//		System.out.println(gender);
//		System.out.println(checkbox);
//		System.out.println(country );
		
		EmployeeData employeeData=new EmployeeData();
		int cid=Integer.parseInt(id);
		employeeData.setId(cid);
		employeeData.setName(name);
		employeeData.setDob(dob);
		employeeData.setCountry(country);
		employeeData.setGender(gender);
		employeeData.setMail(email);
		employeeData.setPassword(password);
		employeeData.setTermsAndCondition(country);
		
//		System.out.println(employeeData);
		EmployeeDao d=new EmployeeDao();
		d.insert(employeeData);
		
		arg1.getWriter().print("Data Added");
	}

}
