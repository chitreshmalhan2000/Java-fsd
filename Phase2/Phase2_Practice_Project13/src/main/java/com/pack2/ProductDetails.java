package com.pack2;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductDetails
 */
@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        try {
	            Connection conn = DBConnection.c();
	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery("SELECT * FROM products");

	            PrintWriter out = response.getWriter();
	            out.println("<html><body>");
	            out.println("<h2>Product Details</h2>");
	            while (rs.next()) {
	                
	                out.println("<p>ID: " + rs.getString("id") + "</p>");
	                out.println("<p>Name: " + rs.getString("name") + "</p>");
	                out.println("<p>Description: " + rs.getString("description") + "</p>");
	                out.println("<p>Price: $" + rs.getDouble("price") + "</p>");
	            }
	            out.println("</body></html>");

	            conn.close();
	        } catch (SQLException e) {
	            throw new ServletException("Database access error", e);
	        }
	    }
	}
