package w3school;
import java.util.*;

public class insert_value_in_middle {
    public static void insert(int arr[], int size, int pos, int num) {
        // Create a new array to accommodate the inserted value
        int temp[] = new int[size + 1];

        // Copy elements before the position
        for (int i = 0; i < pos; i++) {
            temp[i] = arr[i];
        }

        // Insert the new value at the specified position
        temp[pos] = num;

        // Copy elements after the position
        for (int i = pos + 1; i <= size; i++) {
            temp[i] = arr[i - 1];
        }

        System.out.println("New Inserted Array");
        for (int i = 0; i <= size; i++) {
            System.out.println(temp[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements in sorted way");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position where the new number should be inserted");
        int pos = sc.nextInt();
        System.out.println("Enter the number to be added");
        int num = sc.nextInt();
        insert(arr, size, pos, num);
    }
}
