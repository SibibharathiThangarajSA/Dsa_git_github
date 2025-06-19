package my_dsa11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Inventory {

    private static final String URL = "jdbc:mysql://localhost:3306/sample";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Kgisl@123";

    private Connection getConnection() throws SQLException, ClassNotFoundException
    {
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public void createTable() throws SQLException, ClassNotFoundException
    {
        String query = "CREATE TABLE IF NOT EXISTS student (" +
                "id INT PRIMARY KEY, " +
                "name VARCHAR(50), " +
                "age INT)";
        try (Connection con = getConnection();
             Statement stmt = con.createStatement())
        {
            stmt.execute(query);
            System.out.println("Table 'student' is ready.");
        }
    }

    public void insertData() throws SQLException, ClassNotFoundException
    {
        String query = "INSERT INTO student (id, name, age) VALUES " +
                "(1, 'sibi', 19), " +
                "(2, 'gowtham', 19), " +
                "(3, 'loki', 20)";
        try (Connection con = getConnection();
             Statement stmt = con.createStatement())
        {
            int rows = stmt.executeUpdate(query);
            if (rows > 0)
            {
                System.out.println(rows + " rows inserted.");
            }
        }
    }

    public void deleteData(int id) throws SQLException, ClassNotFoundException
    {
        String query = "DELETE FROM student WHERE id = " + id;
        try (Connection con = getConnection();
             Statement stmt = con.createStatement())
        {
            int rows = stmt.executeUpdate(query);
            if (rows > 0)
            {
                System.out.println(rows + " row(s) deleted with id = " + id);
            }
        }
    }

    public void retrieveData() throws SQLException, ClassNotFoundException
    {
        String query = "SELECT * FROM student";
        try (Connection con = getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query))
        {

            System.out.println("ID | Name    | Age");
            System.out.println("-------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.printf("%2d | %-7s | %3d%n", id, name, age);
            }
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        Inventory inv = new Inventory();
        inv.createTable();
        inv.insertData();
        System.out.println("\nData after insert:");
        inv.retrieveData();
        inv.deleteData(2);
        System.out.println("\nData after deleting id=2:");
        inv.retrieveData();
    }
}