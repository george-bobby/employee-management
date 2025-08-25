package employeemanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class EmployeeDAO {

    public static void addEmployee(String name, int id, String role) {
        Connection connection = null;
        try {
            connection = DatabaseManager.getConnection();
            connection.setAutoCommit(false);
            PreparedStatement statement = connection.prepareStatement("INSERT INTO employees (name, id, role) VALUES (?, ?, ?)");
            statement.setString(1, name);
            statement.setInt(2, id);
            statement.setString(3, role);
            statement.executeUpdate();
            connection.commit(); // Commit transaction
        } catch (SQLException e) {
            e.printStackTrace();
            // Rollback transaction if an error occurs
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            DatabaseManager.closeConnection(connection);
        }
    }

    public static void updateEmployeeRole(int id, String newRole) {
        Connection connection = null;
        try {
            connection = DatabaseManager.getConnection();
            connection.setAutoCommit(false);
            PreparedStatement statement = connection.prepareStatement("UPDATE employees SET role = ? WHERE id = ?");
            statement.setString(1, newRole);
            statement.setInt(2, id);
            statement.executeUpdate();
            connection.commit(); // Commit transaction
        } catch (SQLException e) {
            e.printStackTrace();
            // Rollback transaction if an error occurs
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            DatabaseManager.closeConnection(connection);
        }
    }

    public static void removeEmployee(int id) {
        Connection connection = null;
        try {
            connection = DatabaseManager.getConnection();
            connection.setAutoCommit(false);
            PreparedStatement statement = connection.prepareStatement("DELETE FROM employees WHERE id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
            connection.commit(); // Commit transaction
        } catch (SQLException e) {
            e.printStackTrace();
            // Rollback transaction if an error occurs
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            DatabaseManager.closeConnection(connection);
        }
    }
}
