import org.junit.jupiter.api.*;
import io.github.cdimascio.dotenv.Dotenv;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

public class AuthGatewayTest {
    VulnerableAuthGateway vul = new VulnerableAuthGateway();

    /*
    Write a JUnit test class AuthGatewayTest.java that:

    Creates a mock database connection (or links to your local H2/PostgreSQL instance).
    Attempts to authenticate using a normal, valid email and password. Verify it works.
    Attempts to login using the exploit string: ' OR '1'='1. Verify that the secured gateway successfully rejects the authentication attempt.
     */
    static Dotenv dotenv = null;
    private static String url;
    private static String username;
    private static String password;
    private static Connection connection;

    @BeforeAll
    public static void setUp() {
        dotenv = Dotenv.configure().load();
        url = dotenv.get("DATABASE_URL");
        username = dotenv.get("DATABASE_USERNAME");
        password = dotenv.get("DATABASE_PASSWORD");
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValidAuthentication() throws SQLException {
        String validEmail = "valid@example.com";
        String validPassword = "validpassword";

        boolean isAuthentic = vul.authenticateUser(validEmail, validPassword, connection);
        assertTrue(isAuthentic);
    }

    @Test
    public void testSQLInjection() throws SQLException {
        String maliciousEmail = "' OR '1'='1";
        String maliciousPassword = "anything";

        boolean isAuthentic = vul.authenticateUser(maliciousEmail, maliciousPassword, connection);
        assertFalse(isAuthentic);
    }

    @AfterAll
    static void tearDown() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
