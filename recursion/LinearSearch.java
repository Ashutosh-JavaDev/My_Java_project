import java.util.Scanner;

class recursive {
    static boolean linear(int arr[], int target, int size) {
        if (size == arr.length) {
            System.out.println("Element not found");
            return false;
        } else if (arr[size] == target) {
            System.out.println("Element found at " + size);
            return true;
        }
        return linear(arr, target, size + 1);
    }
}

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        recursive ob = new recursive();
        ob.linear(arr, 2, 0);
    }
}
