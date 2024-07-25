import java.util.Scanner;

class mimMax {

    public void valuereturn(int arr[], int size) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < size; i++) {

            if (arr[i] > max) {
                max = arr[i];

            }
            if (arr[i] < min) {
                min = arr[i];

            }

        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);

    }
}

public class MaximunMinimumArray {
    public static void main(String[] args) {
        mimMax ob = new mimMax();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Value in the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        ob.valuereturn(arr, size);
    }
}
