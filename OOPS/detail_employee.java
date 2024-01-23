import java.util.*;

class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}

public class detail_employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee input = new Employee();

        System.out.println("Enter the name:");
        input.name = sc.nextLine();

        System.out.println("Enter the salary:");
        input.salary = sc.nextInt();

        // Consume the newline character left in the buffer
        sc.nextLine();

        System.out.println("Enter the new name:");
        String newName = sc.nextLine();
        input.setName(newName);

        System.out.println("Name: " + input.getName());
        System.out.println("Salary: " + input.getSalary());
        System.out.println("New Name: " + input.getName());
    }
}
