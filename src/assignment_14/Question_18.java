/*
18. Write a program to generate SQLException
*/
package assignment_14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Question_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "C##affan", "affan");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
