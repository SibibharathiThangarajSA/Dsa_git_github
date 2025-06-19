package my_dsa11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class delete {
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
	        Class.forName("com.mysql.cj.jdbc.Driver");   // register and load the driver
	        String url = "jdbc:mysql://localhost:3306/sample";
	        String userName = "root";
	        String password = "Kgisl@123";
	        Connection con = DriverManager.getConnection(url, userName, password);
	        Statement stmt = con.createStatement();
	        String query = "DELETE FROM student WHERE id = 1";
	        int rowsDeleted = stmt.executeUpdate(query);
	        System.out.println("Rows deleted: " + rowsDeleted);
	        stmt.close();
	        con.close();
	    }
	}