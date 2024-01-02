import java.util.Scanner;
public class BinarySearchTree {

    public static int search(int arr[], int target, int s, int e) {
        if (s > e) {
            return -1;
        } else {
            int m = s + (e-s) / 2;
            if (arr[m] == target) {
                return m;
            } else if (target < arr[m]) {
                return search(arr, target, s, m-1);
            } else {
                return search(arr, target, m+1, e);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        // BinarySearch ob=new BinarySearch();
       int result= search(arr, 2, 0, arr.length - 1);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
