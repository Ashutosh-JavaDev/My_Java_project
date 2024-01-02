import java.util.Scanner;

class BinaryTree {
    int search(int arr[], int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (s + e) / 2;

        if (arr[m] == target) {
            return m;
        }
        else if(target<arr[m]){
           return search(arr, target, s, m-1);
        }
        else{
           return search(arr, target, m+1, e);
        }

    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        BinarySearch ob=new BinarySearch();
        ob.search(arr, 2, 0, arr.length-1);
    }
}
