import java.util.Scanner;

class checksort {

    void arrayCheck(int arr[], int size) {
        int count = 0;
        System.out.println("Ascending Array Count");

        if (size <= 0 || size == 1) {
            // System.out.println("Array is Not Sorted");
            return;
        } else {
            if (arr[size - 1] > arr[size - 2]) {
                count++;
                arrayCheck(arr, size - 1);
                if (count == size - 1) {
                    System.out.println("Array is Sorted");
                }
            } else {
                System.out.println("Array is Not Sorted");
            }
        }
    }

    // Decending
    void arrayDescendingCheck(int arr[], int size, int i) {
        int count = 0;
        i = 0;
        System.out.println("Descending Array Count");

        if (i == size) {
            // System.out.println("Array is Not Sorted");
            return;
        } else {
            if (arr[i] < arr[i + 1]) {
                count++;
                arrayDescendingCheck(arr, size, i + 1);
                if (count == size - 1) {
                    System.out.println("Array is Sorted");
                }
            } else {
                System.out.println("Array is Not Sorted");
            }
        }
    }
}

public class CheckArraySory {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 5 };
        checksort ob = new checksort();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i + 1]) {
                ob.arrayDescendingCheck(arr, arr.length, i);
            } else {
                ob.arrayCheck(arr, arr.length);
            }
        }

    }
}
