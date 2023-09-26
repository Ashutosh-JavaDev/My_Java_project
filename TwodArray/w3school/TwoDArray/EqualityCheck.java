package w3school.TwoDArray;
import java.util.*;

public class EqualityCheck {
    public static void check(int arr1[][], int size) {
        System.out.println("Original Array");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr1[i][j] + " "); // Added space to separate elements
            }
            System.out.println(); // Add a newline after each row
        }
    }

    public static void equality(int arr1[][], int arr2[][], int size) {
        int c = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Fix the bug here: Use '==' for comparison, not '='
                if (arr1[i][j] == arr2[i][j]) {
                    c++;
                }
            }
        }
        if (c == size * size) { // Check if all elements match
            System.out.println("Both Matrices Are Same");
        } else {
            System.out.println("Both Matrices Are Different");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        
        int arr1[][] = new int[size][size];
        System.out.println("Enter the First Array Elements");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        
        int arr2[][] = new int[size][size];
        System.out.println("Enter the Second Array Elements");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // Pass both arrays to the equality method
        check(arr1, size);
        equality(arr1, arr2, size);
    }
}
