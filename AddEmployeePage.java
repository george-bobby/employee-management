package employeemanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class AddEmployeePage extends JFrame {
    private JTextField nameField;
    private JTextField idField;
    private JTextField roleField;
    private JButton addButton;

    public AddEmployeePage() {
        setTitle("Add Employee");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel titleLabel = new JLabel("Add Employee");
        JLabel nameLabel = new JLabel("Name:");
        JLabel idLabel = new JLabel("ID:");
        JLabel roleLabel = new JLabel("Role:");

        nameField = new JTextField(20);
        idField = new JTextField(20);
        roleField = new JTextField(20);
        addButton = new JButton("Add");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(idLabel);
        panel.add(idField);
        panel.add(roleLabel);
        panel.add(roleField);
        panel.add(new JLabel()); // Placeholder
        panel.add(addButton);

        getContentPane().add(BorderLayout.NORTH, titleLabel);
        getContentPane().add(BorderLayout.CENTER, panel);
        setVisible(false);
    }

    public String getName() {
        return nameField.getText();
    }

    public int getID() {
        return Integer.parseInt(idField.getText());
    }

    public String getRole() {
        return roleField.getText();
    }

    public void setAddAction(ActionListener listener) {
        addButton.addActionListener(listener);
    }
}
