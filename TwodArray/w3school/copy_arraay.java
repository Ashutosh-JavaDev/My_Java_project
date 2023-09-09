package w3school;
import java.util.*;

public class copy_arraay {
    public static void Firstarray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void Secondarray(int temp[], int n) {
        System.out.println("The Second Array is:");
        Firstarray(temp, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The First Array is:");
        Firstarray(arr, size);
        Secondarray(arr, size);
    }
}
