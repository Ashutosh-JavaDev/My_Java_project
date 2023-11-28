package Basic_Java.BufferInput;

import java.io.*;

public class Diamond {
    public static void diamond(int size) {
        for (int i = 1; i <= size; i++) {
            // Print spaces
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
         for (int i = size-1; i >=1; i--) {
            // Print spaces
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader sc = new BufferedReader(read);
        System.out.println("Enter the size");
        int size = Integer.parseInt(sc.readLine());
        diamond(size);
    }
}
