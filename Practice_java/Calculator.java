package Practice_java;

import java.util.*;

public class Calculator {
    public static void calculator(int Number1, int Number2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Operator\n+\t-\t*\t/\t%");
        char operator = sc.nextLine().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Answer: " + (Number1 + Number2));
                break;
            case '-':
                System.out.println("Answer:  " + (Number1 - Number2));
                break;

            case '*':
                System.out.println("Answer: " + (Number1 * Number2));
                break;
            case '/':
                System.out.println("Answer: " + (Number1 / Number2));
                break;

            case '%':
                System.out.println("Answer: " + (Number1 % Number2));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Different Number");
        int Number1 = sc.nextInt();
        int Number2 = sc.nextInt();
        calculator(Number1, Number2);
    }
}
