import java.util.Scanner;

public class sumOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value in the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
