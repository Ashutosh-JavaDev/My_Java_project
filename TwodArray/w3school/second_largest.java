package w3school;
import java.util.*;

public class second_largest {
    public static void secondLargest(int arr[], int size) {
        if (size < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int max = arr[0];
        int sec_max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                sec_max = max;
                max = arr[i];
            } else if (arr[i] > sec_max && arr[i] != max) {
                sec_max = arr[i];
            }
        }

        if (sec_max == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Maximun:        "+max);
            System.out.println("Second Largest: " + sec_max);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        secondLargest(arr, size);
    }
}
