import java.util.*;

public class Number_search {

    // Function to check if the array is sorted or not
    public static boolean isArraySorted(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Function for binary search
    public static void binarysearch(int arr[], int n, int num) {
        int f = 0, l = n - 1, mid, c = 0, ans = -1;
        while (f <= l) {
            mid = (f + l) / 2;
            if (arr[mid] == num) {
                c++;
                ans = mid;
                System.out.println("Index: " + ans);
                f = mid + 1; // Update 'f' to continue searching in the right half
            } else if (arr[mid] < num) {
                f = mid + 1;
            } else {
                l = mid - 1;
            }
        }
        if (c > 0) {
            System.out.println("The " + num + " is found " + c + " times");
        } else {
            System.out.println("The number is not found");
        }
    }

    // Function for linear search
    public static void linearsearch(int arr[], int n, int num) {
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                System.out.println("Position: " + (i + 1));
                c++;
            }
        }
        if (c > 0) {
            System.out.println("The number is found " + c + " times");
        } else {
            System.out.println("The number is not found");
        }
    }

    // Function to choose between binary search and linear search based on array sorted status
    public static void searching(int arr[], int n, int num) {
        if (isArraySorted(arr, n)) {
            System.out.println("Binary search");
            binarysearch(arr, n, num);
        } else {
            System.out.println("Linear search");
            linearsearch(arr, n, num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        System.out.println("\nEnter the array elements");
        for (int j = 0; j < size; j++) {
            arr1[j] = sc.nextInt();
        }
        System.out.println("How many times wants to search the number");
        int s = sc.nextInt();
        for (int i = 0; i < s; i++) {
            System.out.println("Enter the number wants to search");
            int num = sc.nextInt();
            searching(arr1, size, num);
        }
    }
}
