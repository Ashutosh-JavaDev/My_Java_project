import java.util.*;

public class ques2 {
    public static void find_array_sum(int[] arr1, int[] arr2, int n, int m) {
        int k = Math.max(n, m); // Determine the size of arr3 as the maximum of n and m
        int[] arr3 = new int[k];

        // Calculate the sum of corresponding elements from arr1 and arr2 and store in arr3
        for (int i = 0; i < n; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < m; i++) {
            arr3[i] += arr2[i];
        }

        System.out.println("Sum of Array 1 and Array 2 (Stored in Array 3):");
        for (int i = k-1; i >= 0; i--) {
            System.out.print(arr3[i] + " ");//the output in reverse order
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of first array:");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements in first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of second array:");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements in second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        find_array_sum(arr1, arr2, size1, size2);
    }
}
