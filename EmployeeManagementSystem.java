import java.util.*;


// Employee class with attributes and method to display details of the employees
class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee(101, "Vinesh", 50000);
        Employee emp2 = new Employee(102, "Ram", 60000);
        Employee emp3 = new Employee(103, "Shiva", 55000);
        Employee emp4 = new Employee(103, "Umesh", 55000);

        // Storing them in a list
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        // Displaying details of all employees
        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
