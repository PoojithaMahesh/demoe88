package calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Addition extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String number1=req.getParameter("num1");
//		how to comnvert string to int
//		parseing
		int num1=Integer.parseInt(number1);
		
		int num2=Integer.parseInt(req.getParameter("num2"));
		
		int result=num1+num2;
		PrintWriter printWriter=res.getWriter();
		printWriter.print("Addition of two numbers is:::"+result);
		
		
	}

}
