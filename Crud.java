import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Crud{
    public static void main(String[] args) {
        // Database credentials and URL
        String jdbcURL = "jdbc:mysql://localhost:3306/testdb"; // replace testdb with your database name
        String username = "root";  // your MySQL username
        String password = "root";
        String filepath="d:\sample.text";

        // SQL query to create table
        String sqlCreateTable = "CREATE TABLE IF NOT EXISTS emp (" +
                                "id INT PRIMARY KEY AUTO_INCREMENT, " +
                                "name VARCHAR(100) NOT NULL, " +
                                "email VARCHAR(100) NOT NULL UNIQUE, " +
                                "salary DOUBLE" +
                                ")";

        try {
            // Establish connection
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            // Create a Statement object to send the SQL statement to the database
            Statement statement = connection.createStatement();

            // Execute the create table statement
            statement.execute(sqlCreateTable);

            System.out.println("Table 'employees' created successfully.");

            // Close resources
            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
