import java.util.Scanner;

class checksort {

    void arrayCheck(int arr[], int size) {
        int count = 0;

        if (size <= 0|| size ==1) {
            System.out.println("Array is Sorted");
            return;
        } else {
            if (arr[size - 1] > arr[size - 2]) {
                count++;
                arrayCheck(arr, size - 1);
            }
        }
        if (count == size-1) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is Not Sorted");
        }
    }
}

public class CheckArraySory {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        checksort ob=new checksort();
        ob.arrayCheck(arr,arr.length);
    }
}
