import java.util.Scanner;

class checksort {

    void arrayCheck(int arr[], int size) {
        int count = 0;
        if (size <= 0 || size == 1) {
            // System.out.println("Array is Not Sorted");
            return;
        } else {
            if (arr[size - 1] > arr[size - 2]) {
                count++;
                arrayCheck(arr, size - 1);
                if (count == size - 1) {
                    System.out.println("Ascending Array Count");

                    System.out.println("Array is Sorted");
                }
            } else {
                System.out.println("Ascending Array Count");

                System.out.println("Array is Not Sorted");
            }
        }
    }

    // Decending
    void arrayDescendingCheck(int arr[], int size, int i) {
        int count = 0;
        i = 0;

        if (i == size - 1) {
            System.out.println("Descending Array Count");
            System.out.println("Array is Sorted");
            return;
        } else {
            if (arr[i] > arr[i + 1]) {
                count++;
                arrayDescendingCheck(arr, size, i + 1);
            } else {
                System.out.println("Descending Array Count");
                System.out.println("Array is Not Sorted");
            }
        }
    }
}

public class CheckArraySory {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        checksort ob = new checksort();
        int i = 0;
        if (arr[i] > arr[i + 1]) {
            ob.arrayDescendingCheck(arr, arr.length, i);
        } else {
            ob.arrayCheck(arr, arr.length);
        }

    }
}
