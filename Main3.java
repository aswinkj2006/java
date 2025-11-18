// Employee.java
class Employee {
    // Private attributes (encapsulation)
    private int empId;
    private String name;
    private double salary;

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Getter and Setter methods
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Department.java
class Department {
    // Private attributes
    private int deptId;
    private String deptName;

    // Constructor
    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    // Getter and Setter methods
    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    // Method to display department details
    public void displayDepartmentDetails() {
        System.out.println("Department ID: " + deptId);
        System.out.println("Department Name: " + deptName);
    }
}

// Main.java
public class Main3 {
    public static void main(String[] args) {

        // Create a Department
        Department dept = new Department(101, "IT");
	dept.getDeptName();

        // Create multiple Employees
        Employee emp1 = new Employee(1, "Alice", 50000);
        Employee emp2 = new Employee(2, "Bob", 55000);

        // Display department details
        System.out.println("\nDepartment Details:");
        dept.displayDepartmentDetails();
        System.out.println();

	//Change Employee Details or Dept Details
	emp1.setEmpId(3);
	emp1.setSalary(42300);

	emp2.setName("Manav");
	emp2.getSalary();

        // Display employee details
        System.out.println("\nEmployee Details:");
        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();
    }
}
