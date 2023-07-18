/*User Interaction: Using a switch case, the program will provide the following options:
a. "1" - Sort the array in ascending order using the Bubble Sort algorithm.
b. "2" - Sort the array in descending order using the Bubble Sort algorithm.
c. "3" - Display the original unsorted array.
d. "4" - Exit the program.*/
import java.util.Scanner;

public class sorted_switch_case_algorithm {
    public static void bubbleSort(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Press 1: Sort the array in ascending order");
        System.out.println("Press 2: Sort the array in descending order");
        System.out.println("Press 3: Display the original unsorted array");
        System.out.println("Press 4: Exit the program");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - 1 - i; j++) {
                        if (arr[j] > arr[j + 1]) {
                            // Swap
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.println("Sorted array in ascending order:");
                break;

            case 2:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - 1 - i; j++) {
                        if (arr[j] < arr[j + 1]) {
                            // Swap
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.println("Sorted array in descending order:");
                break;

            case 3:
                System.out.println("Original unsorted array:");
                break;

            case 4:
                System.out.println("Exiting the program...");
                return;

            default:
                System.out.println("Invalid option! Exiting the program...");
                return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times do you want to check the array?");
        int s = sc.nextInt();
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        for (int i = 0; i < s; i++) {
            int[] arr = new int[size];
            bubbleSort(arr, size);
        }
    }
}
