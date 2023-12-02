package Practice_java;

import java.util.*;

public class ArrayCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        System.out.println("Enter the Size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Value of Number");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        System.out.println(("Enter the Operator\n+\t-\t*\t/\t%"));
        char oper = sc.nextLine().charAt(0);

        for (int i = 0; i < size; i++) {
            switch (oper) {
                case '+':
                    value = value + arr[i];
                    System.out.println("Output: " + value);
                    break;
                case '-':
                    value = value - arr[i];
                    System.out.println("Output: " + value);
                    break;
                case '*':
                    value = value * arr[i];
                    System.out.println("Output: " + value);
                    break;
                case '/':
                    System.out.println("Enter Two Different Number for result");
                    int number1 = sc.nextInt();
                    int Number2 = sc.nextInt();
                    value = number1 / Number2;
                    System.out.println("Output: " + value);
                    break;
                case '%':
                    System.out.println("Enter Two Different Number for result");
                    int number3 = sc.nextInt();
                    int Number4 = sc.nextInt();
                    value = number3 % Number4;
                    System.out.println("Output: " + value);
                    break;
                default:
                    System.out.println("Invalid Operator");
                    break;
            }
        }

    }
}
