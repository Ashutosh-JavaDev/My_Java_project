//Write a Java program to calculate the average value of array elements.

import java.util.*;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        float arr[] = new float[size];
        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextFloat();
        }
        float sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        float average = sum / size;

        System.out.println("The sum of " + size + " numbers is: " + sum);
        System.out.println("The average of the numbers is: " + average);
    }
}
