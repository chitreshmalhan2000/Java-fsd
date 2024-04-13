package com.pack2;
import java.sql.*;
public class DBConnection {
	public static Connection c() {
		Connection conObj = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root", "Bhumikamalhan123*");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return conObj;
	}
}
