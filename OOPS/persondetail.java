import java.util.Scanner;

class Person {
    String name, address, postOffice, policeStation, dob;
    int age;
    long mob_number;

    public void printName() {
        System.out.println("Name: " + name);
    }

    public void printAddress() {
        System.out.println("Address: " + address);
    }

    public void printPostOffice() {
        System.out.println("Post Office: " + postOffice);
    }

    public void printPoliceStation() {
        System.out.println("Police Station: " + policeStation);
    }

    public void printDOB() {
        System.out.println("DOB: " + dob);
    }

    public void printAge() {
        System.out.println("Age: " + age);
    }

    public void printMobile() {
        System.out.println("Mobile number: " + mob_number);
    }
}

public class persondetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person info = new Person();

        System.out.println("Enter your Name:");
        info.name = sc.nextLine();

        System.out.println("Enter your Date of Birth (DD-MM-YYYY):");
        info.dob = sc.nextLine();

        System.out.println("Enter your Address:");
        info.address = sc.nextLine();

        System.out.println("Enter your Mob_Number:");
        info.mob_number = sc.nextLong();
        sc.nextLine(); // Consume the newline left by nextLong()

        System.out.println("Enter your Age:");
        info.age = sc.nextInt();
        sc.nextLine(); // Consume the newline left by nextInt()

        System.out.println("Enter your PostOffice:");
        info.postOffice = sc.nextLine();

        System.out.println("Enter your Police Station:");
        info.policeStation = sc.nextLine();
		System.out.println("---------------------------------------------------------------------------------------");
        info.printName();
        info.printDOB();
        info.printAddress();
        info.printMobile();
        info.printAge();
        info.printPostOffice();
        info.printPoliceStation();

        // Close the scanner to release resources
        sc.close();
    }
}
