package Practice_java;

import java.util.*;

public class Concatinate {
    public static void result(String arr[], int size) {
        String newString = "";
        for (int i = 0; i < size; i++) {
            newString = newString + " " + arr[i];
        }
        System.out.println(newString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the approx value of line you will right");
        int size = sc.nextInt();
        // Consume the newline character left in the buffer
        sc.nextLine();
        String arr[] = new String[size];
        System.out.println("Enter the Sentences");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLine();
        }
        result(arr, size);
    }

}
