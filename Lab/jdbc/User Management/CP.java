package com.user.manage;
import java.sql.*;

public class CP {
	static Connection con;
	public static Connection createC() {
		try {
			//Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create connection
			String user = "root";
			String password="A374038s#";
			String url = "jdbc:mysql://localhost:3306/users_manage";
			con=DriverManager.getConnection(url, user, password);
		}
	
	catch(Exception e) {
		e.printStackTrace();
	}
		return con;
		}
}
