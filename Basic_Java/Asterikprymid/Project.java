package Basic_Java.Asterikprymid;

import java.util.Scanner;

class GetterSetter {
    private String name;

    // Getter for name
    public String getName() {
       return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}

public class Project {
    public static void main(String[] args) {
        GetterSetter ani = new GetterSetter();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name:");
        String inputName = scanner.nextLine();
        
        ani.setName(inputName);
        
        System.out.println("The name set is: " + ani.getName());
        
        scanner.close();
    }
}
