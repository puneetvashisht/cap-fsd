package com.capgemini.day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.day9.Employee;

public class JDBCDemo {

	public static void main(String[] args) {
		Connection connection = null;
		
//		1. Load the driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		2. Connection created
		
		try {
			 connection = DriverManager
	                .getConnection("jdbc:mysql://localhost/capdb?user=root&password=rootroot");
			
//			3. Create & Fire queries
			
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement
	                .executeQuery("SELECT * from employee");
			
//			4. Get the result
			List<Employee> employees = new ArrayList<>();
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name= resultSet.getString(2);
				double salary = resultSet.getDouble(3);
				
				Employee e = new Employee(id, name, name, salary);
				System.out.println(e);
				employees.add(e);
				
				System.out.println(id + " : " + name + " : " + salary);
			}
			System.out.println(employees);
			
			

		}
		catch(SQLException sqe) {
			sqe.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
//			5. Close the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		

	}

}
