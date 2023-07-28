//Given a sorted array and a target element, find the index where the target should be inserted to maintain the sorted order using binary search.
import java.util.*;
public class SearchInsertPosition {
    public static int searchInsertPosition(int[] arr, int target) {
        int f = 0;
        int l = arr.length - 1;
        while (f<=l) {
            int mid = (f+l) / 2;
            if (arr[mid] == target) {
                return (mid+1);
            } else if (arr[mid] < target) {
                f = mid + 1;
            } else {
                l = mid - 1;
            }
        }
        return (f+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the sorted array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
		System.out.println("How many times want to search the number");
		int s=sc.nextInt();
		for(int i=0;i<s;i++){
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
		 int insertPosition = searchInsertPosition(arr, target);
        System.out.println("The target should be inserted at index: " + insertPosition);
		}
    }
}
