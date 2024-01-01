import java.util.*;

public class target {
    public static void twoSum(int[] arr, int size) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        System.out.println("Enter the target value you want to search");
        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) { // Change j to start from i + 1
                if (arr[i] + arr[j] == target) {
                    System.out.println("arr[" + i + "] + arr[" + j + "] = " + target);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No values found that sum to the target value.");
        }
    }

    public static void main(String[] args) { // Correct the parameter type for the main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        twoSum(arr, size); // Call the twoSum method
    }
}
