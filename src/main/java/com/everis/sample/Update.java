package com.everis.sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Update")

public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Update() {
		super();
	}
	public String ID;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ID = request.getParameter("ID");
		request.setAttribute("ID", ID);
		this.getServletContext().getRequestDispatcher("/WEB-INF/Update.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String first_name1 = request.getParameter("first_name1");
		String last_name1 = request.getParameter("last_name1");
		String phone_number1 = request.getParameter("phone_number1");
		String ID1 = request.getParameter("ID1");
	    Contact c = new Contact(first_name1, last_name1, phone_number1, ID1);
	    int i=0;
		for(Contact c1 : Add.list){
			if(c1.getID().equals(ID)){
				break;
			}
			i++;
			}
	    Add.list.set(i, c);
		this.getServletContext().getRequestDispatcher("/WEB-INF/Add.jsp").forward(request, response);
	}
	
	
	

}
