package Basic_Java.BufferInput;

import java.io.*;

public class FourCombinedSum {
    public static void Result(int targetSum, int size, BufferedReader sc) throws IOException {
        int arr[] = new int[size];
        int c = 0;
        int output = 0;

        // Initialize array elements
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(sc.readLine());
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    for (int l = k + 1; l < size; l++) {
                        output = arr[i] + arr[j] + arr[k] + arr[l];
                        if (output == targetSum) {
                            System.out.println(arr[i] + " + " + arr[j] + " + " + arr[k] + " + " + arr[l] + " = " + targetSum);
                        } else {
                            c++;
                        }
                    }
                }
            }
        }
        if (c>0) {
            System.out.println("No Combination Found");
        }
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader sc = new BufferedReader(read);

        System.out.println("Enter the Size");
        int size = Integer.parseInt(sc.readLine());

        System.out.println("Enter the  Number");
        int Number=Integer.parseInt(sc.readLine());
        System.out.println("Enter the Array Elements");
        Result(Number, size, sc); // Pass targetSum as 0 since you're going to read the array elements first
    }
}
