package com.servelets.cookieinfo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginCookie
 */
@WebServlet("/LoginCookie")
public class LoginCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCookie() {
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
		String userinfo[] = {"Chitresh", "Rahul", "Ram"};
		String pwdinfo[] = {"chitresh", "rahul", "ram"};
		
		String uname = request.getParameter("txtUname");
		String pwd = request.getParameter("txtPwd");
		
		System.out.println(uname + "\t" + pwd);
		
		boolean userchk = false;
		
		for(int i=0;i<userinfo.length;i++)
		{
			if(uname.equals(userinfo[i]) && pwd.equals(pwdinfo[i]))
			{
				Cookie ck = new Cookie("user",  uname);
				ck.setMaxAge(20000); // setting time makes that persistant cookie
				response.addCookie(ck);
				
				userchk = true;
				response.sendRedirect("WelcomeCookie");
			}
		}
		
		if(userchk==false)
			response.sendRedirect("ErrorsCookie.html");
	}

}
