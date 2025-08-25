package employeemanagement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class ViewEmployeesPage extends JFrame {
    private JTable table;
    private JScrollPane scrollPane;

    public ViewEmployeesPage() {
        setTitle("View Employees");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        table = new JTable();
        scrollPane = new JScrollPane(table);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);

        getContentPane().add(panel);
        setVisible(false);
    }

    public void displayEmployees() {
        try {
            Connection connection = DatabaseManager.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

            List<String[]> data = new ArrayList<>();
            while (resultSet.next()) {
                String[] row = new String[3];
                row[0] = resultSet.getString("name");
                row[1] = String.valueOf(resultSet.getInt("id"));
                row[2] = resultSet.getString("role");
                data.add(row);
            }

            String[] columnNames = {"Name", "ID", "Role"};
            String[][] dataArray = new String[data.size()][3];
            for (int i = 0; i < data.size(); i++) {
                dataArray[i] = data.get(i);
            }

            table.setModel(new DefaultTableModel(dataArray, columnNames));
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
