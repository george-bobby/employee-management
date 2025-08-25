package employeemanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class EmployeeManagementPage extends JFrame {
    private JButton addEmployeeButton;
    private JButton updateEmployeeButton;
    private JButton removeEmployeeButton;
    private JButton viewEmployeesButton;

    public EmployeeManagementPage() {
        setTitle("Employee Management");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addEmployeeButton = new JButton("Add Employee");
        updateEmployeeButton = new JButton("Update Employee");
        removeEmployeeButton = new JButton("Remove Employee");
        viewEmployeesButton = new JButton("View Employees");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.add(addEmployeeButton);
        panel.add(updateEmployeeButton);
        panel.add(removeEmployeeButton);
        panel.add(viewEmployeesButton);

        getContentPane().add(panel);
        setVisible(true);
    }

    public void setAddEmployeeAction(ActionListener listener) {
        addEmployeeButton.addActionListener(listener);
    }

    public void setUpdateEmployeeAction(ActionListener listener) {
        updateEmployeeButton.addActionListener(listener);
    }

    public void setRemoveEmployeeAction(ActionListener listener) {
        removeEmployeeButton.addActionListener(listener);
    }

    public void setViewEmployeesAction(ActionListener listener) {
        viewEmployeesButton.addActionListener(listener);
    }
}
