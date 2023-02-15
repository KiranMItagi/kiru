package Controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.Sampledao;
import dto.Sample;

public class Class extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=arg0.getParameter("empid");
		int empid=Integer.parseInt(s1);
		String empname=arg0.getParameter("empname");
		String date=arg0.getParameter("date");
		String gender=arg0.getParameter("gender");
		String country=arg0.getParameter("country");
		
		Sample sample=new Sample();
		sample.setEmpid(empid);
		sample.setEmpname(empname);
		sample.setDate(date);
		sample.setGender(gender);
		sample.setCountry(country);
		
		Sampledao  sampledao=new Sampledao();
		sampledao.insert(sample);
	
	
	}

}
