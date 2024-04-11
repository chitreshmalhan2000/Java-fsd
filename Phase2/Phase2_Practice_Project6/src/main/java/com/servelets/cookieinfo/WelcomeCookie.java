package com.servelets.cookieinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeCookie
 */
@WebServlet("/WelcomeCookie")
public class WelcomeCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Cookie  ck[] = request.getCookies();
		
		out.print("<h1>Welcome To : " + ck[1].getValue()+"  ");
		out.print("<a href='LoginCookie.html'>Logout</a></h1>");

		String result = "";
		for(int i=0;i<ck.length;i++)
		{
			result += "<br />Name : " + ck[i].getName();
			result += "<=>Value is : " + ck[i].getValue(); 
		}
		
		
		out.print("<h1>" + result + "</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	}

}
