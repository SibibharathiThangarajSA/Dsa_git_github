package my_dsa11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class tableCreation {

	public String createTable()
	{
		String query="create table details(id int,name varchar(80),age int)";
		return query;
	}
	public static void main(String[]args) throws ClassNotFoundException, SQLException 
	{
		tableCreation tc=new tableCreation(); 
		Class.forName("com.mysql.cj.jdbc.Driver");   //register and load the driver
		String url="jdbc:mysql://localhost:3306/sample";   
		String userName="root";
		String password="Kgisl@123";
		Connection con=DriverManager.getConnection(url, userName,password); 
		Statement stmt=con.createStatement();
		stmt.executeUpdate(tc.createTable());
		System.out.println("Table created");
	}

}
