package w3school;
import java.util.*;
public class duplicate {
    // Function to count the total number of duplicate elements in an array
    public static int countDuplicates(int arr[], int size) {
        int count = 0;
        System.out.print("The duplicate elements are : ");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j] && i != j) {
                    count++;
                    System.out.print(arr[i]+" ");
                }
            }
        }
        return count;
    }

   public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int totalDuplicates = countDuplicates(arr, size);
        System.out.println("\nThe Total Duplicate Elements are: " + totalDuplicates);
    }
}
