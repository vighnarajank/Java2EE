package com.onebill.assignment_7_6_21;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Forward
 */
@WebServlet("/ForwardInclude")
public class ForwardInclude extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwardInclude() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		if(uname.compareTo("vighna")==0 && pwd.compareTo("12345")==0) {
			request.getRequestDispatcher("Forward1.html").forward(request, response);
		}
		else {
			PrintWriter out = response.getWriter();
			out.println("<p style=color:red>You have entered a wrong user name or password");
			request.getRequestDispatcher("Forward.html").include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
