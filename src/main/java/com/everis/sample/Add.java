package com.everis.sample;

import java.io.IOException;
import java.util.*;

//import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Add() {
		super();
	}  

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		this.getServletContext().getRequestDispatcher("/WEB-INF/Add.jsp").forward(request, response);
	}
    public static ArrayList<Contact> list = new ArrayList<Contact>();
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String phone_number = request.getParameter("phone_number");
		String ID= request.getParameter("ID");
	    list.add(new Contact(first_name, last_name, phone_number,ID));
		this.getServletContext().getRequestDispatcher("/WEB-INF/Add.jsp").forward(request, response);
	}
	public static ArrayList<Contact> getList(){
        return list;
    }

}