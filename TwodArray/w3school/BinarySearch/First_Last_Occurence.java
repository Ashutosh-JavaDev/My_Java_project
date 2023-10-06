package w3school.BinarySearch;
import java.util.*;

public class First_Last_Occurence {
    public static int First(int arr[], int size, int target) {
        int first = 0, last = size - 1;
        
        while (first <= last) {
            int mid = first + (last - first) / 2; // Calculate the middle index correctly
            
            if (arr[mid] < target) {
                first = mid + 1;
            } else if (arr[mid] >= target) { // Add this condition to find the first occurrence
                last = mid - 1;
            }
        }
        
        // Check if 'first' is still within bounds and points to the target value
        if (first < size && arr[first] == target) {
            return first;
        }
        
        return -1;
    }

    public static int Last(int arr[], int size, int target) {
        int first = 0, last = size - 1;
        
        while (first <= last) {
            int mid = first + (last - first) / 2; // Calculate the middle index correctly
            
            if (arr[mid] > target) {
                last = mid - 1;
            } else if (arr[mid] <= target) { // Add this condition to find the last occurrence
                first = mid + 1;
            }
        }
        
        // Check if 'last' is still within bounds and points to the target value
        if (last >= 0 && arr[last] == target) {
            return last;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the  array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the  array in sorted manner");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target Value");
        int target = sc.nextInt();
        
        int firstresult = First(arr, size, target);
        System.out.println("Target value: " + target + "\nFirst Occurrence: " + firstresult);
        
        int lastresult = Last(arr, size, target);
        System.out.println("Target value: " + target + "\nLast Occurrence: " + lastresult);
    }
}
