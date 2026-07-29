package com.rev.jdbc;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.*;

public class JDBCDemoInsertion {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        String database = dotenv.get("DATABASE_URL");
        String username = dotenv.get("DATABASE_USERNAME");
        String password = dotenv.get("DATABASE_PASSWORD");
        // STEP 1 - Load the Driver (Optional)
        try {
            Class.forName("org.postgresql.Driver");
            // STEP 2 - Create a Connection
            try {
                Connection connection = DriverManager.getConnection(database, username, password);
                // STEP 3 - Create statement object
                PreparedStatement statement = connection.prepareStatement("INSERT INTO employees(emp_id, name, salary) VALUES (?, ?, ?)");
                statement.setInt(1, 6);
                statement.setString(2, "Finn");
                statement.setInt(3, 3000);
                // STEP 4 - Execute
                int rowsAffected = statement.executeUpdate();
                // STEP 5 - Results
                System.out.println("Rows affected: " + rowsAffected);
                // STEP 6 - Close the connection
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
