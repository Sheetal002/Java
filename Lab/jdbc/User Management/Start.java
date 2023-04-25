package UserManagementApp;
import java.io.*;

import com.user.manage.User;
import com.user.manage.UserDao;  
public class Start {

	//SQL command for creating table
	//create table users(uname varchar(100) primary key, password varchar(100) not null, check(LENGTH(password)>6) );
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Welcome to User Management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) 
		{
			System.out.println("Press 1 to Create User ");
			System.out.println("Press 2 to Update Password");
			System.out.println("Press 3 to Delete User");
			System.out.println("Press 4 to Retrieve User");
			System.out.println("Press 5 to List of all Users");
			System.out.println("Press 6 to exit");
			int c = Integer.parseInt(br.readLine());
			
			if (c == 1) {
				//add users..
				System.out.println("Enter username: ");
				String uname = br.readLine();
				
				System.out.println("Enter password: ");
				String password = br.readLine();
				
				
				//Create user object to store user
				User us = new User(uname, password);
				boolean answer = UserDao.insertUserToDB(us);
				if(answer) {
					System.out.println("User has been added successfully...");
				}
				else {
					System.out.println("Something went wrong. Try again...");
				}
				System.out.println(us); 
			}
			else if(c==2) {
				//delete user..
				System.out.println("Enter username to update password: ");
				String userName = br.readLine();
				
				System.out.println("Enter new password: ");
				String password = br.readLine();
				
				boolean answer = UserDao.updateUserToDB(userName, password);
				
				if(answer) {
					System.out.println("User's password has been updated successfully...");
				}
				else {
					System.out.println("User went wrong. Try again...");
				}
			}
			else if(c==3) {
				//delete user..
				System.out.println("Enter username to delete: ");
				String userName = br.readLine();
				boolean answer = UserDao.deleteUser(userName);
				if(answer) {
					System.out.println("User has been deleted successfully...");
				}
				else {
					System.out.println("User went wrong. Try again...");
				}
			}
			else if(c==4) {
				//show user..
				System.out.println("Enter username to show details: ");
				String userName = br.readLine();
				UserDao.showUserByUsername(userName);
				
				
			}else if(c==5) {
				//display users
				UserDao.showAllUsers();
			}else if(c==6) {
				//exit
				break;
			}else {
				break;
			}
		}
		System.out.println("Thankyou for using my application.");
		System.out.println("See you soon.");
	}

}
