package com.rev.jdbc;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.*;

public class JDBCDemoFirst {
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
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM employees WHERE emp_id = ?");
                statement.setInt(1, 1);
                // STEP 4 - Execute Query and collect the result in ResultSet
                ResultSet resultSet = statement.executeQuery();
                // STEP 5 - Iterate over the process resultSet
                while(resultSet.next()) {
                    System.out.println(resultSet.getInt("emp_id") + " " + resultSet.getString("name") + " " + resultSet.getInt("salary"));
                }
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
