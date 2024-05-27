
//WAP to Search Insert and Delete in java.
import java.util.Scanner;

class Search {
    public int search(int arr[], int size) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you wants to search");
        int value = sc.nextInt();
        int pos = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                pos = i;
            }
        }
        return pos;

    }
}

public class SID {

}
