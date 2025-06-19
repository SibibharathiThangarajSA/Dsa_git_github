package my_dsa11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class reterive {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");  // Load the driver
        String url = "jdbc:mysql://localhost:3306/sample";
        String userName = "root";
        String password = "Kgisl@123";
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement stmt = con.createStatement();
        String query = "SELECT * FROM student";
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next())
        {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
        }
        rs.close();
        stmt.close();
        con.close();
    }
}

