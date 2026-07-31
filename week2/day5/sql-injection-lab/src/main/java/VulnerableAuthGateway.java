import java.sql.*;

public class VulnerableAuthGateway {

    /*
        The code block below is vulnerability because it allows for user input without cleaning or validating it.
        Therefore, malicious agents may attempt to inject SQL code into the input fields to manipulate the database
        query and gain unauthorized access to the system. For example, an example payload would be to input the
        following into the email field: ' OR '1'='1.
     */
//    public boolean authenticateUser(String emailInput, String passwordInput, Connection conn) throws SQLException {
//        // VULNERABLE: Direct string concatenation of variables into a Statement
//        String query = "SELECT * FROM members WHERE email = '" + emailInput + "' AND password = '" + passwordInput + "'";
//
//        try (Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(query)) {
//            return rs.next();
//        }
//    }

    public boolean authenticateUser(String emailInput, String passwordInput, Connection conn) throws SQLException {
        String query = "SELECT * FROM members WHERE email = ? AND password = ?";

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, emailInput);
            stmt.setString(2, passwordInput);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        }
    }
}