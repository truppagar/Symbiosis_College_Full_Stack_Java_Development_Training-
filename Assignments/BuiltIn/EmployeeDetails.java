package BuiltIn;
import java.util.*;

class Employee {
    int empId;
    String name;
    double salary;
    String location;

    public Employee(int empId, String name, double salary, String location) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId + ", Name: " + name + ", Salary: " + salary + ", Location: " + location;
    }
}

class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void sortEmployees(Comparator<Employee> comparator) {
        Collections.sort(employees, comparator);
    }

    public Employee searchEmployeeById(int empId) {
        for (Employee emp : employees) {
            if (emp.empId == empId) {
                return emp;
            }
        }
        return null;
    }

    public void displayEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

public class EmployeeDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(new Employee(1, "Trupti", 70000, "New York"));
        manager.addEmployee(new Employee(2, "Radhi", 50000, "California"));
        manager.addEmployee(new Employee(3, "Hridha", 60000, "Texas"));

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Sort by ID");
            System.out.println("2. Sort by Name");
            System.out.println("3. Sort by Salary");
            System.out.println("4. Sort by Location");
            System.out.println("5. Search Employee by ID");
            System.out.println("6. Display All Employees");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    manager.sortEmployees(Comparator.comparingInt(emp -> emp.empId));
                    System.out.println("Employees sorted by ID:");
                    manager.displayEmployees();
                    break;
                case 2:
                    manager.sortEmployees(Comparator.comparing(emp -> emp.name));
                    System.out.println("Employees sorted by Name:");
                    manager.displayEmployees();
                    break;
                case 3:
                    manager.sortEmployees(Comparator.comparingDouble(emp -> emp.salary));
                    System.out.println("Employees sorted by Salary:");
                    manager.displayEmployees();
                    break;
                case 4:
                    manager.sortEmployees(Comparator.comparing(emp -> emp.location));
                    System.out.println("Employees sorted by Location:");
                    manager.displayEmployees();
                    break;
                case 5:
                    System.out.print("Enter Employee ID to search: ");
                    int idToSearch = sc.nextInt();
                    Employee emp = manager.searchEmployeeById(idToSearch);
                    if (emp != null) {
                        System.out.println("Employee found: " + emp);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 6:
                    System.out.println("All Employees:");
                    manager.displayEmployees();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
