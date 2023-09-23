import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int rollNumber;
    private String name;
    private double[] grades;

    public Student(int rollNumber, String name, double[] grades) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grades = grades;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }
}

public class Management {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter number of grades: ");
        int numGrades = scanner.nextInt();
        double[] grades = new double[numGrades];
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter Grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        Student student = new Student(rollNumber, name, grades);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("Student Records:");
            for (Student student : students) {
                System.out.println("Roll Number: " + student.getRollNumber());
                System.out.println("Name: " + student.getName());
                System.out.println("Grades: ");
                for (double grade : student.getGrades()) {
                    System.out.print(grade + " ");
                }
                System.out.println("\n");
            }
        }
    }

    public static void main(String[] args) {
        Management recordManagement = new Management();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Record Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    recordManagement.addStudent();
                    break;
                case 2:
                    recordManagement.viewStudents();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
