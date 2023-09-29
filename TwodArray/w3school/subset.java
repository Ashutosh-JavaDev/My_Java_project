package w3school;
import java.util.Arrays;

public class subset {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 1, 4};

        boolean isSubset = isSubset(arr1, arr2);

        if (isSubset) {
            System.out.println("arr2 is a subset of arr1");
        } else {
            System.out.println("arr2 is not a subset of arr1");
        }
    }

    public static boolean isSubset(int[] arr1, int[] arr2) {
        // Sort both arrays to simplify the comparison
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0; // Index for arr1
        int j = 0; // Index for arr2

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] == arr2[j]) {
                i++;
                j++;
            } else {
                // If an element in arr1 is greater than the current element in arr2,
                // it means arr2 is missing this element, so it cannot be a subset.
                return false;
            }
        }

        // If we have successfully iterated through arr2, then arr2 is a subset of arr1
        return j == arr2.length;
    }
}
