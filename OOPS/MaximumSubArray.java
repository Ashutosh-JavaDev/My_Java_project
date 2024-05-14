import java.util.Scanner;

class subArraySum {
    public static void sumSubArray(int arr[], int size) {
        int sum = 0;
        int currentSum = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                sum = arr[i] + arr[j];
                if (sum > currentSum) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                    currentSum = sum;
                }
                sum = 0;
            }
        }
    }
}

public class MaximumSubArray {

}
