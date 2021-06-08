package com.onebill.assignment_7_6_21;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BasicForm
 */
@WebServlet("/BasicForm")
public class BasicForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BasicForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String address = request.getParameter("address");
		String phone = request.getParameter("num");
		String gender = request.getParameter("gender");
		String[] lang = request.getParameterValues("lang");
		out.println("<h3>Details</h3>");
		out.println("Name      : " + fname + " " + lname + "<br/><br/>");
		out.println("Address   : " + address + "<br/><br/>");
		out.println("Phone no. : " + phone + "<br/><br/>");
		out.println("Gender    : " + gender + "<br/><br/>");
		out.println("Languages : <br/><br/>");
		for(int i=0;i<lang.length;i++) {
			out.println((i+1) + ". " + lang[i] + "<br/><br/>");
		}
	}

}
