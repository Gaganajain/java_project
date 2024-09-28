package com.bce.product.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/saveproduct")

public class SaveServlet extends HttpServlet {
	public SaveServlet() {
		System.out.println("Invoking into the Save Servlet");
	}
	
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse resp) {
		
		System.out.println("Invoking in the dopost methods");
		
		String pname= req.getParameter("ProductName");
		String pcode= req.getParameter("ProductCode");
		String pprice= req.getParameter("ProductPrice");
		
		System.out.println("Product Name is:"+pname);
		System.out.println("Product code is:"+pcode);
		System.out.println("Product Price is:"+pprice);
		
	}
}
