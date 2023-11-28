// Write a Java program to compute the average value of an array of integers except the largest and smallest values.
package Basic_Java.BufferInput;

import java.io.*;

public class Average_Except_LArgest_Smallest {
    public static void average(int arr[], int size) {
        int sum = 0;
        float avg = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        // Sum
        for (int i = 0; i < size; i++) {
            if (arr[i] != max && arr[i] != min) {
                sum += arr[i];
            }
        }
        // Average
        avg = (float) sum / (size - 2);
        System.out.println("MAx:    " + max);
        System.out.println("Min:    " + min);
        System.out.println("Sum of Given Number Except The Minimun and Maximum is : " + sum);
        System.out.println("Average of Given Number Sum Except the Minimum and Maximun is : " + avg);
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader sc = new BufferedReader(read);
        System.out.println("Enter the Size of the Array");
        int size = Integer.parseInt(sc.readLine());
        int arr[] = new int[size];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(sc.readLine());
        }
        average(arr, size);
    }
}
