package Basic_Java.Asterikprymid;

import java.util.Scanner;
class Animal{
    String name;
    String Gender;
    int age;
    public void values(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name of the Animal");
        name=sc.nextLine();
    }
}
public class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value till the Number wants to print");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("The Sum of " + number + " number is " + sum);
    }
}
