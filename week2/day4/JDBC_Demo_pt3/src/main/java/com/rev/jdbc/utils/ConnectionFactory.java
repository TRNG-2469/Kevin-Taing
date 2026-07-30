package com.rev.jdbc.utils;// ConnectionFactory.java

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    // Singleton instance placeholder
    private static ConnectionFactory instance;

    // Read connection parameters from environment variables
    private String url;
    private String username;
    private String password;

    // Private constructor prevents instantiation from outside
    private ConnectionFactory() {
        Dotenv dotenv = Dotenv.configure().load();
        url = dotenv.get("DATABASE_URL");
        username = dotenv.get("DATABASE_USERNAME");
        password = dotenv.get("DATABASE_PASSWORD");


        // Fail-fast validation: Verify environment setup
        if (this.url == null || this.username == null || this.password == null) {
            throw new IllegalStateException(
                    "Critical Error: Database environment variables (DB_URL, DB_USER, DB_PASS) are not configured."
            );
        }

        // Force-load the PostgreSQL driver class (recommended in older frameworks)
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("PostgreSQL JDBC driver not found on classpath.", e);
        }
    }

    // Global access point for the Singleton instance
    public static synchronized ConnectionFactory getInstance() {
        if (instance == null) {
            instance = new ConnectionFactory();
        }
        return instance;
    }

    // Factory method returning a connection
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}