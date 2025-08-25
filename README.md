# Employee Management System

A simple, desktop-based Employee Management System built with Java Swing and connected to a MySQL database. This application provides a graphical user interface (GUI) to perform basic CRUD (Create, Read, Update, Delete) operations on employee records.


---

## ✨ Features

* **Add Employee:** Add a new employee with a name, ID, and role to the database.
* **View Employees:** Display a list of all employees currently in the database.
* **Update Employee:** Modify the role of an existing employee using their ID.
* **Remove Employee:** Delete an employee's record from the database.

---

## 🛠️ Technologies Used

* **Frontend:** Java Swing
* **Backend:** Java
* **Database:** MySQL
* **Connector:** JDBC (Java Database Connectivity)

---

## 🚀 Getting Started

Follow these instructions to get a copy of the project up and running on your local machine.

### Prerequisites

Make sure you have the following software installed:

* **Java Development Kit (JDK):** Version 8 or higher.
* **MySQL Server:** To host the application's database.
* **MySQL JDBC Driver:** The `.jar` file to connect Java with MySQL.
* **An IDE:** A Java IDE like IntelliJ IDEA, Eclipse, or VS Code with Java extensions.

### Backend Configuration

1.  **Start MySQL Server:** Ensure your MySQL server is running. You can use a tool like XAMPP, WAMP, or install it directly.

2.  **Create the Database:** Open your MySQL client (like phpMyAdmin, MySQL Workbench, or the command line) and run the following command to create the database:
    ```sql
    CREATE DATABASE employeedb;
    ```

3.  **Create the `employees` Table:** After creating the database, select it and run this SQL command to create the necessary table:
    ```sql
    USE employeedb;

    CREATE TABLE employees (
        name VARCHAR(100) NOT NULL,
        id INT PRIMARY KEY,
        role VARCHAR(100) NOT NULL
    );
    ```

### How to Run the Application

1.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/your-username/employee-management-system.git](https://github.com/your-username/employee-management-system.git)
    ```

2.  **Open in IDE:** Open the cloned project folder in your preferred Java IDE.

3.  **Add JDBC Driver:** Add the MySQL JDBC Driver `.jar` file to your project's build path or library dependencies. The process varies by IDE:
    * **IntelliJ IDEA:** Go to `File` > `Project Structure` > `Modules` > `Dependencies` > `+` > `JARs or directories...` and select the driver file.
    * **Eclipse:** Right-click the project > `Build Path` > `Configure Build Path` > `Libraries` > `Add External JARs...` and select the driver file.

4.  **Configure Database Connection:**
    * Navigate to the `DatabaseManager.java` file.
    * Verify that the `URL`, `USERNAME`, and `PASSWORD` constants match your MySQL setup. The default password is often empty (`""`) for local setups like XAMPP.
    ```java
    class DatabaseManager {
        private static final String URL = "jdbc:mysql://localhost:3306/employeedb";
        private static final String USERNAME = "root";
        private static final String PASSWORD = ""; // <-- Change this if you have a password
    }
    ```

5.  **Run the Main Class:**
    * Locate the `EmployeeManagement.java` file.
    * Run the `main` method within this file to start the application.

---

