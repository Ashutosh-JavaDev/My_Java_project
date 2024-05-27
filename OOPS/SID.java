
//WAP to Search Insert and Delete in java.
import java.util.Scanner;

class ScanningClass {
    private int value;

    public void scan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you wants to search");
        value = sc.nextInt();
    }
    public int getvlaue(){
        return value;
    }
}

class Search extends ScanningClass {
    public int search(int arr[], int size) {
        scan();
        int valuetoget=getvlaue();
        int pos = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == valuetoget) {
                pos = i;
            }
        }
        return pos;

    }
}

public class SID {

}
