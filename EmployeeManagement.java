package employeemanagement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeManagement {

    public static void main(String[] args) {
        // Initialize all pages
        EmployeeManagementPage employeeManagementPage = new EmployeeManagementPage();
        AddEmployeePage addEmployeePage = new AddEmployeePage();
        UpdateEmployeePage updateEmployeePage = new UpdateEmployeePage();
        RemoveEmployeePage removeEmployeePage = new RemoveEmployeePage();
        ViewEmployeesPage viewEmployeesPage = new ViewEmployeesPage();

        // Action for "Add Employee" button
        employeeManagementPage.setAddEmployeeAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addEmployeePage.setVisible(true);
            }
        });

        // Action for "Update Employee" button
        employeeManagementPage.setUpdateEmployeeAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEmployeePage.setVisible(true);
            }
        });

        // Action for "Remove Employee" button
        employeeManagementPage.setRemoveEmployeeAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeEmployeePage.setVisible(true);
            }
        });

        // Action for "View Employees" button
        employeeManagementPage.setViewEmployeesAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewEmployeesPage.displayEmployees();
                viewEmployeesPage.setVisible(true);
            }
        });

        // Action for the "Add" button on the AddEmployeePage
        addEmployeePage.setAddAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = addEmployeePage.getName();
                int id = addEmployeePage.getID();
                String role = addEmployeePage.getRole();
                EmployeeDAO.addEmployee(name, id, role);
                addEmployeePage.setVisible(false);
            }
        });

        // Action for the "Update" button on the UpdateEmployeePage
        updateEmployeePage.setUpdateAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = updateEmployeePage.getID();
                String newRole = updateEmployeePage.getNewRole();
                EmployeeDAO.updateEmployeeRole(id, newRole);
                updateEmployeePage.setVisible(false);
            }
        });

        // Action for the "Remove" button on the RemoveEmployeePage
        removeEmployeePage.setRemoveAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = removeEmployeePage.getID();
                EmployeeDAO.removeEmployee(id);
                removeEmployeePage.setVisible(false);
            }
        });
    }
}
