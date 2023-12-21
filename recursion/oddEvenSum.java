import java.util.*;

public class oddEvenSum {
    public static int add(int arr[], int size) {
        if (size <= 0) {
            return 0;
        }

        // int currentNumber = arr[size - 1];
        // int recursiveSum = add(arr, size - 1);

        if(arr[size-1]%2==0){
            return add(arr, size-1)+arr[size-1];
        } else {
            return add(arr, size-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Values");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int answer = add(arr, size);
        System.out.println("Sum of even numbers: " + answer);
    }
}
