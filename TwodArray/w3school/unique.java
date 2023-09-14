package w3school;
import java.util.*;

public class unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements");
        
        // Input array elements
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("The unique elements are: ");
        for (int i = 0; i < size; i++) {
            boolean isUnique = true; // Assume the element is unique

            // Check if the element is the same as any subsequent elements
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false; // Mark as not unique
                    break;
                }
            }

            // If the element is unique, print it
            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
