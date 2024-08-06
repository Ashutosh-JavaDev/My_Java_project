import java.util.Scanner;

public class FindDuplicates {
    int arr[], size;

    FindDuplicates() {
        Duplicates();
    }

    public void Duplicates() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        size=sc.nextInt();
    }

    public static void main(String[] args) {
        new FindDuplicates();
    }
}
