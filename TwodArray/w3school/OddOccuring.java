package w3school;
import java.util.Scanner;

public class OddOccuring{
    public static int findOddOccurring(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return arr[i];
            }
        }
        return -1; // Return -1 if no odd-occurring number is found
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

        int oddOccurringNumber = findOddOccurring(arr, size);

        if (oddOccurringNumber != -1) {
            System.out.println("Odd Occurring value: " + oddOccurringNumber);
        } else {
            System.out.println("No Odd Occurring Value Found");
        }
    }
}
