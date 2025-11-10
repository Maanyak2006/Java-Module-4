// Employee.java
class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
    }
}

// Manager.java
class Manager extends Employee {
    String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 75000.00, "Sales");
        System.out.println("Details of the Manager:");
        manager.displayInfo();
    }
}
