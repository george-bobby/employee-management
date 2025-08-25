package employeemanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class RemoveEmployeePage extends JFrame {
    private JTextField idField;
    private JButton removeButton;

    public RemoveEmployeePage() {
        setTitle("Remove Employee");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel titleLabel = new JLabel("Remove Employee");
        JLabel idLabel = new JLabel("ID:");

        idField = new JTextField(20);
        removeButton = new JButton("Remove");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        panel.add(idLabel);
        panel.add(idField);
        panel.add(new JLabel()); // Placeholder
        panel.add(removeButton);

        getContentPane().add(BorderLayout.NORTH, titleLabel);
        getContentPane().add(BorderLayout.CENTER, panel);
        setVisible(false);
    }

    public int getID() {
        return Integer.parseInt(idField.getText());
    }

    public void setRemoveAction(ActionListener listener) {
        removeButton.addActionListener(listener);
    }
}
