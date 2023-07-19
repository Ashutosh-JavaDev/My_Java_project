import java.util.*;

public class sorted_switch_case_algorithm {

    // Function to perform Bubble Sort on the given array in ascending or descending order
    public static void bubbleSort(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // User interaction to choose the sorting order
        System.out.println("Press 1: Sort the array in ascending order");
        System.out.println("Press 2: Sort the array in descending order");
        System.out.println("Press 3: Display the original unsorted array");
        System.out.println("Press 4: Exit the program");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                // Bubble Sort in ascending order
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
                // Bubble Sort in descending order
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

        // Display the sorted or unsorted array
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
