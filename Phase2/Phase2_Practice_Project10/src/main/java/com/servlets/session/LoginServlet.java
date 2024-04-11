package com.servlets.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    /*
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
*/
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
		String userinfo[] = {"Venugopal", "Pavan", "Karan"};
		String pwdinfo[] = {"v@123", "p@123", "k@123"};
		
		String uname = request.getParameter("txtUname");
		String pwd = request.getParameter("txtPwd");
		
		System.out.println(uname + "\t" + pwd);
		
		boolean userchk = false;
		
		for(int i=0;i<userinfo.length;i++)
		{
			if(uname.equals(userinfo[i]) && pwd.equals(pwdinfo[i]))
			{
				HttpSession session = request.getSession();
				//session.setMaxInactiveInterval(1000); // 10000 milli seconds = 1 sec
				session.setAttribute("user", uname);
				
				userchk = true;
				response.sendRedirect("WelcomeServlet");
			}
		}
		
		if(userchk==false)
			response.sendRedirect("ErrorsSession.html");
	}

}
