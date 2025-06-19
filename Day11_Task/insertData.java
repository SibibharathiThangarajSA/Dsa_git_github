package my_dsa11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertData
{
	public static void main(String[]args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");   //register and load the driver
		String url="jdbc:mysql://localhost:3306/sample";   
		String userName="root";
		String password="Kgisl@123";
		Connection con=DriverManager.getConnection(url, userName,password); 
		Statement stmt=con.createStatement();
		String query="insert into student values (1,'sibi',19),(2,'gowtham',19),(3,'loki',20)";
		stmt.executeUpdate(query);
		System.out.println("Value inserted");
	}
}
