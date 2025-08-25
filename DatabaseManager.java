package employeemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3306/employeedb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
