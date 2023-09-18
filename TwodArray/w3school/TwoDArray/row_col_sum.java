package TwodArray.w3school.TwoDArray;
import java.util.*;

public class row_col_sum {
    public static void original(int arr[][], int size) {
        System.out.println("Original Array");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void row(int arr1[][], int size) {
        int rsum[] = new int[size];
        for (int i = 0; i < size; i++) {
            rsum[i] = 0;
            for (int j = 0; j < size; j++) {
                rsum[i] = rsum[i] + arr1[i][j];
            }
        }
        // Print row sums
        for (int i = 0; i < size; i++) {
            System.out.println("Sum of row " + i + ": " + rsum[i]);
        }
    }

    public static void col(int arr3[][], int size) {
        int csum[] = new int[size];
        for (int i = 0; i < size; i++) {
            csum[i] = 0;
            for (int j = 0; j < size; j++) {
                csum[i] = csum[i] + arr3[j][i];
            }
        }
        // Print column sums
        for (int i = 0; i < size; i++) {
            System.out.println("Sum of column " + i + ": " + csum[i]);
        }
    }

    public static void call(int arr2[][], int size) {
        original(arr2, size); // Print the original array
        row(arr2, size);      // Calculate and print row sums
        col(arr2, size);      // Calculate and print column sums
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();
        int arr[][] = new int[size][size];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        call(arr, size); // Call the function to perform calculations
    }
}
