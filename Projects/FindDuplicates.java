import java.util.Scanner;

public class FindDuplicates {
    int arr[], size;

    FindDuplicates() {
        Duplicates();
    }

    public void Duplicates() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter the Value in Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    System.out.println("Duplicates: "+arr[j]+" ");
                }
            }
        }
        System.out.println("Number of Duplicates: "+count);
    }

    public static void main(String[] args) {
        new FindDuplicates();
    }
}