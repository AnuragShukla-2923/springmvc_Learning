package springmvctesting.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC_Connection {
	

	public void getJDBCConnection(String name,int age,String address) {

		Connection con;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/ruchi", "root", "root");
//			String query= "Select * from empinfo";
//			String queur1 = "insert into empInfo values('Rithik',15,'Mumbai')";
			
//			Statement st = con.createStatement();
//			st.executeUpdate(queur1);
			String queur1 = "insert into empInfo values(?,?,?)";
			PreparedStatement ptst = con.prepareStatement(queur1);
			ptst.setString(1, name);
			ptst.setInt(2, age);
			ptst.setString(3, address);
			
			ptst.executeUpdate();
			System.out.println("Query executed");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
