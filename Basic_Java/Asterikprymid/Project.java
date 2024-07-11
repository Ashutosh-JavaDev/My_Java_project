package Basic_Java.Asterikprymid;

import java.util.Scanner;

class Animal {
    String name;
    String Gender;
    int age;

    public void values() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the Animal");
        name = sc.nextLine();
        System.out.println("Enter the Gender");
        Gender = sc.nextLine();
        System.out.println("Enter Age");
        age = sc.nextInt();
        System.out.println("Name: " + name + "Gender " + Gender + " Age " + age);

    }
}

public class Project {
    public static void main(String[] args) {
        Animal ani=new Animal();
        ani.values();
    }
}
