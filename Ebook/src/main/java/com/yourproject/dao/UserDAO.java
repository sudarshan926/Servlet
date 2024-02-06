
	package com.yourproject.dao;

	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
	import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.DataSource;

import com.yourproject.User;
	

	public class UserDAO {
	    private DataSource dataSource;

	    public UserDAO(DataSource dataSource) {
	        this.dataSource = dataSource;
	    }

	    // Method to register a new user
	    public boolean register(User user) {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fusion", "root", "Surya@1234");
				PreparedStatement ps = con.prepareStatement("insert into register values(?,?)");
				int i = ps.executeUpdate();
				if (i > 0) {
					System.out.println("Success");
				} else {
					System.out.println("Not Success");
				}
			}
			catch(Exception e) {
				System.out.println(e);
				
			}
			return false;
		
		}
	}

