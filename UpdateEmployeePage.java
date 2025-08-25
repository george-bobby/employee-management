package employeemanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class UpdateEmployeePage extends JFrame {
    private JTextField idField;
    private JTextField newRoleField;
    private JButton updateButton;

    public UpdateEmployeePage() {
        setTitle("Update Employee Role");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel titleLabel = new JLabel("Update Employee Role");
        JLabel idLabel = new JLabel("ID:");
        JLabel newRoleLabel = new JLabel("New Role:");

        idField = new JTextField(20);
        newRoleField = new JTextField(20);
        updateButton = new JButton("Update");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(idLabel);
        panel.add(idField);
        panel.add(newRoleLabel);
        panel.add(newRoleField);
        panel.add(new JLabel()); // Placeholder
        panel.add(updateButton);

        getContentPane().add(BorderLayout.NORTH, titleLabel);
        getContentPane().add(BorderLayout.CENTER, panel);
        setVisible(false);
    }

    public int getID() {
        return Integer.parseInt(idField.getText());
    }

    public String getNewRole() {
        return newRoleField.getText();
    }

    public void setUpdateAction(ActionListener listener) {
        updateButton.addActionListener(listener);
    }
}
