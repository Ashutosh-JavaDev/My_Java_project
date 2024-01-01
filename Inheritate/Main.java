package Inheritate;
import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    private int employeeId;
    private String jobTitle;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    // Override getLastName to include job title
    @Override
    public void setLastName(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of Employee
        Employee employee = new Employee();

        // Input information for Person
        System.out.println("Enter First Name:");
        employee.setFirstName(scanner.nextLine());

        System.out.println("Enter Last Name:");
        employee.setLastName(scanner.nextLine());

        // Input information specific to Employee
        System.out.println("Enter Employee ID:");
        employee.setEmployeeId(scanner.nextInt());
        scanner.nextLine(); // Consume the newline character left in the buffer

        System.out.println("Enter Job Title:");
        employee.setLastName(scanner.nextLine());

        // Display information
        System.out.println("\nEmployee Information:");
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Job Title: " + employee.getJobTitle());
    }
}
