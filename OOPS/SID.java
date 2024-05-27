
//WAP to Search Insert and Delete in java.
import java.util.Scanner;

class Search {
    public int position(int arr[], int size, int target) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you wants to search");
        target = sc.nextInt();
        int pos = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                pos = i;
            }
        }
        return pos;

    }
}

public class SID {

}
