package com.user.manage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class UserDao {

	public static boolean insertUserToDB(User us) {
		//jdbc code ..
		boolean f= false;
		try {
			Connection con =CP.createC();
			String q="insert into users(uname, password) values(?,?)";
			
			//PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);
			//set the values of parameters
			pstmt.setString(1, us.getUserName());
			pstmt.setString(2, us.getuserPassword());
			
			
			//execute..
			pstmt.executeUpdate();
			f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean updateUserToDB(String userName, String password) {
		//jdbc code ..
		boolean f= false;
		try {
			Connection con =CP.createC();
			String q="update users set password = ? where uname=?";
			
			//PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);
			//set the values of parameters
	
			pstmt.setString(1, password);
			pstmt.setString(2, userName);
			
			
			//execute..
			pstmt.executeUpdate();
			f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public static boolean deleteUser(String userName) {
		// TODO Auto-generated method stub
		boolean f= false;
		try {
			Connection con =CP.createC();
			String q="delete from users where uname = ?";
			
			//PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);
			//set the values of parameters
			pstmt.setString(1, userName);
			
			
			//execute..
			pstmt.executeUpdate();
			f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;		
	}

	public static void showUserByUsername(String userName) {
		// TODO Auto-generated method stub
		try {
		Connection con = CP.createC();
		String q= "select uname,password from users where uname = ?";
		Statement stmt = con.createStatement();
		ResultSet set = stmt.executeQuery(q);
		String uname=set.getString(1);
		String password = set.getString(2);
		
		System.out.println("UserName :"+uname);
		System.out.println("Password :"+ password);
		System.out.println("+++++++++++++++++++++++++++++++");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void showAllUsers() {
		// TODO Auto-generated method stub
		try {
		Connection con = CP.createC();
		String q= "select * from users;";
		Statement stmt = con.createStatement();
		ResultSet set = stmt.executeQuery(q);
		while (set.next()) {
			
			String uname=set.getString(1);
			String password = set.getString(2);
			
			System.out.println("UserName :"+uname);
			System.out.println("Password :"+ password);
			System.out.println("+++++++++++++++++++++++++++++++");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
