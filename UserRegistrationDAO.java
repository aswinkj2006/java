import java.sql.*;

public class UserRegistrationDAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "1234";

    public boolean registerUser(String username, String email, String password) {
        String insertQuery = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {

            pstmt.setString(1, username);
            pstmt.setString(2, email);
            pstmt.setString(3, password); // Consider hashing the password before storing
            
            int rows = pstmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
