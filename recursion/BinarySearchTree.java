import java.util.Scanner;

class BinaryTree {
    int search(int arr[], int target, int s, int e) {
        if (s > e) {
            System.out.println("Element Not Found");
            return -1;
        } else {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                System.out.println("Element found at Index: " + m);
                return m;
            } else if (target < arr[m]) {
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }
        }

    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        BinaryTree ob = new BinaryTree();
        ob.search(arr, 2, 0, arr.length - 1);
    }
}
