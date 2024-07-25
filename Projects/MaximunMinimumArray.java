import java.util.Scanner;

class mimMax {
    int size, max = 0, min = 0;

    public int valuereturn(int arr[]) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    max = arr[i];
                    return max;
                } else if (arr[i] < arr[j]) {
                    min = arr[i];
                    return min;
                }
            }
        }
        return max;

    }
}

public class MaximunMinimumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Value in the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
